package com.mangkyu.appstore.apis.producer.apps.member.adapter.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
class GetMemberResponse {

	private long id;
	private String name;

}
