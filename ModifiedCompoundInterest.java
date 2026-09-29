public class ModifiedCompoundInterest {
  public static void main(String... args) {
    
  double principal = 1000.0; 
  
  for (int percent = 5; percent <= 10; percent++) {
       double rate = percent / 100; 
       
       System.out.printf("%nInterest Rate: %d%%%n", percent);
       System.out.printf("%s%20s%n", "Year", "Amount on deposit");
      
       for (int year = 1; year <= 10; ++year) {
            System.out.printf("%4d%,20.2f%n", year, rate);
          }
    }
          }
    }
