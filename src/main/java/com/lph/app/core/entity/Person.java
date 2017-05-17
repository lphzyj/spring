package com.lph.app.core.entity;

import java.util.Set;

public class Person {

    public Person() {
	super();
	// TODO Auto-generated constructor stub
    }

    private String name;

    private String address;

    private Integer age;

    public Person(String name, String address, Integer age, Set<Ability> ability) {
	super();
	this.name = name;
	this.address = address;
	this.age = age;
	this.ability = ability;
    }

    public Person(String name, String address, Integer age) {
	super();
	this.name = name;
	this.address = address;
	this.age = age;
    }

    public Person(String name, Integer age, String address) {
	super();
	this.name = name;
	this.address = address;
	this.age = age;
    }

    private Set<Ability> ability;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    @Override
    public String toString() {
	return "Person [name=" + name + ", address=" + address + ", age=" + age + "]";
    }

    public Set<Ability> getAbility() {
	return ability;
    }

    public void setAbility(Set<Ability> ability) {
	this.ability = ability;
    }

    public String getAddress() {
	return address;
    }

    public Integer getAge() {
	return age;
    }

    public void setAddress(String address) {
	this.address = address;
    }

    public void setAge(Integer age) {
	this.age = age;
    }

}
