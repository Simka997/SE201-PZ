package klase;

import Controllor.RadniNalog;
import org.junit.Test;
import static org.junit.Assert.*;

public class RadniNalogIT {
    
   @Test
  // TEST PROLAZI
    public void testIsValidDate() {
        System.out.println("isValidDate");
        String datum = "2017/12/02";
        boolean expResult = true;
        boolean result = RadniNalog.isValidDate(datum);
        assertEquals(expResult, result);
    }
    
      
    // TEST PADA , februar nema nikada 31 dan
    public void testIsValidDate3() {
        System.out.println("isValidDate");
        String datum = "2020/02/31";
        boolean expResult = true;
        boolean result = RadniNalog.isValidDate(datum);
        assertEquals(expResult, result);
    }
    //TEST PADA, ne postoji 13 mesec
    public void testIsValidDate4() {
        System.out.println("isValidDate");
        String datum = "2017/13/31";
        boolean expResult = true;
        boolean result = RadniNalog.isValidDate(datum);
        assertEquals(expResult, result);
    }
   
    //  TEST PADA, ocekivani format netacan
     public void testIsValidDate2() {
        System.out.println("isValidDate");
        String datum = "20171122";
        boolean expResult = true;
        boolean result = RadniNalog.isValidDate(datum);
        assertEquals(expResult, result);
    }
    
}
