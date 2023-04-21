package com.mangkyu.appstore.apis.producer.apps.app.adapter.web;

import static com.mangkyu.appstore.apis.producer.apps.app.adapter.web.AppTestSource.*;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import com.mangkyu.appstore.apis.producer.acceptance.AcceptanceTest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;

@AcceptanceTest
class CreateAppAcceptanceTest {

	@Test
	void 앱생성() {
		// given
		CreateAppRequest request = createAppRequest();

		// when
		ExtractableResponse<Response> result = RestAssured
			.given().log().all()
			.contentType(ContentType.JSON)
			.body(request)
			.when().post("/v1/apps")
			.then().log().all()
			.extract();

		// verify
		assertThat(result.statusCode()).isEqualTo(HttpStatus.CREATED.value());
	}


}