import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int x=sc.nextInt();
    	int y=sc.nextInt();
    	int w=sc.nextInt();
    	int h=sc.nextInt();
    	int temp1,temp2;
    	if((w-x)>x) {
    		temp1=x;
    	}
    	else {
    		temp1=(w-x);
    	}
    	if((h-y)>y) {
    		temp2=y;
    	}
    	else {
    		temp2=(h-y);
    	}
    	if(temp1<temp2) {System.out.println(temp1);}
    	else {System.out.println(temp2);}
    	
}
}