package week3Homework3.dataAccess.abstracts;

import java.util.List;

import week3Homework3.entities.concrete.Category;

public interface CategoryDao {
	
	void add(Category category);

	void delete(Category category);

	void update(Category category);

	List<Category> gelAll();
}
