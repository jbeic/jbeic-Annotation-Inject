package com.jbeic.AnnotationInject.exception;

/**
 * TODO 简述        JBeicAnnotationInject异常处理类         .<br>
 *<p>TODO 详细描述：用于捕获JBeicAnnotationInject处理中的异常情况</p>
 *
 * <p>Copyright: 版权所有 (c) JBeic</p>
 *
 * @author JBeic
 * @version V1.0 2015年9月14日
 */
public class JBeicInjectException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public JBeicInjectException(String msg){
		super(msg);
	}
	public static void showMsg(String msg){
		try {
			throw new JBeicInjectException(msg);
		} catch (JBeicInjectException e) {
			e.printStackTrace();
		}
	} 

}
