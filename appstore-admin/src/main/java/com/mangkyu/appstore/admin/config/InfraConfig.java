package com.mangkyu.appstore.admin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.mangkyu.appstore.core.infra.jasypt.JasyptConfig;
import com.mangkyu.appstore.core.infra.jpa.JpaConfig;

@Configuration(proxyBeanMethods = false)
@Import({
	JpaConfig.class,
	// AsyncConfig.class,
	JasyptConfig.class,
})
class InfraConfig {
}
