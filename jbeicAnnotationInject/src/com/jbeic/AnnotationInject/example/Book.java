package com.jbeic.AnnotationInject.example;

/**
 * TODO 简述     书            .<br>
 *
 * <p>Copyright: 版权所有 (c) JBeic</p>
 *
 * @author JBeic
 * @version V1.0 2015年9月14日
 */
public class Book {
	private String msgString="";
	public Book(String msgString){
		this.msgString=msgString;
	}
	@Override
	public String  toString(){	
		return "Book:"+msgString;
	}

}
