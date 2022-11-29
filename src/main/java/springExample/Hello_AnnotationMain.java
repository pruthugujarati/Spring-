package springExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Hello_AnnotationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	
		Hello_Annotation h3 = context.getBean(Hello_Annotation.class);
		h3.disp();
	
		context.close();
	}

}
