
package Apps_Practise;
import java.util.Scanner;
public class Number_parrtern_1 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int row,col,n;
        System.out.print("Enter N:");
        n=input.nextInt();
        for(row=1;row<=n;row++){
           for(col=1;col<=n;col++){
               System.out.print(""+row);
               if(n!=col){
                   System.out.print(" ");
               }
           }
           System.out.print("\n");
        }
    }
}
