package com.mangkyu.appstore.apis.producer.apps.member.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mangkyu.appstore.core.domain.member.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
