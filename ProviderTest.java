package assignment1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ProviderTest {
    Provider s = new Provider("405", "Tobi",3, 200);
    @Test
    public void testSetId(){
        s.setId("405");
        assertEquals("False","405",s.getId());
    }
    @Test
    public void testSetName(){
        s.setName("Tobi");
        assertEquals("Fasle","Tobi",s.getName());
    }
    @Test
    public void testSetNumber(){
        s.setNumber(3);
        assertEquals("False",3,s.getNumber());
    }
    @Test    
    public void testSetBill(){
        s.setBill(200);
        assertEquals("False",200,s.getBill());
    }
    @Test
    public void testGetCost(){
        assertEquals(600,s.getCost());
    }
    @Test
    public void testAccount(){
        assertEquals("False",10,s.credit(10));
        assertEquals("False",6,s.debit(4));
        assertEquals("False",6,s.getBalance());

    }

}
