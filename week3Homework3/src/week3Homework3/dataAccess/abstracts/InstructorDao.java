package week3Homework3.dataAccess.abstracts;

import java.util.List;

import week3Homework3.entities.concrete.Instructor;

public interface InstructorDao {
	void add(Instructor instructor);

	void delete(Instructor instructor);

	void update(Instructor instructor);

	List<Instructor> gelAll();
}
