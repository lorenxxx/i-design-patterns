package com.us.improve.designpatterns.composite;

/**
 * @Author loren
 * @Description TODO
 * @Date 2021-07-02 18:28
 * @Version 1.0
 **/
public class ImgFile implements IFile {

	private String name;

	public ImgFile(String name) {
		this.name = name;
	}

	@Override
	public void display() {
		System.out.println("Img File: " + this.name);
	}

}
