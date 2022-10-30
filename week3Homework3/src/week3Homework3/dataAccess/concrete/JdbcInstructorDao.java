package week3Homework3.dataAccess.concrete;

import java.util.ArrayList;
import java.util.List;

import week3Homework3.dataAccess.abstracts.InstructorDao;
import week3Homework3.entities.concrete.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hipernate ile Egitmen veri tabanina eklendi: " + instructor.getFirsName() + " "
				+ instructor.getLastName());
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Hipernate ile Egitmen veri tabanindan silindi: " + instructor.getFirsName() + " "
				+ instructor.getLastName());
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Hipernate ile Egitmen veri tabaninda guncellendi: " + instructor.getFirsName() + " "
				+ instructor.getLastName());

	}

	List<Instructor> instructors = new ArrayList<>();

	@Override
	public List<Instructor> gelAll() {
		return instructors;
	}

}
