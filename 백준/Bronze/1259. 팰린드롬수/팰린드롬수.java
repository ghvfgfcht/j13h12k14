import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	while(true) {
    		String a=sc.next();
        	int n=a.length();
        	if(n==1) {
        		if(a.equals("0")) {
        			break;}
        		else {
        			System.out.println("yes");
        		}
        	}
    		if(n==2) {
    			if(a.charAt(0)==a.charAt(1)) {
    				System.out.println("yes");
    			}
    			else {
    				System.out.println("no"); 
    			}
    		}
    		if(n==3) {
    			if(a.charAt(0)==a.charAt(2)) {
    				System.out.println("yes");
    			}
    			else {
    				System.out.println("no");
    			}
    		}
    		if(n==4) {
    			if(a.charAt(0)==a.charAt(3)&&a.charAt(1)==a.charAt(2)) {
    				System.out.println("yes");
    			}
    			else {
    				System.out.println("no");
    			}
    		}
    		if(n==5) {
    			if(a.charAt(0)==a.charAt(4)&&a.charAt(1)==a.charAt(3)) {
    				System.out.println("yes");
    			}
    			else {
    				System.out.println("no");
    			}
    		}
    	}
    }
}