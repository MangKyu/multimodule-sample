package com.mangkyu.appstore.batch.apps.activecount;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

import com.mangkyu.appstore.core.domain.app.AppRepository;

import lombok.RequiredArgsConstructor;

@Configuration(proxyBeanMethods = false)
@RequiredArgsConstructor
@EnableBatchProcessing
class CountActiveAppBatchConfig {

	private final JobBuilder jobBuilder;
	private final AppRepository appRepository;
	private final JobRepository jobRepository;
	private final PlatformTransactionManager transactionManager;

	@Bean
	protected Step countStep() {
		return new StepBuilder("countStep", jobRepository)
			.tasklet(new ActiveAppCountTasklet(appRepository), transactionManager)
			.build();
	}
	@Bean
	public Job readApps(Step countStep) {
		return jobBuilder.start(countStep)
			.build();
	}

}
