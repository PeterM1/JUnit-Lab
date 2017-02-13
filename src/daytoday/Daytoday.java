package daytoday;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class Daytoday {

        date d1 = new date(2017, 12, 2);
         date d2 = new date(2018, 1, 2);
public static int Daydif(date start, date end){
    int temp, yr = 0, m = 0, d = 0;
    
    temp = end.year - start.year;
    yr = 360 * temp;
    temp = end.month - start.month;
    m = 30 * temp;
    d = end.day - start.day;
    int total = yr + m + d;
    yr = 0;
    m = 0;
    d = 0;
    
    /*while(total > 29){
    if (total > 360){
        yr++;
        total -= 360;
        
        }else if(total > 29){
            m++;
            total -= (m *30);
        }
     d= total;
    }
    System.out.println("There are " + yr + " year(s) " + m + " month(s) and " + d + " days until your end date\n");
    */
    
   return total;
}
    
    public static void main(String[] args) {
        
            Result result = JUnitCore.runClasses(daytoday.TestDayDif.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
       
    }
    
}