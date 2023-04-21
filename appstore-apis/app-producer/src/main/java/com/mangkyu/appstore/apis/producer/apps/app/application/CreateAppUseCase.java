package com.mangkyu.appstore.apis.producer.apps.app.application;

import org.springframework.stereotype.Service;

import com.mangkyu.appstore.core.domain.app.App;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CreateAppUseCase {

	private final SaveAppPort saveAppPort;

	public App create(App app) {
		return saveAppPort.save(app);
	}

}
