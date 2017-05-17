package com.lph.app.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.SystemEnvironmentPropertySource;

import com.lph.app.core.common.AppConfig;
import com.lph.app.core.dao.CustomerDAO;
import com.lph.app.core.dao.StockDao;
import com.lph.app.core.entity.Customer;
import com.lph.app.core.entity.CustomerBo;
import com.lph.app.core.entity.Message;
import com.lph.app.core.entity.OutputHelper;
import com.lph.app.core.entity.Person;
import com.lph.app.core.entity.SchedulerBo;
import com.lph.app.core.entity.SprignELMatches;
import com.lph.app.core.entity.SpringAOP;
import com.lph.app.core.entity.SpringElCollection;
import com.lph.app.core.entity.SpringElRelational;
import com.lph.app.core.entity.Stock;
import com.lph.app.core.service.CustomerService;
import com.lph.app.core.util.Mail;

public class App {
    public static void main(String[] args) throws Exception {
	// 从xml文件加载配置信息
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//	HelloWorld obj = (HelloWorld) context.getBean("helloBean");
//	obj.printHello();
//	CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
//	Customer customer = new Customer("lph", 24);
//	customerDAO.insert(customer);
//
//	Customer customer1 = customerDAO.findByCustomerId(2);
//	System.out.println(customer1);
//	
//	List<Customer> customers=customerDAO.findAll();
//	List<Customer> addCustomers=new ArrayList<Customer>(10);
//	for(Customer customer2:customers){
//	    System.out.println(customer2);
////	    customer2.setCustId(customer2.getCustId()+(int)(Math.random()*100));
//	    customer2.setAge(customer2.getAge()+(int)(Math.random()*100));
//	    customer2.setName(customer2.getName()+(int)(Math.random()*100));
//	    addCustomers.add(customer2);
//	}
//	
//	customerDAO.batchUpdate(addCustomers);
//	Customer customer=(Customer) context.getBean("customer");
//	System.out.println(customer);
//	CustomerService customerA=(CustomerService) context.getBean("customerService");
//	customerA.setMessage("Message: Message by custA");
//	System.out.println(customerA.getMessage());
//	
//	CustomerService customerB=(CustomerService) context.getBean("customerService");
//	System.out.println(customerB.getMessage());
//	Person person=(Person) context.getBean("person");
//	System.out.println(person);
//	

//	Developer developer = (Developer) context.getBean("developer");
//	System.out.println(developer);

//	Customer customer=(Customer) context.getBean("customer");
//	System.out.println(customer);

	// 从javaConfig加载配置信息
//	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//	HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
//	helloWorld.printHello();
//
//	CustomerBo customer = (CustomerBo) context.getBean("customer");
//	customer.printMsg("Hello 11");
//
//	SchedulerBo scheduler = (SchedulerBo) context.getBean("scheduler");
//	scheduler.printMsg("Hello 22");

//	Message message = (Message) context.getBean("message");
//	System.out.println(message);

//	OutputHelper outputHelper=(OutputHelper) context.getBean("outputHelper");
//	System.out.println(outputHelper.getOutputGenerator().getClass().getName());

	CustomerService customerService = (CustomerService) context.getBean("customerService");
	System.out.println(customerService);
//	Person person = (Person) context.getBean("person");
//	System.out.println(person);

//	Customer customer = (Customer) context.getBean("customer");
//	System.out.println("lists:"+customer.getLists());
//	System.out.println("sets:"+customer.getSets());
//	System.out.println("maps:"+customer.getMaps());
//	System.out.println(customer.getPerson());

//	System.out.println(customer.getItem() + "  " + customer.getItemName());
//	SpringElRelational springEL = (SpringElRelational) context.getBean("springEL");
//	System.out.println(springEL);
//	SpringElCollection springELCon = (SpringElCollection) context.getBean("springELCon");
//	System.out.println(springELCon);
//
//	SprignELMatches sprignELMatches = (SprignELMatches) context.getBean("sprignELMatches");
//	System.out.println(sprignELMatches);

	// 手动代理，每个bean都需要创建一个代理类
//	SpringAOP springAOP = (SpringAOP) context.getBean("springAOPProxy");
	// 自动代理
//	SpringAOP springAOP = (SpringAOP) context.getBean("springAOP");
//	System.out.println("************");
//	springAOP.printName();
//	System.out.println("************");
//	springAOP.printURL();
//	System.out.println("************");
//	try {
//	    springAOP.printThrowException();
//	} catch (Exception e) {
//	}
//
//	System.out.println("************");

//	CustomerDAO customerDAO=(CustomerDAO) context.getBean("customerDao");
//	customerDAO.addCustomer();
//	customerDAO.addCustomerReturnValue();
//	customerDAO.addCustomerThrowException();
//	customerDAO.addCustomerAround("lph");

	StockDao stockDao = (StockDao) context.getBean("stockBoImpl");

	Stock stock = new Stock();
	stock.setStockCode("7668");
	stock.setStockName("HAIO");
	// insert
	stockDao.save(stock);

	/** select **/
	Stock stock2 = stockDao.findByStockCode("7668");
	System.out.println(stock2);
//
	/** update **/
//	stock2.setStockName("HAIO-1");
//	stockDao.update(stock2);

	/** delete **/
	stockDao.delete(stock2);

	System.out.println("Done");
	
//	Mail mail=(Mail) context.getBean("mail");
//	mail.sendMail("app@smartwasp.com","673653670@qq.com","this is test","text content");
//	mail.sendMail("lph","this test content");
//	mail.sendMail("lph","this test content","D:\\jar\\test.zip");
    }
}