package week3Homework3.business.abstracts;

import week3Homework3.entities.concrete.Category;

public interface CategoryService {
	void add(Category category) throws Exception;

	void delete(Category category);

	void update(Category category);

}
