package assignment1.CsvReader;
import java.util.*;
import assignment1.*;

public class UniversityFactory implements UniversityAbstractFactory {
    @Override
	public List<Lecturer> createLecturers() {
	    return new ArrayList<Lecturer>();
	  }
	@Override
	public List<Provider> createProviders() {
		return new ArrayList<Provider>();
	}
	@Override
	public List<Transaction> createTransactions() {
		return new ArrayList<Transaction>();
	}
	@Override
	public List<Student> createStudents() {
		return new ArrayList<Student>();
	}

	@Override
	public List<SeasonalStaff> createSeasonalStaffs() {
		return new ArrayList<SeasonalStaff>();
	}
	@Override
	public List<Officer> createOfficers() {
		return new ArrayList<FulltimeStaff>();
    }   
    
}
