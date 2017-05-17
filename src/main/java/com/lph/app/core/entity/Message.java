package com.lph.app.core.entity;

import org.springframework.beans.factory.annotation.Value;
public class Message {

    @Value("${message.name}")
    private String name;
    
    @Value("${message.address}")
    private String address;
    
    @Value("${message.age}")
    private String age;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Message(String name, String address, String age) {
	super();
	this.name = name;
	this.address = address;
	this.age = age;
    }

    public Message() {
	super();
	// TODO Auto-generated constructor stub
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
	return "Message [name=" + name + ", address=" + address + ", age=" + age + "]";
    }
}
