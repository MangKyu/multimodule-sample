package com.mangkyu.appstore.apis.consumer.config;

import org.springframework.context.annotation.Configuration;

import com.mangkyu.appstore.core.infra.AppStoreConfigGroup;
import com.mangkyu.appstore.core.infra.EnableAppStoreConfig;

@Configuration(proxyBeanMethods = false)
@EnableAppStoreConfig({
	AppStoreConfigGroup.ASYNC,
	AppStoreConfigGroup.JASYPT,
	AppStoreConfigGroup.JPA,
})
class InfraConfig {
}
