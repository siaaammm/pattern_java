import java.util.Scanner;
public class prac10 {
  public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print ("enter the number of rows: ");
    int row = sc.nextInt ();
    
    
    for (int i = 1; i <= row; i++) {
      for (int j = row - 1; j >= i; j--) {
        System.out.print ("  ");
      }
      for (int j = 1; j <= 2*i - 1;  j++) {
        if (i == row || i == 1 || j ==1 || j == 2*i - 1) {
      System.out.print (j);
        } else {
        System.out.print ("  ");
        }
      }
      System.out.println ();
    }
    
    sc.close ();
  }
}
