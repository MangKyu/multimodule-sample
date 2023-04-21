package com.mangkyu.appstore.core.domain.app;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

class AppTest {

	@EnumSource(value = AppStatus.class, mode = EnumSource.Mode.INCLUDE, names = "ACTIVE")
	@ParameterizedTest
	void 조회가능_True(AppStatus status) {
		App app = App.builder()
			.status(status)
			.build();

		assertThat(app.isVisible()).isTrue();
	}

	@EnumSource(value = AppStatus.class, mode = EnumSource.Mode.EXCLUDE, names = "ACTIVE")
	@ParameterizedTest
	void 조회가능_False(AppStatus status) {
		App app = App.builder()
			.status(status)
			.build();

		assertThat(app.isVisible()).isFalse();
	}

}