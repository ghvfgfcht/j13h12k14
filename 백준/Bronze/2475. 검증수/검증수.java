import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int a=sc.nextInt();a*=a;
    	int b=sc.nextInt();b*=b;
    	int c=sc.nextInt();c*=c;
    	int d=sc.nextInt();d*=d;
    	int e=sc.nextInt();e*=e;
    	System.out.println((a+b+c+e+d)%10);
}
}