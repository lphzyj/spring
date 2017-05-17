package com.lph.app.core.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("collections")
public class Collections {
    private Map<String, String> map;
    private List<String> list;

    public Collections() {
		map = new HashMap<String, String>();
		map.put("MapA", "This is MapA");
		map.put("MapB", "This is MapB");
		map.put("MapC", "This is MapC");

		list = new ArrayList<String>();
		list.add("List0");
		list.add("List1");
		list.add("List2");

	}

    public Map<String, String> getMap() {
	return map;
    }

    public void setMap(Map<String, String> map) {
	this.map = map;
    }

    public List<String> getList() {
	return list;
    }

    public void setList(List<String> list) {
	this.list = list;
    }

}
