import java.util.*;

public class Pattern4 {
     public static void main ( String args []){
          Scanner sc = new Scanner ( System.in  );
          int n =  sc.nextInt();
          int str =5;
          int sp = 0;
          for ( int i = 1 ; i<=n ;i++){
               for( int j=1 ; j<=sp ; j++){
                    System.out.print("\t");
               }
               for( int j=1 ; j<=str ; j++){
                    System.out.print("*\t");
               }
               str--;
               sp++;
               System.out.println("");
          }
     }
     
}