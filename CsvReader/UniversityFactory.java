package assignment1.CsvReader;
import java.util.ArrayList;
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
	public List<Students> createStudents() {
		return new ArrayList<Students>();
	}

	@Override
	public List<SeasonalStaff> createSeasonalStaffs() {
		return new ArrayList<SeasonalStaff>();
	}
	@Override
	public List<FulltimeStaff> createFulltimeStaffs() {
		return new ArrayList<FulltimeStaff>();
    }   
    
}
