package com.mangkyu.appstore.core.infra.jasypt;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.context.annotation.Bean;

public class JasyptConfig {

	final static String KEY = "default!23";

	final static String ALGORITHM = "PBEWithMD5AndDES";

	@Bean
	public StringEncryptor jasyptStringEncryptor() {
		PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
		SimpleStringPBEConfig config = new SimpleStringPBEConfig();
		config.setPassword(KEY);
		config.setAlgorithm(ALGORITHM);
		config.setPoolSize(100);
		encryptor.setConfig(config);
		return encryptor;
	}

}