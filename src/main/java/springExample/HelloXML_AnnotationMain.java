package springExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloXML_AnnotationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Hello_XML_Annotation h2 = (Hello_XML_Annotation) context.getBean("hello_XML_Annotation");
		
		h2.displayinfo();
	}

}
