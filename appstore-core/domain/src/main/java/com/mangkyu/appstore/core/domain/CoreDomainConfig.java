package com.mangkyu.appstore.core.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EntityScan
@EnableJpaRepositories
public class CoreDomainConfig {
}
