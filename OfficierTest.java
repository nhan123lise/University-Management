package assignment1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


import static org.junit.Assert.assertEquals;
public class OfficierTest {
    Officer s = new Officer("190","Ky",1992,"Marketing",20,4,"manager");
    @Test
    public void testSetId(){
        s.setId("190");
        assertEquals("False","190",s.getId());
    }
    @Test
    public void testSetName(){
        s.setName("Ky");
        assertEquals("False","Ky",s.getName());
    }
    @Test
    public void testSetYob(){
        s.setYob(1992);
        assertEquals("False",1992,s.getYob());
    }
    @Test
    public void testSetTeam(){
        s.setTeam("Marketing");
        assertEquals("False","Marketing",s.getTeam());
    }
    @Test
    public void testSetDaywork(){
        s.setDaywork(20);
        assertEquals("False",20,s.getDaywork());
    }
    @Test
    public void testSetPayroll(){
        s.setPayroll(4);
        assertEquals("False",4,s.getPayroll());
    }
    @Test
    public void testGetAllowance(){
        s.setlevel("manager");
        assertEquals("False",1000,s.getAllowance());
        s.setlevel("vicemanager");
        assertEquals("False",600,s.getAllowance());
        s.setlevel("staff");
        assertEquals("False",400,s.getAllowance());
    }
    @Test
    public void testSetLevel(){
        s.setlevel("manager");
        assertEquals("False","manager",s.getLevel());
        s.setlevel("vicemanager");
        assertEquals("False","vicemanager",s.getLevel());
        s.setlevel("staff");
        assertEquals("False","staff",s.getLevel());
    }
    @Test
    public void testGetSalary(){
        assertEquals("False",2400,s.getAllowance(),s.getSalary());
        s.setlevel("manager");
        //4*200 + 1000 +20*30
        assertEquals("False",2000,s.getAllowance(),s.getSalary());
        s.setlevel("vicemanager");
        assertEquals("False",1800,s.getAllowance(),s.getSalary());
        s.setlevel("staff");

    }
    @Test
    public void testAccount(){
        assertEquals("False",10,s.credit(10));
        assertEquals("False",6,s.debit(4));
        assertEquals("False",6,s.getBalance());
    }
}
