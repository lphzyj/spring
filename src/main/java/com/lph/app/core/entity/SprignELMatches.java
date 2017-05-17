package com.lph.app.core.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("sprignELMatches")
public class SprignELMatches {
    // email regular expression
    String emailRegEx = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)" + "*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    // if this is a digit?
    @Value("#{'100' matches '\\d+' }")
    private boolean validDigit;

    // if this is a digit + ternary operator
    @Value("#{ ('100' matches '\\d+') == true ? " + "'yes this is digit' : 'No this is not a digit'  }")
    private String msg;

    // if this emailBean.emailAddress contains a valid email address?
    @Value("#{email.emailAddress matches sprignELMatches.emailRegEx}")
    private boolean validEmail;

    public String getEmailRegEx() {
	return emailRegEx;
    }

    public boolean isValidDigit() {
	return validDigit;
    }

    public String getMsg() {
	return msg;
    }

    public boolean isValidEmail() {
	return validEmail;
    }

    public void setEmailRegEx(String emailRegEx) {
	this.emailRegEx = emailRegEx;
    }

    public void setValidDigit(boolean validDigit) {
	this.validDigit = validDigit;
    }

    public void setMsg(String msg) {
	this.msg = msg;
    }

    public void setValidEmail(boolean validEmail) {
	this.validEmail = validEmail;
    }

    @Override
    public String toString() {
	return "SprignELMatches [emailRegEx=" + emailRegEx + ", validDigit=" + validDigit + ", msg=" + msg
		+ ", validEmail=" + validEmail + "]";
    }
}
