package assignment1;

import java.util.List;

public interface UniversityAbstractFactory {
  List<Student> createStudents();
  List<Officer> creatOfficers();
  List<SeasonalStaff> creaSeasonalStaffs(); 
  List<Lecturer> createLecturers();
  List<Provider> createProviders();
  List<Transaction> createTransactions();
}
