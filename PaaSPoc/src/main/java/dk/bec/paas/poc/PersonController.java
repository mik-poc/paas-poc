package dk.bec.paas.poc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@Autowired
	private PersonRepository personRepository;

	
	@GetMapping("/persons")
	public List<Person> getUsers (){
		return personRepository.findAll();
	}
}
