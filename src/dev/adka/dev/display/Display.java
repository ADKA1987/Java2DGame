package dev.adka.dev.display;

import javax.swing.JFrame;

public class Display {
private JFrame frame;
private String title;
private int width, height;
public Display(String title, int width, int hieght){
	this.title = title;
	this.width = width;
	this.height = hieght;
	
	createDisplay();
}
private void createDisplay(){
	frame = new JFrame(title);
	frame.setSize(width, height);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(false);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
}
}