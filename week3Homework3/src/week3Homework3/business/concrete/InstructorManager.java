package week3Homework3.business.concrete;

import week3Homework3.business.abstracts.InstructorService;
import week3Homework3.core.abstracts.Logger;
import week3Homework3.dataAccess.abstracts.InstructorDao;
import week3Homework3.entities.concrete.Instructor;

public class InstructorManager implements InstructorService {
	private InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	@Override
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		for (Logger logger : loggers) {
			logger.log("Loglandi");
		}
	}

	@Override
	public void delete(Instructor instructor) {
		instructorDao.delete(instructor);
	}

	@Override
	public void update(Instructor instructor) {
		instructorDao.update(instructor);
	}

}
