package springExample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory f = new XmlBeanFactory(r);
		
		Hello_XML h1 = (Hello_XML) f.getBean("xmlbean");
		h1.displayInfo();
	}

}
