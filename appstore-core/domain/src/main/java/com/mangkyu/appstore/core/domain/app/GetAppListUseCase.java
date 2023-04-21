package com.mangkyu.appstore.core.domain.app;

import java.util.List;

import com.mangkyu.appstore.core.domain.member.MemberRole;

public interface GetAppListUseCase {

	List<App> getAppList(MemberRole role);

}
