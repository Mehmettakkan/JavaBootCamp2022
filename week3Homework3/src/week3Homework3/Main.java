package week3Homework3;

import week3Homework3.business.concrete.CategoryManager;
import week3Homework3.business.concrete.CourseManager;
import week3Homework3.business.concrete.InstructorManager;
import week3Homework3.core.abstracts.Logger;
import week3Homework3.core.concrete.DatabaseLogger;
import week3Homework3.core.concrete.EmailLogger;
import week3Homework3.core.concrete.FileLogger;
import week3Homework3.core.concrete.SmsLogger;
import week3Homework3.dataAccess.concrete.HipernateCategoryDao;
import week3Homework3.dataAccess.concrete.HipernateCourseDao;
import week3Homework3.dataAccess.concrete.HipernateInstructorDao;
import week3Homework3.entities.concrete.Category;
import week3Homework3.entities.concrete.Course;
import week3Homework3.entities.concrete.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Logger[] loggers = { new DatabaseLogger(), new EmailLogger(), new FileLogger(), new SmsLogger() };

		Category category = new Category(3, "Sql");
		CategoryManager categoryManager = new CategoryManager(new HipernateCategoryDao(), loggers);
		categoryManager.add(category);
		System.out.println();
		
		Course course = new Course(4, "Python", "Engin Demirog", "Yapay Zeka", 30);
		CourseManager courseManager = new CourseManager(new HipernateCourseDao(), loggers);
		courseManager.add(course);
		System.out.println();
		
		Instructor instructor = new Instructor("Engin", "Demirog", "MCT", "Backend");
		InstructorManager instructorManager = new InstructorManager(new HipernateInstructorDao(), loggers);
		instructorManager.add(instructor);
	}

}
