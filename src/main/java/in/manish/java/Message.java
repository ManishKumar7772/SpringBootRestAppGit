package in.manish.java;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Message implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
         
		System.out.println("Manish Kumar Welcome to Git");
	}

}
