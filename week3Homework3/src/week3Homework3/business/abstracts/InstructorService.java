package week3Homework3.business.abstracts;

import week3Homework3.entities.concrete.Instructor;

public interface InstructorService {
	void add(Instructor instructor);

	void delete(Instructor instructor);

	void update(Instructor instructor);
}
