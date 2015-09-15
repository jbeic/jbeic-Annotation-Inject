package com.jbeic.AnnotationInject;

import java.lang.reflect.Field;

import com.jbeic.AnnotationInject.Annotation.Inject;
import com.jbeic.AnnotationInject.exception.JBeicInjectException;

/**
 * TODO 简述 注解依赖注入核心类 .<br>
 * <p>
 * TODO 详细描述：用于将某个对象中注入一个依赖对象
 * </p>
 * 
 * <p>
 * Copyright: 版权所有 (c) JBeic
 * </p>
 * 
 * @author JBeic
 * @version V1.0 2015年9月14日
 */
public class JBeicInject {

	/**
	 * <p>
	 * 将主对象sourceObject中的某个依赖的对象用injectObject对象进行注入
	 * 如果主对象有依赖多个相同类的属性，则会自动注入第一个对象，所以请使用inject(Object sourceObject,String
	 * fieldName,Object injectObject)或inject(Object sourceObject,int
	 * index,Object injectObject)
	 * </p>
	 * 
	 * @param sourceObject
	 *            主对象
	 * @param injectObject
	 *            依赖的对象
	 */
	public static void inject(Object sourceObject, Object injectObject) {
		if (sourceObject == null) {
			JBeicInjectException.showMsg("参数sourceObject不能为null");
			return;
		}
		if (injectObject == null) {
			JBeicInjectException.showMsg("参数injectObject不能为null");
			return;
		}

		Class<? extends Object> injectclass = sourceObject.getClass();
		Field[] fields = injectclass.getDeclaredFields();// 获取所有字段
		for (Field filed : fields) {
			// 获取Inject注解
			Inject injes = filed.getAnnotation(Inject.class);
			if (injes != null) {
				try {

					// 判断 注入的类 是否是属性filed的类的子类对象或对象
					if (!isInstance(filed,injectObject)){
						continue;
					}
					filed.setAccessible(true);// 设置为可修改
					filed.set(sourceObject, injectObject);// 注入对象
					break;
				} catch (IllegalArgumentException e) {
					JBeicInjectException.showMsg("注入的对象参数不正确");
				} catch (IllegalAccessException e) {
					JBeicInjectException.showMsg("没有权限去注入对象");
				}
			}
		}
	}

	/**
	 * <p>
	 * 有依赖多个相同类的属性时，将主对象sourceObject中的属性名称为fieldName依赖的对象用injectObject对象进行注入
	 * </p>
	 * 
	 * @param sourceObject
	 *            主对象
	 * @param fieldName
	 *            类的属性名称
	 * @param injectObject
	 *            依赖的对象
	 */
	public static void inject(Object sourceObject, String fieldName, Object injectObject) {
		if (sourceObject == null) {
			JBeicInjectException.showMsg("参数sourceObject不能为null");
			return;
		}
		if (injectObject == null) {
			JBeicInjectException.showMsg("参数injectObject不能为null");
			return;
		}

		Class<? extends Object> injectclass = sourceObject.getClass();
		Field filed = null;
		try {
			filed = injectclass.getDeclaredField(fieldName);
		} catch (SecurityException e1) {
			e1.printStackTrace();
		} catch (NoSuchFieldException e1) {
			JBeicInjectException.showMsg(injectclass.getName() + "找不到" + fieldName + "属性");
			return;
		}

		// 获取Inject注解
		Inject injes = filed.getAnnotation(Inject.class);
		if (injes != null) {
			try {
				// 判断 注入的类 是否是属性filed的类的子类对象或对象
				if (!isInstance(filed,injectObject)) {
					JBeicInjectException.showMsg(injectclass.getName() + "的" + fieldName + "属性类型为" + filed.getType().getName() + ",传递参数的类类型" + injectObject.getClass().getName());
				}
				filed.setAccessible(true);// 设置为可修改
				filed.set(sourceObject, injectObject);// 注入对象
			} catch (IllegalArgumentException e) {
				JBeicInjectException.showMsg("注入的对象参数不正确");
			} catch (IllegalAccessException e) {
				JBeicInjectException.showMsg("没有权限去注入对象");
			}
		} else {
			JBeicInjectException.showMsg(injectclass.getName() + "的" + fieldName + "属性没有@Inject注解");
		}

	}

	/**
	 * <p>
	 * 有依赖多个相同类的属性时，将主对象sourceObject中的第index-1个相同类依赖的对象用injectObject对象进行注入。
	 * <b>index从0开始</b>
	 * </p>
	 * 
	 * @param sourceObject
	 *            主对象
	 * @param index 标记位
	 * @param injectObject
	 *            依赖的对象
	 */
	public static void inject(Object sourceObject, int index, Object injectObject) {
		
		if (sourceObject == null) {
			JBeicInjectException.showMsg("参数sourceObject不能为null");
			return;
		}
		if (injectObject == null) {
			JBeicInjectException.showMsg("参数injectObject不能为null");
			return;
		}
		if (index<1) {
			JBeicInjectException.showMsg("参数index不能小于1");
			return;
		}

		Class<? extends Object> injectclass = sourceObject.getClass();
		Field[] fields = injectclass.getDeclaredFields();// 获取所有字段
	
		Field filed= fields[index];
		// 获取Inject注解
				Inject injes = filed.getAnnotation(Inject.class);
				if (injes != null) {
					try {
						// 判断 注入的类 是否是属性filed的类的子类对象或对象
						if (!isInstance(filed,injectObject)) {
							JBeicInjectException.showMsg(injectclass.getName() + "的" + filed.getName() + "属性类型为" + filed.getType().getName() + ",传递参数的类类型" + injectObject.getClass().getName());
						}
						filed.setAccessible(true);// 设置为可修改
						filed.set(sourceObject, injectObject);// 注入对象
					} catch (IllegalArgumentException e) {
						JBeicInjectException.showMsg("注入的对象参数不正确");
					} catch (IllegalAccessException e) {
						JBeicInjectException.showMsg("没有权限注入对象");
					}
				} else {
					JBeicInjectException.showMsg(injectclass.getName() + "的" +filed.getName()+ "属性没有@Inject注解");
				}
		

	}


	/**
	 * TODO  判断注入的对象是否和类属性一致（相同类 或者是子类 或者是）         .<br>
	 *
	 * @param field 类属性
	 * @param injectObject 注入对象
	 * @return  boolean 
	 */
	private static boolean isInstance(Field field, Object injectObject) {

		if (field.getType().isInstance(injectObject)) {
			return true;
		} else {
			if (field.getType().getName().equals("int") && injectObject.getClass().getName().equals("java.lang.Integer") || field.getType().getName().equals("double") && injectObject.getClass().getName().equals("java.lang.Double") || field.getType().getName().equals("long") && injectObject.getClass().getName().equals("java.lang.Long") || field.getType().getName().equals("float") && injectObject.getClass().getName().equals("java.lang.Float") || field.getType().getName().equals("boolean") && injectObject.getClass().getName().equals("java.lang.Boolean") || field.getType().getName().equals("char") && injectObject.getClass().getName().equals("java.lang.Character")) {
				return true;
			} else {
				return false;
			}

		}

	}

}
