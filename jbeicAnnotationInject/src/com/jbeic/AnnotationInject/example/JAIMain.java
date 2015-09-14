package com.jbeic.AnnotationInject.example;

import com.jbeic.AnnotationInject.model.JBeicInjectModel;



public class JAIMain {
	public static void main(String[] args) {
		Student student=new Student();
		Pen pan=new Pen("JBeic-pan");
		JBeicInjectModel.inject(student, null);
		JBeicInjectModel.inject(student, new Book("JBeic-Book"));
		System.out.println(student.toString());;

	}

}
