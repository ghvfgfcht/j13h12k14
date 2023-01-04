import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int t=sc.nextInt();
    	for(int a=1;a<=t;a++) {
    		for(int i=t;i>a;i--) {
    			System.out.print(" ");
    		}
    		for(int j=1;j<=a;j++) {
    			System.out.print("*");
    		}
    		System.out.println("");
    	}
    	sc.close();
    }
}