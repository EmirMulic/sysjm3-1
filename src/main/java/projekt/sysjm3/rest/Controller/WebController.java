package projekt.sysjm3.rest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import projekt.sysjm3.rest.Service.PersonService;

@Controller
public class WebController {

	@Autowired
	PersonService personService;
	
	

	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("persons", personService.getAllPersons());
		return "index";
	}
	


}