package com.jiangcheng.theory.designpattern.momento;

public class Memento {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public Memento(String value){
		this.value = value;
	}
}
