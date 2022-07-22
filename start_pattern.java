
package Apps_Practise;
import java.util.Scanner;
public class Star_parrter_1 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int row,col,n;
        System.out.print("Enter N:");
        n=input.nextInt();
        for(row=1;row<=n;row++){
            for(col=1;col<=n;col++){
                
                System.out.print("#");
                if(n!=col){
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
