package week3Homework3.business.concrete;

import week3Homework3.business.abstracts.CourseService;
import week3Homework3.core.abstracts.Logger;
import week3Homework3.dataAccess.abstracts.CourseDao;
import week3Homework3.entities.concrete.Course;

public class CourseManager implements CourseService {
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	@Override
	public void add(Course course) throws Exception {
		Course[] courses = { new Course(1, "Java", "Engin Demirog", "Backend", 10),
				new Course(1, "Javascript", "Engin Demirog", "Frontend", 20) };
		for (Course course3 : courses) {
			if (course.getName() == course3.getName()) {
				throw new Exception("Kurs ismi tekrar edemez");
			} else if (course.getPrice() < 0) {
				throw new Exception("Kurs fiyati sifirdan kucuk olamaz.");
			}
		}
		courseDao.add(course);
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}

	@Override
	public void delete(Course course) {
		courseDao.delete(course);
	}

	@Override
	public void update(Course course) {
		courseDao.update(course);
	}

}
