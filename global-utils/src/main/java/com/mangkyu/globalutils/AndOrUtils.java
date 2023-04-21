package com.mangkyu.globalutils;

import org.apache.commons.lang3.BooleanUtils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class AndOrUtils {

	public static boolean or(boolean... array) {
		return BooleanUtils.or(array);
	}

	public static boolean and(boolean... array) {
		return BooleanUtils.and(array);
	}

}