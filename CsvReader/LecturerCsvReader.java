package assignment1.CsvReader;

import assignment1.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

  public class LecturerCsvReader {
      // private List<Lecturer> list;
    public static List<Lecturer> createLecturer()  {
      UniversityFactory school = new UniversityFactory();
      return school.createLecturers();
    }

    public static List<Lecturer> readLecturercsv(String path) {

      List<Lecturer> lecturers = new ArrayList<>();
      try{
        Scanner scanner = new Scanner(new File(path)); 
        String headerLine = scanner.hasNextLine() ? scanner.nextLine(): null;
        System.out.println(headerLine);
        while (scanner.hasNextLine())
            lecturers.add(getRecordFromLine(scanner.nextLine()));
      } catch(FileNotFoundException e) {};
      return lecturers;
    }
    
    private static Lecturer getRecordFromLine(String line) {
        Lecturer s = new Lecturer("ede",2001,"2309","IT","master",34,234,6);
        String[] fields = line.split(",");
        s.setId(fields[0]);
        s.setName(fields[1]);
        s.setYob(Integer.parseInt(fields[2]));
        s.setDepartment(fields[3]);
        s.setDegree(fields[4]);
        s.setYearstart(Integer.parseInt(fields[5]));
        s.setClasses(Integer.parseInt(fields[6]));
        return s;
    }

    public void printData(String path){
      List<Lecturer> lecturers = readLecturercsv(path);
      lecturers.forEach((lecturer) -> System.out.println(lecturer.getId()
      +","+lecturer.getName()
      +","+lecturer.getYob()
      +","+lecturer.getDepartment()
      +","+lecturer.getDegree()
      +","+lecturer.getYearstart()
      +","+lecturer.getClasses()
      )); 
    }
  
    public static void main(String[] args) {
      // List<Lecturer> lecturers = readLecturercsv();
      // lecturers.forEach((lecturer) -> System.out.println(lecturer.getId()
      // +","+lecturer.getName()
      // +","+lecturer.getYob()
      // +","+lecturer.getDepartment()
      // +","+lecturer.getDegree()
      // +","+lecturer.getYearstart()
      // +","+lecturer.getClasses()
      // )); 
    }
    
}
