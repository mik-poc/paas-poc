package dk.bec.paas.poc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaaSPocApplication implements CommandLineRunner{
	
	@Autowired
	private PersonRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		String[] split = "Michael Jackson,Søren Spætte,Santa Claus,Hans Hansen,Peter Petersen".split(",");
        for (String string : split) {
			String[] split2 = string.split(" ");
			userRepository.save(new Person(split2[0],split2[1]));
		}
	
	}

	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(PaaSPocApplication.class, args);
	}


	
	
}
