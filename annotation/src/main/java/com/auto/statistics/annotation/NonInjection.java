
package com.auto.statistics.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author shhe
 * @Date 2020-03-11 17:15
 * @Description: 若不希望SDK插桩，用此注解通知SDK不要进行插桩操作。
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface NonInjection {
}
