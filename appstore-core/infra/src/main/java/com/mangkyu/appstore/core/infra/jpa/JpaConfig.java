package com.mangkyu.appstore.core.infra.jpa;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EntityScan("com.mangkyu.appstore")
@EnableJpaRepositories("com.mangkyu.appstore")
public class JpaConfig {
}
