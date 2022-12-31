import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int t=sc.nextInt();
    	int sum=0;
    	String n=sc.next();
    	for(int j=0;j<t;j++) {
    		sum+=n.charAt(j)-'0';
    	}
    	System.out.println(sum);
    	
    }
}