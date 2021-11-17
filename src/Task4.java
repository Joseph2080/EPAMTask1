import java.util.Scanner;

public class Task4 {
    public static void main(String args[]){
        System.out.println("Enter a positive integer:");
        int n = new Scanner(System.in).nextInt();
        String binary = Integer.toBinaryString(n);
        int count = 0;
        for(char w:binary.toCharArray()){
            if(w=='1'){
                count++;
            }
        }
        System.out.println("Result:" + count);
    }





}
