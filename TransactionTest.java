package assignment1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class TransactionTest {
    Transaction s = new Transaction(123, "nhan", "long", 200, "16h", "tra no");
    @Test
    public void testSetId(){
        s.setId(123);
        assertEquals("False",123,s.getId());
    }
    @Test
    public void testSetStartAccount(){
        s.setStartAccount("nhan");
        assertEquals("False","nhan",s.getStartAccount());
    }
    @Test
    public void testSetEndAccount(){
        s.setEndAccount("long");
        assertEquals("False","long", s.getEndAccount());
    }
    @Test
    public void testSetAmount(){
        s.setAmount(200);
        assertEquals("False",200,s.getAmount());
    }
    @Test
    public void testSetTime(){
        s.setTime("16h");
        assertEquals("False","16h",s.getTime());
    }
    @Test
    public void testMessage(){
        s.setMessage("tra no");
        assertEquals("False","tra no",s.getMessage());
    }
    // @Test
    // public void testGetCost(){
    // 	s.setAmount(200);
    // 	s.setPeriodCost(2);
    //     assertEquals("False",202,s.getCost());
    // }
}
