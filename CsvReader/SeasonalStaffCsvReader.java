package assignment1.CsvReader;
import assignment1.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeasonalStaffCsvReader {
    public static List<SeasonalStaff> readSeasonalStaffcsv(String path) {
        List<SeasonalStaff> SeasonalStaffs = new ArrayList<>();
        try{
        Scanner scanner = new Scanner(new File(path));
        String headerLine = scanner.hasNextLine() ? scanner.nextLine(): null;
        System.out.println(headerLine);
        while (scanner.hasNextLine())
        SeasonalStaffs.add(getRecordFromLine(scanner.nextLine()));
        } catch(FileNotFoundException e) {};
        return SeasonalStaffs;
    }
      
    private static SeasonalStaff getRecordFromLine(String line) {
        SeasonalStaff s = new SeasonalStaff("Le",2004,"1023",20,33,2023);
        String[] fields = line.split(",");
        s.setId(fields[0]);
        s.setName(fields[1]);
        s.setYob(Integer.parseInt(fields[2]));
        s.setDaywork(Integer.parseInt(fields[3]));
        return s;
    }
    
    public static printData(String path) {
    List<SeasonalStaff> SeasonalStaffs = readSeasonalStaffcsv();
    SeasonalStaff.forEach((SeasonalStaff) -> System.out.println(SeasonalStaff.getId()
    +","+SeasonalStaff.getName()
    +","+SeasonalStaff.getYob()
    +","+SeasonalStaff.getDaywork()
    )); 
    }
    
}
