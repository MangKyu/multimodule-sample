package com.mangkyu.appstore.apis.producer.apps.member.adapter.web;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import com.mangkyu.appstore.apis.producer.acceptance.AcceptanceTest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;

@AcceptanceTest
class MemberAcceptanceTest {

	@Test
	void 멤버조회() {
		// given

		// when
		ExtractableResponse<Response> result = RestAssured
			.given().log().all()
			.contentType(ContentType.JSON)
			.when().get("/v1/members")
			.then().log().all()
			.extract();

		// verify
		assertThat(result.statusCode()).isEqualTo(HttpStatus.OK.value());
	}



}