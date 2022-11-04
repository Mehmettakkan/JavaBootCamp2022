package kodlamaio.devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlamaio.devs.dataAccess.abstracts.LanguageRepository;
import kodlamaio.devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
	private List<Language> languageList;

	public InMemoryLanguageRepository() {
		languageList = new ArrayList<Language>();
		languageList.add(new Language(1, "Java"));
		languageList.add(new Language(2, "C"));
		languageList.add(new Language(3, "C++"));
		languageList.add(new Language(4, "Python"));

	}

	@Override
	public void add(Language language) {
		this.languageList.add(language);
	}

	@Override
	public void update(int id, String name) {
		this.languageList.get(id).setName(name);
	}

	@Override
	public void delete(int id) {
		this.languageList.remove(id);
	}

	@Override
	public String getId(int id) {

		return this.languageList.get(id).getName();
	}

	@Override
	public List<Language> getAll() {

		return this.languageList;
	}

}
