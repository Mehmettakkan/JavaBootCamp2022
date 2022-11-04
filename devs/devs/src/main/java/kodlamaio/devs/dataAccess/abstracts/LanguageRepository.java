package kodlamaio.devs.dataAccess.abstracts;

import java.util.List;

import kodlamaio.devs.entities.concretes.Language;

public interface LanguageRepository {
	void add(Language language);

	void update(int id, String name);

	void delete(int id);

	String getId(int id);

	List<Language> getAll();

}
