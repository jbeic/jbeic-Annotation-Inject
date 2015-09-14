package com.jbeic.AnnotationInject.model;

import java.lang.reflect.Field;

import com.jbeic.AnnotationInject.Annotation.Inject;
import com.jbeic.AnnotationInject.exception.JBeicInjectException;


/**
 * TODO 简述     注解依赖注入核心类            .<br>
 *<p>TODO 详细描述：用于将某个对象中注入一个依赖对象</p>
 *
 * <p>Copyright: 版权所有 (c) JBeic</p>
 *
 * @author JBeic
 * @version V1.0 2015年9月14日
 */
public class JBeicInjectModel {
	
	/**
	 * <p>将主对象sourceObject中的某个依赖的对象用injectObject对象进行注入
	 * 如果主对象有依赖多个相同类的属性，则会自动注入第一个对象，所以请使用inject(Object sourceObject,String fieldName,Object injectObject)或inject(Object sourceObject,int index,Object injectObject)
	 *  </p>
	 *
	 * @param sourceObject  主对象
	 * @param injectObject 依赖的对象 
	 */
	public static  void inject(Object sourceObject,Object injectObject){
		if(sourceObject==null){
			JBeicInjectException.showMsg("sourceObject为null");
			return;
		}
		if(injectObject==null){
			JBeicInjectException.showMsg("injectObject为null");
			return;
		}
		
		Class<? extends Object> injectclass= sourceObject.getClass();
		Field[] fields=injectclass.getDeclaredFields();//获取所有字段
		for(Field filed:fields){
			//获取Inject注解
			Inject injes=filed.getAnnotation(Inject.class);
			if(injes!=null){
				try {
					//判断 注入的类 和 属性filed的类 是否一致
					if(!filed.getType().getName().equals(injectObject.getClass().getName())){
						continue;
					}
					filed.setAccessible(true);//设置为可修改
					filed.set(sourceObject, injectObject);//注入对象
					break;
				} catch (IllegalArgumentException e) {
					JBeicInjectException.showMsg("异常");
				} catch (IllegalAccessException e) {
					JBeicInjectException.showMsg("异常");
				}
			}
		}
	}
	
	/**
	 * <p>有依赖多个相同类的属性时，将主对象sourceObject中的属性名称为fieldName依赖的对象用injectObject对象进行注入</p>
	 * @param sourceObject  主对象
	 * @param fieldName   类的属性名称
	 * @param injectObject  依赖的对象 
	 */
	public static void inject(Object sourceObject,String fieldName,Object injectObject){
		if(sourceObject==null){
			JBeicInjectException.showMsg("sourceObject为null");
			return;
		}
		if(injectObject==null){
			JBeicInjectException.showMsg("injectObject为null");
			return;
		}
		
		Class<? extends Object> injectclass= sourceObject.getClass();
		Field filed=null;
		try {
			filed = injectclass.getDeclaredField(fieldName);
		} catch (SecurityException e1) {
			e1.printStackTrace();
		} catch (NoSuchFieldException e1) {
			JBeicInjectException.showMsg(injectclass.getName()+"找不到"+fieldName+"属性");
			return;
		}
	
		//获取Inject注解
		Inject injes=filed.getAnnotation(Inject.class);
		if(injes!=null){
			try {
				//判断 注入的类 和 属性filed的类 是否一致
				if(!filed.getType().getName().equals(injectObject.getClass().getName())){
					JBeicInjectException.showMsg(injectclass.getName()+"的"+fieldName+"属性类型为"+filed.getType().getName()+",传递参数的类类型"+injectObject.getClass().getName());
				}
				filed.setAccessible(true);//设置为可修改
				filed.set(sourceObject, injectObject);//注入对象
			} catch (IllegalArgumentException e) {
				JBeicInjectException.showMsg("异常");
			} catch (IllegalAccessException e) {
				JBeicInjectException.showMsg("异常");
			}
		}else {
			JBeicInjectException.showMsg(injectclass.getName()+"的"+fieldName+"属性没有@Inject注解");
		}
		
	}
	
	/**
	 * <p>有依赖多个相同类的属性时，将主对象sourceObject中的第index个相同类依赖的对象用injectObject对象进行注入</p>
	 *
	 * @param sourceObject 主对象
	 * @param index
	 * @param injectObject  依赖的对象 
	 */
	public static void inject(Object sourceObject,int index,Object injectObject){
		
	}
	

}
