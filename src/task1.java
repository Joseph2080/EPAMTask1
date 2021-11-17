import java.util.Scanner;

public class task1 {

    public static void main(String args[]){
        System.out.println("Enter an integer:");
        int n = new Scanner(System.in).nextInt();
        //if n is greater then 0 square
        if(n>0){
            System.out.println(Math.pow(n,2));
        }
        if(n==0){
            System.out.println(0);
        }
        if(n<0){
            System.out.println(n*-1);
        }
    }
}
