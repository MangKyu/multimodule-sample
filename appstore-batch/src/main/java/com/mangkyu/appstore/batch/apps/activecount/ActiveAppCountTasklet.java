package com.mangkyu.appstore.batch.apps.activecount;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

import com.mangkyu.appstore.core.domain.app.App;
import com.mangkyu.appstore.core.domain.app.AppRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class ActiveAppCountTasklet implements Tasklet, StepExecutionListener {

	private final AppRepository appRepository;

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) {
		long count = appRepository.findAll().stream()
			.filter(App::isVisible)
			.count();

		log.info("active count = {}", count);
		return RepeatStatus.FINISHED;
	}
}
