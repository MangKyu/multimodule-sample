package com.mangkyu.appstore.apis.consumer.apps.app.application;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.mangkyu.appstore.core.domain.app.App;
import com.mangkyu.appstore.core.domain.app.AppRepository;
import com.mangkyu.appstore.core.domain.app.AppStatus;

@ExtendWith(MockitoExtension.class)
class GetConsumerAppUseCaseTest {

	@InjectMocks
	private GetConsumerAppUseCase useCase;

	@Mock
	private AppRepository appRepository;

	@Test
	void 앱목록조회() {
		// given
		doReturn(List.of(app(AppStatus.ACTIVE), app(AppStatus.ACTIVE), app(AppStatus.PAUSED)))
			.when(appRepository)
			.findAll();

		// when
		List<App> result = useCase.getApps();

		// then
		assertThat(result).hasSize(2);
	}

	private App app(AppStatus status) {
		return App.builder()
			.status(status)
			.build();
	}

}