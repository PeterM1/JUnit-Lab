/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daytoday;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestDayDif {
       @Test
   public void test() {
          date d1 = new date(2017, 9, 2);
         date d2 = new date(2018, 5, 2);
      assertEquals(31, new Daytoday().Daydif(d1,d2));
   }
   @Test
  public void test2() {
          date d1 = new date(2017, 3, 2);
         date d2 = new date(2018, 4, 2);
      assertEquals(390, new Daytoday().Daydif(d1,d2));
   }
      @Test
  public void test3() {
          date d1 = new date(2017, 12, 2);
         date d2 = new date(2018, 1, 2);
      assertEquals(30, new Daytoday().Daydif(d1,d2));
   }
         @Test
  public void test4() {
          date d1 = new date(2017, 12, 24);
         date d2 = new date(2020, 10, 12);
      assertEquals(391, new Daytoday().Daydif(d1,d2));
   }
            
}
