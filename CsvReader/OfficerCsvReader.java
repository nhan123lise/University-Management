package assignment1.CsvReader;
import assignment1.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OfficerCsvReader {
    public static List<Officer> createOfficer()  {
        UniversityFactory school = new UniversityFactory();
        return school.createOfficers();
      }
    public static List<Officer> readOfficercsv(String path) {
        List<Officer> officers = new ArrayList<>();
        try{
        Scanner scanner = new Scanner(new File(path));
        String headerLine = scanner.hasNextLine() ? scanner.nextLine(): null;
        System.out.println(headerLine);
        while (scanner.hasNextLine())
            officers.add(getRecordFromLine(scanner.nextLine()));
        } catch(FileNotFoundException e) {};
        return officers;
    }
      
    private static Officer getRecordFromLine(String line) {
        Officer s = new Officer("2345","nguyen",1994,"Marketing",5,19,"manager");
        String[] fields = line.split(",");
        s.setId(fields[0]);
        s.setName(fields[1]);
        s.setYob(Integer.parseInt(fields[2]));
        s.setTeam(fields[3]);
        s.setlevel(fields[4]);
        s.setDaywork(Integer.parseInt(fields[5]));
        return s;
    }
    
    public void printData(String path) {
    List<Officer> officers = readOfficercsv(path);
    officers.forEach((officer) -> System.out.println(officer.getId()
    +","+officer.getName()
    +","+officer.getYob()
    +","+officer.getTeam()
    +","+officer.getLevel()
    +","+officer.getDaywork()
    )); 
    }
    
}
