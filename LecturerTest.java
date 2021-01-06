package assignment1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LecturerTest {
    Lecturer s = new Lecturer("Minh",1988, "198", "CSE","master",5, 2019, 4);
    @Test 
    public void testSetId(){
        s.setId("198");
        assertEquals("False","198",s.getId());
    }
    @Test
    public void testSetName(){
        s.setName("Minh");
        assertEquals("False","Minh",s.getName());
    }
    @Test
    public void testSetYob(){
        s.setYob(1988);
        assertEquals("False",1988,s.getYob());
    }
    @Test
    public void testSetDepartment(){
        s.setDepartment("CSE");
        assertEquals("False","CSE",s.getDepartment());
    }
    @Test
    public void testSetDegree(){
        s.setDegree("master");
        assertEquals("False","master",s.getDegree());
    }
    @Test
    public void testSetPayroll(){
        s.setPayroll(5);
        assertEquals("False",5,s.getPayroll());
    }
    @Test
    public void testSetYearStart(){
        s.setYearstart(2019);
        assertEquals("False",2019,s.getYearstart());
    }
    @Test
    public void testSetClasses(){
        s.setClasses(4);
        assertEquals("False",4,s.getClasses());
    }
    @Test
    public void testGetAllowance(){
        s.setDegree("master");
        assertEquals("False",900,s.getAllowance());
        s.setDegree("bachelor");
        assertEquals("False",300,s.getAllowance());
        s.setDegree("phd");
        assertEquals("False",2000,s.getAllowance());
    }
    @Test
    public void testGetSalary(){
        s.setDegree("master");
        //5*1000 + 900 + 4*45;
        assertEquals("False",6080,s.getAllowance(),s.getSalary());
        s.setDegree("bachelor");
        assertEquals("False",5780,s.getAllowance(),s.getSalary());
        s.setDegree("phd");
        assertEquals("False",7180,s.getAllowance(),s.getSalary());
    }
    @Test
    public void testAccount(){
        assertEquals("False",10,s.credit(10));
        assertEquals("False",6,s.debit(4));
        assertEquals("False",6,s.getBalance());
    }

}
