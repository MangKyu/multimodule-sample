package com.mangkyu.appstore.apis.producer.apps.app.adapter.web;

import com.mangkyu.appstore.core.domain.app.App;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
class CreateAppRequest {

	private String name;
	private String desc;

	public App toDomain() {
		return App.builder()
			.name(name)
			.desc(desc)
			.build();
	}
}
