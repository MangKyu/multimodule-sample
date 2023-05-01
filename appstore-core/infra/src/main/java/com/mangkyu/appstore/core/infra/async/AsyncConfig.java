package com.mangkyu.appstore.core.infra.async;

import static org.springframework.context.support.AbstractApplicationContext.*;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.mangkyu.appstore.core.infra.AppStoreConfigMarker;

@EnableAsync
public class AsyncConfig implements AppStoreConfigMarker {

	/**
	 * 이벤트 처리는 반드시 비동기로만 처리되도록 설정함
	 * Spring 설정에 따라 Bean의 name을 삭제하면 안됨!
	 */

	@Bean(name = APPLICATION_EVENT_MULTICASTER_BEAN_NAME)
	public ApplicationEventMulticaster applicationEventMulticaster() {
		SimpleApplicationEventMulticaster eventMulticaster = new SimpleApplicationEventMulticaster();
		eventMulticaster.setTaskExecutor(asyncExecutor());
		return eventMulticaster;
	}

	private Executor asyncExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(10);
		executor.setMaxPoolSize(10);
		executor.setQueueCapacity(10000);
		executor.setWaitForTasksToCompleteOnShutdown(true);
		executor.setAwaitTerminationSeconds(10);
		executor.initialize();
		return executor;
	}

}