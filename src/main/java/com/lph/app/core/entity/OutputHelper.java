package com.lph.app.core.entity;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.lph.app.core.dao.IOutputGenerator;

@Service
public class OutputHelper {
    public OutputHelper() {
	super();
	// TODO Auto-generated constructor stub
    }

    @Resource(name = "jsonOutputGenerator")
    IOutputGenerator outputGenerator;

    /*
     * set注入方式
     */
    public void setOutputGenerator(IOutputGenerator outputGenerator) {
	this.outputGenerator = outputGenerator;
    }

    public IOutputGenerator getOutputGenerator() {
	return outputGenerator;
    }

    /*
     * 构造注入方式
     */
//    OutputHelper(IOutputGenerator outputGenerator) {
//	this.outputGenerator = outputGenerator;
//    }

}