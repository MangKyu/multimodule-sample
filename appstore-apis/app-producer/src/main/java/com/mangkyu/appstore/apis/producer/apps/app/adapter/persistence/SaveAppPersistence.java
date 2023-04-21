package com.mangkyu.appstore.apis.producer.apps.app.adapter.persistence;

import org.springframework.stereotype.Repository;

import com.mangkyu.appstore.apis.producer.apps.app.application.SaveAppPort;
import com.mangkyu.appstore.core.domain.app.App;
import com.mangkyu.appstore.core.domain.app.AppRepository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
class SaveAppPersistence implements SaveAppPort {

	private final AppRepository appRepository;

	public App save(App app) {
		return appRepository.save(app);
	}

}
