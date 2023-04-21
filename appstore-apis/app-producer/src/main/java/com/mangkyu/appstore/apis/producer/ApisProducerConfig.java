package com.mangkyu.appstore.apis.producer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mangkyu.appstore.core.domain.CoreDomainConfig;


@Import({CoreDomainConfig.class})
@EnableTransactionManagement
@EntityScan
@EnableJpaRepositories
@SpringBootApplication
public class ApisProducerConfig {
}
