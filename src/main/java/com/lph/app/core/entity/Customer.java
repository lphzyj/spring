package com.lph.app.core.entity;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.lph.app.core.annotation.Mandatory;

@Component("customer")
public class Customer {

    private List<Object> lists;

    private Set<Object> sets;

    private Map<Object, Object> maps;

    private Properties pros;

    private Address address;

    private Date date;
    
    @Value("#{item}")
    private Item item;
    
    @Value("#{item.name}")
    private String itemName;

//    @Autowired//字段
//    @Qualifier("personB")
    private Person person;

    private String action;

    public Customer(Person person, int custId, String name, int age) {
	super();
	this.person = person;
	this.custId = custId;
	this.name = name;
	this.age = age;
    }

//    @Autowired(required=false)//构造函数注入
    public Customer(Person person) {
	super();
	this.person = person;
    }

    public Customer(String name, int age) {
	super();
	this.name = name;
	this.age = age;
    }

    int custId;
    String name;
    int age;

    public int getCustId() {
	return custId;
    }

    public String getName() {
	return name;
    }

    public Customer(int custId, String name, int age) {
	super();
	this.custId = custId;
	this.name = name;
	this.age = age;
    }

    public Customer() {
	super();
	// TODO Auto-generated constructor stub
    }

    public int getAge() {
	return age;
    }

    public void setCustId(int custId) {
	this.custId = custId;
    }

    public void setName(String name) {
	this.name = name;
    }

    public void setAge(int age) {
	this.age = age;
    }

    @Override
    public String toString() {
	return "Customer [date=" + date + "]";
    }

    public Person getPerson() {
	return person;
    }

    public Customer(Person person, String action) {
	super();
	this.person = person;
	this.action = action;
    }

    // @Autowired//set属性
//    @Required
    /*
     * 简单地套用@Required注解不会强制执行该属性的检查，
     * 还需要注册一个RequiredAnnotationBeanPostProcessor
     * 以了解在bean配置文件@Required注解。
     * RequiredAnnotationBeanPostProcessor可以用两种方式来启用。
     * 不加此验证 不设置该属性也不会报错
     * 加此验证后 不设置会抛出BeanInitializationException异常
     */
    
//    @Mandatory
    /*
     * 自定义@Required-style注解，相当于@Required注解
     * 还需要注册它才能使用
     * 注册到“RequiredAnnotationBeanPostProcessor' 类
     */
    public void setPerson(Person person) {
	this.person = person;
    }

    public List<Object> getLists() {
	return lists;
    }

    public Set<Object> getSets() {
	return sets;
    }

    public Map<Object, Object> getMaps() {
	return maps;
    }

    public Properties getPros() {
	return pros;
    }

    public void setLists(List<Object> lists) {
	this.lists = lists;
    }

    public void setSets(Set<Object> sets) {
	this.sets = sets;
    }

    public void setMaps(Map<Object, Object> maps) {
	this.maps = maps;
    }

    public void setPros(Properties pros) {
	this.pros = pros;
    }

    public Address getAddress() {
	return address;
    }

    public void setAddress(Address address) {
	this.address = address;
    }

    public String getAction() {
	return action;
    }

    public void setAction(String action) {
	this.action = action;
    }

    public Date getDate() {
	return date;
    }

    public void setDate(Date date) {
	this.date = date;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
