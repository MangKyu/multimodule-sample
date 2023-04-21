package com.mangkyu.globalutils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class AndOrUtilsTest {

	@Test
	void and() {
		assertThat(AndOrUtils.or(true, false)).isTrue();
	}

	@Test
	void or() {
		assertThat(AndOrUtils.and(true, false)).isFalse();
	}

}