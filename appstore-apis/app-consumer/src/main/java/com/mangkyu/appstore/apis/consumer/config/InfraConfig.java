package com.mangkyu.appstore.apis.consumer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.mangkyu.appstore.core.infra.async.AsyncConfig;
import com.mangkyu.appstore.core.infra.jasypt.JasyptConfig;

@Configuration
@Import({
	AsyncConfig.class,
	JasyptConfig.class,

})
public class InfraConfig {
}
