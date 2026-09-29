public class SumSeries {
  public static void main(String... args) {
         
      long sum = 0;
      System.out.printf("%-10s %-10s%n", "Numbers", "Sum");
      
      for (long index = 1; index <= 100; index++) {
        sum += index;
        System.out.printf("%-10d %-10d%n", index, sum);
            }
          }
        }
        
