package com.jbeic.AnnotationInject.Annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * TODO 简述   注解要注入的类属性      .<br>
 *<p>TODO 详细描述：用来标记类某个字段需要进行依赖注入</p>
 *
 * <p>Copyright: 版权所有 (c) JBeic</p>
 *
 * @author JBeic
 * @version V1.0 2015年9月14日
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Inject {
	
	/**
	 * 此注解是否可以，默认是true，设置为false时无法对注解的Field进行注入<br>
	 *
	 * @return  boolean 
	 */
	boolean isEnable() default true;
	
}
