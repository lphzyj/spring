package com.lph.app.core;
/**
 * Spring Bean
 * @author Administrator
 *
 */
public class HelloWorld {
    private String name;

    public void setName(String name) {
	this.name = name;
    }

    public void printHello() {
	System.out.println("Spring 4 : Hello ! " + name);
    }
    
    public static void main(String[] args) {
	String simpleMailMessage=" <![CDATA[Dear %s,Mail Content : %s]]>";
	String result=String.format(simpleMailMessage, "lph", "zyj");
	System.out.println(result);
    }
}
