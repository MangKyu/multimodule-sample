package com.mangkyu.appstore.core.infra.jasypt;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class JasyptConfigTest {

	@Test
	void string암호화() {
		StringEncryptor encryptor = new JasyptConfig().jasyptStringEncryptor();
		String privateKey = "myKey";

		String enc = encryptor.encrypt(privateKey);
		log.info("enc = ENC({})", enc);
		log.info("dec = {}", encryptor.decrypt(enc));
	}

}