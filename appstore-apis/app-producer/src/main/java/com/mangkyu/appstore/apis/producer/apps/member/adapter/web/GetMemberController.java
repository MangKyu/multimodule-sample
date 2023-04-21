package com.mangkyu.appstore.apis.producer.apps.member.adapter.web;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mangkyu.appstore.apis.producer.apps.member.application.GetMemberUseCase;
import com.mangkyu.appstore.core.domain.member.Member;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
class GetMemberController {

	private final GetMemberUseCase getMemberUseCase;

	@GetMapping("/v1/members")
	public ResponseEntity<Map<String, List<GetMemberResponse>>> getApps() {
		List<GetMemberResponse> responses = getMemberUseCase.getMembers()
			.stream()
			.map(this::toResponse)
			.toList();

		return ResponseEntity.ok(Map.of("apps", responses));
	}

	private GetMemberResponse toResponse(Member member) {
		return GetMemberResponse.builder()
			.id(member.getId())
			.name(member.getName())
			.build();
	}

}
