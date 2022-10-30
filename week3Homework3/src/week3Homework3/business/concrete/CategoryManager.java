package week3Homework3.business.concrete;

import week3Homework3.business.abstracts.CategoryService;
import week3Homework3.core.abstracts.Logger;
import week3Homework3.dataAccess.abstracts.CategoryDao;
import week3Homework3.entities.concrete.Category;

public class CategoryManager implements CategoryService {

	private CategoryDao categoryDao;
	private Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	@Override
	public void add(Category category) throws Exception {
		Category[] categories = { new Category(1, "Backend"), new Category(2, "Frontend"), new Category(3, "Mobile") };
		for (Category category2 : categories) {
			if (category.getName() == category2.getName()) {
			throw new Exception("Kategori ismi tekrar etmez.");
			}
		}
		categoryDao.add(category);
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}

	@Override
	public void delete(Category category) {
		categoryDao.delete(category);
	}

	@Override
	public void update(Category category) {
		categoryDao.update(category);
	}

}
