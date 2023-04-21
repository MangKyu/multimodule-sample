package com.mangkyu.appstore.apis.producer.apps.app.adapter.web;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mangkyu.appstore.apis.producer.apps.app.application.CreateAppUseCase;
import com.mangkyu.appstore.core.domain.app.App;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
class CreateAppController {

	private final CreateAppUseCase createAppUseCase;

	@PostMapping("/v1/apps")
	public ResponseEntity<App> createApp(@RequestBody CreateAppRequest request) {
		App app = createAppUseCase.create(request.toDomain());
		return ResponseEntity.created(URI.create("/v1/apps/" + app.getId()))
			.build();
	}

}
