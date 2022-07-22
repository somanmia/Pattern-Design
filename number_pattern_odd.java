
package Apps_Practise;
import java.util.Scanner;
public class odd_count_pattern {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int row,col,n,count=1;
        System.out.print("Enter N:");
        n=input.nextInt();
        for(row=1;row<=n;row++){
            for(col=1;col<=n;col++){
                System.out.print(""+count);count=count+2;
                if(col!=n){
                    
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
    }
}
