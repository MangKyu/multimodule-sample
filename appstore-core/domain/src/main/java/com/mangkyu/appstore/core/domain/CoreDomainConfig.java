package com.mangkyu.appstore.core.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EntityScan(basePackageClasses = CoreDomainConfig.class)
@EnableJpaRepositories(basePackageClasses = CoreDomainConfig.class)
public class CoreDomainConfig {
}
