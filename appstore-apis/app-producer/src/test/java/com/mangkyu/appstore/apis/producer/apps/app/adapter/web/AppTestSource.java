package com.mangkyu.appstore.apis.producer.apps.app.adapter.web;

public class AppTestSource {

	public static CreateAppRequest createAppRequest() {
		return CreateAppRequest.builder()
			.name("name")
			.desc("desc")
			.build();
	}

}
