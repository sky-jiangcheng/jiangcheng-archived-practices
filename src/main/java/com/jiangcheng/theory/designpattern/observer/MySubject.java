package com.jiangcheng.theory.designpattern.observer;

public class MySubject extends AbstractSubject {

	@Override
    public void operation() {
		// TODO Auto-generated method stub
		System.out.println("update self!");
		notifyObservers();
	}

}
