package assignment1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniversityTest {

    University s = new University(123, "VNUK Institute");

    @Test
    public void testSetId() {
        s.setId(123);
        assertEquals("False", 123, s.getId());
    }

    @Test
    public void testSetName() {
        s.setName("Vien Viet Anh");
        assertEquals("False", "Vien Viet Anh", s.getName());
    }

    @Test
    public void testAccount() {
        assertEquals("False", 10, s.credit(10));
        assertEquals("False", 6, s.debit(4));
        assertEquals("False", 6, s.getBalance());        
    }
}