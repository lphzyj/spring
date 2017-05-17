package com.lph.app.core.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("springELCon")
public class SpringElCollection {

    @Value("#{collections.map['MapA']}")
    private String mapA;

    @Value("#{collections.list[0]}")
    private String list;

    public String getMapA() {
	return mapA;
    }

    public void setMapA(String mapA) {
	this.mapA = mapA;
    }

    public String getList() {
	return list;
    }

    public void setList(String list) {
	this.list = list;
    }

    @Override
    public String toString() {
	return "Customer [mapA=" + mapA + ", list=" + list + "]";
    }
}
