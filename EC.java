import java.util.*;

public class EC {
     public static void main(String args[]){
          Scanner sc = new Scanner (System.in);
          System.out.print("Enter the number : ");
          int n = sc.nextInt();

          int str = 1 ;
          int sp = n-1;
          for (int i= 1 ; i<=n;i++){
               for( int j=1 ; j<=sp ;j++){
                    System.out.print("\t");
               }
               for ( int j =1 ; j<= str ; j++){
                    System.out.print("\t*");
               }
               sp--;
               

               str++;
               System.out.println("");
          }

     }
}