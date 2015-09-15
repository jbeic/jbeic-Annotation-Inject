package com.jbeic.AnnotationInject.example;

import java.util.ArrayList;
import java.util.List;

import com.jbeic.AnnotationInject.JBeicInject;



/**
 * TODO 简述        主函数         .<br>
 *<p>TODO 详细描述</p>
 *
 * <p>Copyright: 版权所有 (c) JBeic</p>
 *
 * @author JBeic
 * @version V1.0 2015年9月15日
 */
public class JBeicInjectMain {
	public static void main(String[] args) {
		Student student=new Student();
		//直接注入，适合只有一个该Class的属性
		JBeicInject.inject(student, new JavaBook());
		
		//根据属性名注入，适合多个相同Class的属性
		Pen pen=new Pen("JBeic-pan");
		Pen pen2=new Pen("JBeic-pan2");
		//注入自定义类型对象
		JBeicInject.inject(student, "pen",pen);
		JBeicInject.inject(student,"pen2", pen2);
		
		//int、double、float等自动进行装箱和拆箱
		//注入double类型
		JBeicInject.inject(student,"money", 1000.156);
		//注入Integer类型
		JBeicInject.inject(student, Integer.valueOf(12354));
		//注入String类型
		JBeicInject.inject(student,"name","Jbeic——name");
		
		//根据属性的位置进行注入，位置参数从0开始
		JBeicInject.inject(student,5,"Jbeic——index");
		
		//注入List类型
		List<Book> books=new ArrayList<Book>();
		books.add(new CBook());
		books.add(new JavaBook());	
		JBeicInject.inject(student,"bookList",books);
		
		System.out.println(student.toString());
		
		
	}

}
