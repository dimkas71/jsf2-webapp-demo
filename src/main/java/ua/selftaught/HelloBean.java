package ua.selftaught;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloBean {
	
	private String message;
	
	public HelloBean() {}
		
	
	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}



	public String greetings() {
		return "Hello," + message;
	}
}
