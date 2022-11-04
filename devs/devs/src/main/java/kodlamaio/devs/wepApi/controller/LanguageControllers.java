package kodlamaio.devs.wepApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.devs.business.abstracts.LanguageService;
import kodlamaio.devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguageControllers {

	private LanguageService languageService;

	@Autowired
	public LanguageControllers(LanguageService languageService) {
		this.languageService = languageService;
	}

	@PostMapping("/addLanguage")
	public void add(@RequestBody Language language) {
		languageService.add(language);
	}

	@PutMapping("/updateLanguage")
	public void update(int id, String name) {
		languageService.update(id, name);
	}

	@DeleteMapping("/deleteLanguage")
	public void delete(@RequestParam int id) {
		languageService.delete(id);
	}

	@GetMapping("/getId/{id}")
	public String getId(@PathVariable int id) {
		return languageService.getId(id);
	}

	@GetMapping("/getall")
	public List<Language> getAll() {

		return languageService.getAll();
	}
}
