package kodlamaio.devs.business.abstracts;

import java.util.List;

import kodlamaio.devs.entities.concretes.Language;

public interface LanguageService {
	void add(Language language);

	void update(int id, String name);

	void delete(int id);

	String getId(int id);

	List<Language> getAll();
}
