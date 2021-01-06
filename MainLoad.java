package assignment1;

import assignment1.CsvReader.*;
import assignment1.Lecturer;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;

public class MainLoad {
    private static String path1;
    private static String path2;
    private static String path3;
    private static String path4;
    private static String path5;
    private static String path6;
    private static List<Lecturer> lecturers;
    private static List<Officer> officers;
    private static List<SeasonalStaff> seasonalStaffs;
    private static List<Student> students;
    private static List<Provider> providers;
    private static List<Transaction> transactions;

    private final Scanner input = new Scanner(System.in);
    public static void Menu() {
        int choose;
            System.out.print("1. Read date from file: ");
            System.out.print("2. Display data: ");
            System.out.print("3. Initialize data: ");
            System.out.print("4. Change salary and caculating year: ");
            System.out.print("5. Report: ");
            System.out.print("6. Exit:  ");
            System.out.print("Choose function:  ");
            do{
            choose = new Scanner(System.in).nextInt();
            switch(choose){
            case 1:
            Menu1();
            break;
            case 2:
            Menu2();
            break;
            case 3:
            Menu3();
            break;
            case 4:
            // Menu4();
            break;
            case 5:
            // Menu5();
            break;
            case 6:
            // Menu6();
            break;
            default:
                System.out.println("Invalid entry, please enter again! 🙂");
                break;
            }
        }while(choose < 1 || choose > 6);
    
    }
    public static void Menu1() {
            int choose;
                System.out.println("------------------MENU1----------------");
                System.out.println("");
                System.out.println("1.1: Information of Lecturers: ");
                System.out.println("1.2: Information of Officers:  ");
                System.out.println("1.3: Information of Seasonal Staffs:  ");
                System.out.println("1.4: Information of Students:  ");
                System.out.println("1.5: Information of Operation Costs ");
                System.out.println("1.6: Information of Transaction ");
                System.out.println("1.7: Back to main menu ");
                do {
                    System.out.print("Enter your choice: ");
                    choose = new Scanner(System.in).nextInt();
                    switch(choose) {
                    case 1: 
                        System.out.println("Fill file path: ");
                        path1 = new Scanner(System.in).nextLine();
                        if(path1.equals("")){
                            path1 = "assignment1/CsvReader/Lecturer.csv";
                        }
                        lecturers = LecturerCsvReader.readLecturercsv(path1);
                        break;
                    case 2:
                        System.out.println("Fill file path: ");
                        path2 = new Scanner(System.in).nextLine();
                        if(path2.equals("")){
                            path2 = "assignment1/CsvReader/Officer.csv";
                        }
                        officers = OfficerCsvReader.readOfficercsv(path2);
                        break;
                    case 3:
                        System.out.println("Fill file path: ");
                        path3 = new Scanner(System.in).nextLine();
                        if(path3.equals("")){
                            path3 = "assignment1/CsvReader/SeasonalStaffs.csv";
                        }
                        seasonalStaffs = SeasonalStaffCsvReader.readSeasonalStaffcsv(path3);
                        break;
                    case 4:
                        System.out.print("Fill file path: ");
                        path4 = new Scanner(System.in).nextLine();
                        if(path4 == "") {
                            path4 = "assignment1/CsvReader/Student.csv";
                        }
                        break;
                    case 5:
                        System.out.print("Information of Operation Costs");
                        path5 = new Scanner(System.in).nextLine();
                        if(path5 == "") {
                            path5 = "assignment1/CsvReader/Provider.csv";
                        }
                        break;
                    case 6:
                        System.out.print("Information of Transaction");
                        path6 = new Scanner(System.in).nextLine();
                        if(path6 == "") {
                            path6 = "assignment1/CsvReader/Transaction.csv";
                        }
                        break;
                    case 7:
                        Menu();
                        break;
                    default:
                        System.out.println("Back to main menu");
                        break;
                    }
                }while(choose < 1 || choose > 6);
            
        }
        public static void Menu2() {
            int choose;
                System.out.println("------------------MENU2----------------");
                System.out.println("");
                System.out.println("2.1 ");
                System.out.println("2.2 ");
                System.out.println("2.3 ");
                System.out.println("2.4 ");
                System.out.println("2.5 ");
                System.out.println("2.6 ");
                System.out.println("2.7 ");
                do {
                    System.out.print(" ");
                    choose = new Scanner(System.in).nextInt();
                    switch(choose) {
                    case 1: 
                        LecturerCsvReader obj = new LecturerCsvReader();
                        List<Lecturer> list = obj.readLecturercsv(path1); //ye?
                        obj.printData(path1);
                        // LecturerCsvReader(path1); Ua cai dong nay la sao? la doc file CSV tu class by ban em bay :))
                        break;
                    case 2:
                        OfficerCsvReader(path2);
                        break;
                    
                    case 3:
                        SeasonalStaffCsvReader(path3);
                        break;
                    case 4:
                        StudentCsvReader(path4);
                        break;
                    case 5:
                        ProviderCsvReader(path5);
                        break;
                    case 6:
                        TransactionCsvReader(path6);
                        break;
                    case 7:
                        Menu();
                        break;
                    default:
                        System.out.println("Back to main menu");
                        break;
                    }
                }while(choose < 1 || choose > 6);
            
        }
        public static void Menu3() {
            path1 = null;
            path2 = null;
            path3 = null;
            path4 = null;
            path5 = null;
            path6 = null;
            lecturers = LecturerCsvReader.readLecturercsv(path1);
            
        }
        public static void main(String[] args){
            Menu();
        }



}
