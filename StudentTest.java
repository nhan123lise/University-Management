package assignment1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StudentTest {
    Student s = new Student("190402","Nhan", 5, 460);

    @Test
    public void testSetId() {
        s.setId("190402");
        assertEquals("False", "190402", s.getId());
    }
    @Test
    public void testSetName(){
        s.setName("Nhan");
        assertEquals("False", "Nhan", s.getName());
    }
    @Test
    public void testsetnumberCredits(){
        s.setnumberCredits(5);
        assertEquals("False",5,s.getnumberCredits());
    }
    @Test
    public void testsetbillCredits(){
        s.setbillCredits(460);
        assertEquals("False",460,s.getbillCredits());
    }
    @Test
    public void testTuitionfee(){
        assertEquals("False",2300,s.tuitionfee());
    }
    
}
