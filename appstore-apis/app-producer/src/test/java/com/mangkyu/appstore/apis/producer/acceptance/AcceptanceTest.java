package com.mangkyu.appstore.apis.producer.acceptance;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Retention(RetentionPolicy.RUNTIME)
@TestExecutionListeners(
	value = {AcceptanceTestExecutionListener.class,},
	mergeMode = TestExecutionListeners.MergeMode.MERGE_WITH_DEFAULTS)
public @interface AcceptanceTest {
}