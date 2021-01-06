package assignment1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SeasonalStaffTest {
    SeasonalStaff s = new SeasonalStaff("Dep",2000,"34",4,12,300);
    @Test
    public void testSetId(){
        s.setId("34");
        assertEquals("False","34",s.getId());
    }
    @Test
    public void testSetName(){
        s.setName("Dep");
        assertEquals("Fasle","Dep",s.getName());
    }
    @Test
    public void testSetYob(){
        s.setYob(2000);
        assertEquals("False",2000,s.getYob());
    }
    @Test
    public void testSetWorkday(){
        s.setWorkday(4);
        assertEquals("False",4,s.getWorkday());
    }
    @Test
    public void testSetBillWorday(){
        s.setBillworkday(12);
        assertEquals("False",12,s.getBillworkday());
    }
    @Test
    public void testSetRemain(){
        s.setRemain(300);
        assertEquals("False",300,s.getRemain());
    }
    @Test
    public void testAccount(){
        assertEquals("False",10,s.credit(10));
        assertEquals("False",6,s.debit(4));
        assertEquals("False",6,s.getBalance());

    }
    @Test
    public void testGetSalary() {
    	assertEquals("False",48,s.getSalary());
    }
}