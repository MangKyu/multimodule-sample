package com.mangkyu.appstore.apis.producer.apps.app.adapter.web;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mangkyu.appstore.core.domain.app.App;

class CreateAppRequestTest {

	@Test
	void toDomain() {
		// given
		CreateAppRequest request = AppTestSource.createAppRequest();

		// when
		App app = request.toDomain();

		// verify
		assertAll(
			() -> assertThat(app.getName()).isEqualTo(request.getName()),
			() -> assertThat(app.getDesc()).isEqualTo(request.getDesc())
		);
	}

}