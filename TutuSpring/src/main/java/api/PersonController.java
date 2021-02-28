package api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Person;
import service.PersonService;
@RequestMapping("api/v1/person")
@RestController
public class PersonController {
	private final PersonService perseonService;
    @Autowired
	public PersonController(PersonService perseonService) {
		super();
		this.perseonService = perseonService;
	}
    @PostMapping
  public void addPerson(@RequestBody Person person) {
	  perseonService.addPerson(person);
  }
    @GetMapping
    public List<Person> getAllPeople() {
    	
    	return perseonService.getAllPeople();
    }
}
