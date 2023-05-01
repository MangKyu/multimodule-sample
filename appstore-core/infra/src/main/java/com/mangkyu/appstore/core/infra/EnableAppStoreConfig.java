/*
 *
 *  EnableWorksDatabase.java 2023-04-27
 *
 *  Copyright 2023 WorksMobile Corp. All rights Reserved.
 *  WorksMobile PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */
package com.mangkyu.appstore.core.infra;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(AppStoreConfigImportSelector.class)
public @interface EnableAppStoreConfig {

	AppStoreConfigGroup[] value();

}
