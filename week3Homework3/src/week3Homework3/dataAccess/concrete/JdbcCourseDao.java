package week3Homework3.dataAccess.concrete;

import java.util.ArrayList;
import java.util.List;

import week3Homework3.dataAccess.abstracts.CourseDao;
import week3Homework3.entities.concrete.Course;

public class JdbcCourseDao implements CourseDao {
	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile Kurs veritabanina eklendi: " + course.getName());
	}

	@Override
	public void delete(Course course) {
		System.out.println("Jdbc ile Kurs veritabanindan silindi: " + course.getName());
	}

	@Override
	public void update(Course course) {
		System.out.println("Jdbc ile Kurs veritabaninda guncellendi: " + course.getName());
	}

	List<Course> courses = new ArrayList<>();

	@Override
	public List<Course> gelAll() {
		return courses;
	}
}
