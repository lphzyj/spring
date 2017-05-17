package com.lph.app.core.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("item")
public class Item {

    @Value("itemA")
    private String name;
    
    @Value("20")
    private int qty;

    public Item(String name, int qty) {
	super();
	this.name = name;
	this.qty = qty;
    }

    public Item() {
	super();
	// TODO Auto-generated constructor stub
    }

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
	return "Item [name=" + name + ", qty=" + qty + "]";
    }
}
