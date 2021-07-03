package com.us.improve.designpatterns.composite;

/**
 * @Author loren
 * @Description TODO
 * @Date 2021-07-02 18:40
 * @Version 1.0
 **/
public class Client {

	public static void main(String[] args) {
		Folder rootFolder = new Folder("Root");
		Folder subFolder = new Folder("Sub");

		TextFile textFile1 = new TextFile("a.text");
		ImgFile imgFile1 = new ImgFile("b.jpg");
		VideoFile videoFile1 = new VideoFile("c.mkv");

		rootFolder.addFile(subFolder);
		rootFolder.addFile(textFile1);
		rootFolder.addFile(imgFile1);
		rootFolder.addFile(videoFile1);

		TextFile textFile2 = new TextFile("d.txt");
		subFolder.addFile(textFile2);

		rootFolder.display();
	}

}
