package com.fly.system.general.annotation;

import java.lang.annotation.*;

/**
 * 匿名访问不鉴权注解
 *
 * @author fly
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Anonymous
{
}
