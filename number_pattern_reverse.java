
package Apps_Practise;
import java.util.Scanner;
public class number_pattern_reverse_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int row,col,n;
        System.out.print("Enter N:");
        n=input.nextInt();
         for(row=1;row<=n;row++){
             for(col=n;col>=1;col--){
                 System.out.print(""+col);
                 if(col!=1){
                     System.out.print(" ");
                 }
                 
         }System.out.println("");
    }
}
}
