package in.manish.java;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Message implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
         int i=10;
         System.out.println("I value :"+i);
	}

}
