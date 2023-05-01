package com.mangkyu.appstore.core.infra;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.lang.annotation.Annotation;

import org.junit.jupiter.api.Test;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.core.type.AnnotationMetadata;

class AppStoreConfigImportSelectorTest {

	@Test
	void entryEqualsSameInstance() {
		AnnotationMetadata metadata = mock(AnnotationMetadata.class);

		EnableAppStoreConfig annotation = enableAppStoreConfig();
		doReturn(AnnotationUtils.getAnnotationAttributes(annotation))
			.when(metadata)
			.getAnnotationAttributes(EnableAppStoreConfig.class.getName());

		AppStoreConfigImportSelector selector = new AppStoreConfigImportSelector();

		String[] result = selector.selectImports(metadata);
		assertThat(result).hasSize(3);
	}

	private EnableAppStoreConfig enableAppStoreConfig() {
		return new EnableAppStoreConfig() {

			@Override
			public Class<? extends Annotation> annotationType() {
				return EnableAppStoreConfig.class;
			}

			@Override
			public AppStoreConfigGroup[] value() {
				return new AppStoreConfigGroup[]{
					AppStoreConfigGroup.JPA,
					AppStoreConfigGroup.JASYPT,
					AppStoreConfigGroup.ASYNC};
			}
		};
	}

}