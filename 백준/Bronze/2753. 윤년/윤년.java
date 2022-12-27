import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int mon=sc.nextInt();
    	if((mon%4==0)&&(mon%100!=0||mon%400==0)) System.out.println("1");
    	else System.out.println("0");
}
}