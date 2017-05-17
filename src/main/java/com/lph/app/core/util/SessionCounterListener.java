package com.lph.app.core.util;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.lph.app.core.service.CounterService;

public class SessionCounterListener implements HttpSessionListener {

    private static int totalActiveSessions;

    public static int getTotalActiveSession() {
	return totalActiveSessions;
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
	totalActiveSessions++;
	System.out.println("sessionCreated - add one session into counter");
	printCounter(se);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
	totalActiveSessions--;
	System.out.println("sessionDestroyed - deduct one session from counter");
	printCounter(se);
    }

    private void printCounter(HttpSessionEvent sessionEvent) {

	HttpSession session = sessionEvent.getSession();

	ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(session.getServletContext());

	CounterService counterService = (CounterService) ctx.getBean("counterService");

	counterService.printCounter(totalActiveSessions);
    }

}
