import java.util.Scanner;
public class Main {
	static int fact(int a) {
		int result=1;
		for(int i=1;i<=a;i++) {
			result*=i;
		}
		return result;
	}
	
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int r=sc.nextInt();
    	System.out.println(fact(n)/(fact(r)*fact(n-r)));
    }
}