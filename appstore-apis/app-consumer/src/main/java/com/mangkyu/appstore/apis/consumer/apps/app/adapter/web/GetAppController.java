package com.mangkyu.appstore.apis.consumer.apps.app.adapter.web;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mangkyu.appstore.core.domain.app.App;
import com.mangkyu.appstore.core.domain.app.GetAppUseCase;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
class GetAppController {

	private final GetAppUseCase getAppUseCase;

	@GetMapping("/v1/apps")
	public ResponseEntity<Map<String, List<GetAppResponse>>> getApps() {
		List<GetAppResponse> responses = getAppUseCase.getApps()
			.stream()
			.map(this::toResponse)
			.toList();

		return ResponseEntity.ok(Map.of("apps", responses));
	}

	private GetAppResponse toResponse(App app) {
		return GetAppResponse.builder()
			.id(app.getId())
			.name(app.getName())
			.desc(app.getDesc())
			.build();
	}

}
