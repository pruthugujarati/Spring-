package springExample;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Hello_Annotation {

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void disp() {
		System.out.println("Hello Spring using only Annotation "+name);
	}
}
