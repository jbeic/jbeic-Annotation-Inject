package com.jbeic.AnnotationInject.example;

/**
 * TODO 简述       笔          .<br>
 *<p>TODO 详细描述</p>
 *
 * <p>Copyright: 版权所有 (c) JBeic</p>
 *
 * @author JBeic
 * @version V1.0 2015年9月14日
 */
public class Pen {
	private String nameString;

	public Pen() {
	}

	public Pen(String nameString) {
		this.nameString = nameString;
	}

	@Override
	public String toString() {
		return "Pen:" + nameString;

	}

}
