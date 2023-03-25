package com.antara;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class invoiceTest {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("invoiceContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Invoice i = (Invoice) factory.getBean("iBean");
		i.display();
	}
}
