# jbeic-Annotation-Inject
注解式依赖注入
JBeic-Annotation-Inject
1、简介
JBeic-Annotation-Inject是基于Java注解Annotation和Java反射机制进行实现，通过简单的注解方式实现灵活的依赖注入。
2、优点
JBeic-Annotation-Inject依赖注入主要有两个好处：
	(1) 解耦，将依赖之间解耦。
	(2) 方便做单元测试。
(3)依赖的类无需实现对依赖的类实例化（不需要构造函数和公有方法对依赖的类注入对象）。
3、主要API
1、void com.jbeic.AnnotationInject.JBeicInject.inject(Object sourceObject, Object injectObject)
将主对象sourceObject中的某个依赖的对象用injectObject对象进行注入 如果主对象有依赖多个相同类的属性，则会自动注入第一个对象，所以请使用inject(Object sourceObject,String fieldName,Object injectObject)或inject(Object sourceObject,int index,Object injectObject) 
Parameters: 
sourceObject 主对象 
fieldName 类的属性名称 
injectObject 依赖的对象

2、void com.jbeic.AnnotationInject.JBeicInject.inject(Object sourceObject, String fieldName, Object injectObject)

有依赖多个相同类的属性时，将主对象sourceObject中的属性名称为fieldName依赖的对象用injectObject对象进行注入 
Parameters: 
sourceObject 主对象 
fieldName 类的属性名称 
injectObject 依赖的对象

3、void com.jbeic.AnnotationInject.JBeicInject.inject(Object sourceObject, int index, Object injectObject)
有依赖多个相同类的属性时，将主对象sourceObject中的第index-1个相同类依赖的对象用injectObject对象进行注入。 index从0开始 
Parameters: 
sourceObject 主对象 
index 标记位 
injectObject 依赖的对象

4、例子
Student类依赖了Book、Pen、int、String等。使用JBeicInject.inject去注入这些依赖。
Book接口
public interface Book {
   public String  toString();
}

CBook类实现Book 接口
public class CBook implements Book {
	@Override
	public String toString() {
		return "C BOOK";
	}
}

JavaBook类实现Book 接口
public class JavaBook implements Book {
	@Override
	public String toString() {
		return "JAVA BOOK";
	}
}

Pen类
public class Pen {
	private String nameString;
	public Pen(String nameString) {
		this.nameString = nameString;
	}
	@Override
	public String toString() {
		return "Pen:" + nameString;

	}
}


Student 类
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
	@Override
	public String  toString(){	
		return "Student:"+pen.toString()+","+pen2.toString()+","+book.toString()+","+myint+"--"+name+"--"+age+"--"+money+"--"+bookList.toString();
	}

}


JBeicInjectMain 程序入口
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

执行结果：
Student:Pen:JBeic-pan,Pen:JBeic-pan2,JAVA BOOK,12354--Jbeic——name--Jbeic——index--1000.156--[C BOOK, JAVA BOOK]

5、展望
1、目前没有对构造函数和方法进行注解方式的依赖注解，后续将增加这些功能。
2、注解@Inject应该增加一个值来标记该注解是否可用，值为false时该字段不能进行注入对象。

