package com.mangkyu.appstore.apis.producer.apps.app.application;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mangkyu.appstore.core.domain.app.App;
import com.mangkyu.appstore.core.domain.app.AppRepository;
import com.mangkyu.appstore.core.domain.app.GetAppUseCase;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
class GetProducerAppUseCase implements GetAppUseCase {

	private final AppRepository appRepository;

	public List<App> getApps() {
		return appRepository.findAll();
	}

}
