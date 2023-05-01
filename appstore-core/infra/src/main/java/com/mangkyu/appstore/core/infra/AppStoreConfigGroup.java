package com.mangkyu.appstore.core.infra;

import com.mangkyu.appstore.core.infra.async.AsyncConfig;
import com.mangkyu.appstore.core.infra.jasypt.JasyptConfig;
import com.mangkyu.appstore.core.infra.jpa.JpaConfig;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AppStoreConfigGroup {

	ASYNC(AsyncConfig.class),
	JASYPT(JasyptConfig.class),
	JPA(JpaConfig.class),
	;

	private final Class<? extends AppStoreConfigMarker> configClass;

}
