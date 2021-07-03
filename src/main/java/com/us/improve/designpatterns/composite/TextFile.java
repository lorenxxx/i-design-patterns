package com.us.improve.designpatterns.composite;

/**
 * @Author loren
 * @Description TODO
 * @Date 2021-07-02 18:27
 * @Version 1.0
 **/
public class TextFile implements IFile {

	private String name;

	public TextFile(String name) {
		this.name = name;
	}

	@Override
	public void display() {
		System.out.println("Text File: " + this.name);
	}

}
