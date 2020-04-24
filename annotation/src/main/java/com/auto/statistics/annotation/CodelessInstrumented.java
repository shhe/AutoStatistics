package com.auto.statistics.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author shhe
 * @Date 2020-03-11 17:14
 * @Description: 插桩标记，仅限SDK内部使用，用户禁用。
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CodelessInstrumented {
}
