package com.jbeic.AnnotationInject.example;


import java.util.List;

import com.jbeic.AnnotationInject.Annotation.Inject;

/**
 * TODO 简述      学生类，测试类          .<br>
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
	private Pen pen2;
	
	@Inject
	private Book book;
	@Inject
	private int myint;
	@Inject
	private String name;
	@Inject
	private String age;
	
	@Inject
	private double money;
	
	@Inject
	private List<Book> bookList;
	
	public Student(){
	}
	
	@Override
	public String  toString(){	
		return "Student:"+pen.toString()+","+pen2.toString()+","+book.toString()+","+myint+"--"+name+"--"+age+"--"+money+"--"+bookList.toString();
	}

}
