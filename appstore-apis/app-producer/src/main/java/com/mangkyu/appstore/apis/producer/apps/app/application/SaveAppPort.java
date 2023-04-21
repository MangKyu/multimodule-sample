package com.mangkyu.appstore.apis.producer.apps.app.application;

import com.mangkyu.appstore.core.domain.app.App;

public interface SaveAppPort {
	App save(App app);
}
