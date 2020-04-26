package com.auto.statistics.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author shhe
 * @Date 2020-03-11 17:13
 * @Description: 如果有此标识，SDK会插桩该方法，在方法执行时上报日志
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoStatisticsEvent {
    String eventName() default "";

    String properties() default "{}";
}
