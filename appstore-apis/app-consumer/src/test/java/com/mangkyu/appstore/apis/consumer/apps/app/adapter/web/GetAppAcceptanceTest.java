package com.mangkyu.appstore.apis.consumer.apps.app.adapter.web;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import com.mangkyu.appstore.apis.consumer.acceptance.AcceptanceTest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;

@AcceptanceTest
class GetAppAcceptanceTest {

	@Test
	void 앱생성() {
		// given

		// when
		ExtractableResponse<Response> result = RestAssured
			.given().log().all()
			.contentType(ContentType.JSON)
			.when().get("/v1/apps")
			.then().log().all()
			.extract();

		// verify
		assertThat(result.statusCode()).isEqualTo(HttpStatus.OK.value());
	}


}