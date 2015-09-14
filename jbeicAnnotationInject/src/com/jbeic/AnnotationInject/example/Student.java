package com.jbeic.AnnotationInject.example;


import com.jbeic.AnnotationInject.Annotation.Inject;

/**
 * TODO 简述      学生类，依赖了两个对象          .<br>
 *<p>TODO 详细描述</p>
 *
 * <p>Copyright: 版权所有 (c) JBeic</p>
 *
 * @author JBeic
 * @version V1.0 2015年9月14日
 */
public class Student {
	@Inject
	private Pen pen;
	
	@Inject
	private Book book;
	
	public Student(){
	}
	
	@Override
	public String  toString(){	
		return "Student:"+pen.toString()+","+book.toString();
	}

}
