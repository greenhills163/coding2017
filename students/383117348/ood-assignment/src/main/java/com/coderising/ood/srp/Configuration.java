package com.coderising.ood.srp;
import java.util.HashMap;
import java.util.Map;

public class Configuration {

	static Map<String,Object> configurations = new HashMap<String, Object>();
	static{
		configurations.put(ConfigurationKeys.SMTP_SERVER, "smtp.163.com");
		configurations.put(ConfigurationKeys.ALT_SMTP_SERVER, "smtp1.163.com");
		configurations.put(ConfigurationKeys.EMAIL_ADMIN, "admin@company.com");
		configurations.put(ConfigurationKeys.IS_EMAIL_DEBUG, false);
	}
	/**
	 * 应该从配置文件读， 但是这里简化为直接从一个map 中去读
	 * @param key
	 * @return
	 */
	public Object getProperty(String key) {
		
		return configurations.get(key);
	}

}
