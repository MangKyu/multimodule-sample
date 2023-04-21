package com.mangkyu.appstore.apis.producer.apps.member.application;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mangkyu.appstore.apis.producer.apps.member.domain.MemberRepository;
import com.mangkyu.appstore.core.domain.member.Member;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GetMemberUseCase {

	private final MemberRepository memberRepository;

	public List<Member> getMembers() {
		return memberRepository.findAll();
	}

}
