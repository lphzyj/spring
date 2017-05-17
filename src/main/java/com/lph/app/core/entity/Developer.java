package com.lph.app.core.entity;

public class Developer {

    
    public Developer(Language language) {
	super();
	this.language = language;
    }

    private String name;
    
    public Developer(String name, Language language) {
	super();
	this.name = name;
	this.language = language;
    }

    private Language language;

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Developer() {
	super();
	// TODO Auto-generated constructor stub
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
	return "Developer [name=" + name + ", language=" + language + "]";
    }
    
}
