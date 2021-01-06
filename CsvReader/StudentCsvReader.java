package assignment1.CsvReader;
import assignment1.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentCsvReader {

  public static List<Student> readStudentcsv(String path) {
    List<Student> students = new ArrayList<>();
    try{
    Scanner scanner = new Scanner(new File(path));
    String headerLine = scanner.hasNextLine() ? scanner.nextLine(): null;
    System.out.println(headerLine);
    while (scanner.hasNextLine())
        students.add(getRecordFromLine(scanner.nextLine()));
    } catch(FileNotFoundException e) {};
    return students;
  }
  
  private static Student getRecordFromLine(String line) {
      Student s = new Student("ede","fe",234,6);
      String[] fields = line.split(",");
      s.setId(fields[0]);
      s.setName(fields[1]);
      s.setnumberCredits(Integer.parseInt(fields[2]));
      return s;
  }

  public void printData(String path) {
    List<Student> students = readStudentcsv(path);
    students.forEach((student) -> System.out.println(student.getId()+","+student.getName()+","+student.getnumberCredits())); 
  }
  // public void printData(String path){
  //   List<Lecturer> lecturers = readLecturercsv(path);
  //   lecturers.forEach((lecturer) -> System.out.println(lecturer.getId()
  //   +","+lecturer.getName()
  //   +","+lecturer.getYob()
  //   +","+lecturer.getDepartment()
  //   +","+lecturer.getDegree()
  //   +","+lecturer.getYearstart()
  //   +","+lecturer.getClasses()
  //   )); 
  // }
}
