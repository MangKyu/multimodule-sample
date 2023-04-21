package com.mangkyu.appstore.apis.producer;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mangkyu.appstore.core.domain.CoreDomainConfig;

@SpringBootApplication(scanBasePackageClasses = {ApisProducerConfig.class, CoreDomainConfig.class})
public class ApisProducerConfig {
}
