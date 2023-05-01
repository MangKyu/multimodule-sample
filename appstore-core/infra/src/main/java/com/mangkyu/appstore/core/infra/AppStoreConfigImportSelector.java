package com.mangkyu.appstore.core.infra;

import java.util.Arrays;
import java.util.Map;

import org.apache.commons.collections4.MapUtils;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

class AppStoreConfigImportSelector implements DeferredImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata metadata) {
		return Arrays.stream(getValues(metadata))
			.map(v -> v.getConfigClass().getName())
			.toArray(String[]::new);
	}

	private AppStoreConfigGroup[] getValues(AnnotationMetadata metadata) {
		Map<String, Object> attributes = metadata.getAnnotationAttributes(EnableAppStoreConfig.class.getName());
		return (AppStoreConfigGroup[]) MapUtils.getObject(attributes, "value", new AppStoreConfigGroup[]{});
	}

}
