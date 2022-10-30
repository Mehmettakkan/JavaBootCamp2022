package week3Homework3.dataAccess.concrete;

import java.util.ArrayList;
import java.util.List;

import week3Homework3.dataAccess.abstracts.CategoryDao;
import week3Homework3.entities.concrete.Category;

public class HipernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hipernate ile Kategory veritabanina eklendi: " + category.getName());
	}

	@Override
	public void delete(Category category) {
		System.out.println("Hipernate ile Kategory veritabanindan silindi: " + category.getName());

	}

	@Override
	public void update(Category category) {
		System.out.println("Hipernate ile Kategory veritabaninda guncellendi: " + category.getName());

	}

	List<Category> categories = new ArrayList<>();

	@Override
	public List<Category> gelAll() {
		return categories;
	}

}
