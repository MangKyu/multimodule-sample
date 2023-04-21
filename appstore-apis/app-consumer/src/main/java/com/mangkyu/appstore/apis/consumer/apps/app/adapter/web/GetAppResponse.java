package com.mangkyu.appstore.apis.consumer.apps.app.adapter.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
class GetAppResponse {

	private long id;
	private String name;
	private String desc;

}
