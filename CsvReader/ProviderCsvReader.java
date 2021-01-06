package assignment1.CsvReader;
import assignment1.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ProviderCsvReader {
    public static List<Provider> readProvidercsv(String path) {
        List<Provider> providers = new ArrayList<>();
        try{
        Scanner scanner = new Scanner(new File(path));
        String headerLine = scanner.hasNextLine() ? scanner.nextLine(): null;
        System.out.println(headerLine);
        while (scanner.hasNextLine())
            lecturers.add(getRecordFromLine(scanner.nextLine()));
        } catch(FileNotFoundException e) {};
        return providers;
      }
      
      private static Provider getRecordFromLine(String line) {
          Provider s = new Provider("ede",2001,"2309","IT","master",34,234,6);
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
    
      public static printData(String path) {
        List<Provider> providers = readProvidercsv();
        providers.forEach((provider) -> System.out.println(provider.getId()
        +","+provider.getName()
        +","+provider.getYob()
        +","+provider.getDepartment()
        +","+provider.getDegree()
        +","+provider.getYearstart()
        +","+provider.getClasses()
        )); 
      }
    
}
