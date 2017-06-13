package com.greenhills;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 写一个程序， 读取一个.class文件的前4个字节， 转换成十六进制字符，检查是不是：CAFEBABE
 * @author Administrator
 *
 */
public class ReadFile {
	public static void main(String[] args) {
		int[] result2=ReadFile.readFile("C:\\ReadFile.class",0,4);
		for(int i:result2){
			System.out.print(Integer.toHexString(i).toUpperCase()+",");
		}
	}
	
	/**
	 * 读取文件的指定字节长度
	 * 
	 * ReadFile.java
	 * @param @param fileName  文件名
	 * @param @param off 偏移字节数
	 * @param @param readLength 读取字节长度
	 * @param @return 读取结果数组
	 * @author greenhills
	 * 2017年2月19日 上午11:05:14
	 */
	public static int[] readFile(String fileName,int off,int readLength){
		int[] result=new int[readLength]; 
		try {
			InputStream in = new FileInputStream(new File(fileName));
			in.skip(off);
			for(int i=0;i<readLength;i++){
				result[i]=in.read();
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	} 
}
