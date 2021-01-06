package assignment1.CsvReader;
import assignment1.*;

import java.util.List;

public interface UniversityAbstractFactory {
  List<Student> createStudents();
  List<Officer> createOfficers();
  List<SeasonalStaff> createSeasonalStaffs(); 
  List<Lecturer> createLecturers();
  List<Provider> createProviders();
  List<Transaction> createTransactions();
}
