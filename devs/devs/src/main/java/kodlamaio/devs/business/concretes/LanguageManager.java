package kodlamaio.devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.devs.business.abstracts.LanguageService;
import kodlamaio.devs.dataAccess.abstracts.LanguageRepository;
import kodlamaio.devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	private LanguageRepository languageRepository;
	
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public void add(Language language) {
		if (!checkName(language)) {
			if (!language.getName().equals("")) {
				this.languageRepository.add(language);
			} else {
				throw new RuntimeException("Name bos gecilemez.");
			}
		}
	}

	public boolean checkName(Language language) {
		boolean check = false;
		for (Language language2 : languageRepository.getAll()) {
			if (language2.getName().equals(language.getName()) || language2.getId() == language.getId()) {
				check = true;
			}
		}
		return check;
	}

	@Override
	public void update(int id, String name) {
		this.languageRepository.update(id, name);
	}

	@Override
	public void delete(int id) {
		this.languageRepository.delete(id);
	}

	@Override
	public String getId(int id) {
		return this.languageRepository.getId(id);
	}

	@Override
	public List<Language> getAll() {

		return this.languageRepository.getAll();
	}

}
