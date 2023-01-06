import java.util.Scanner;
public class Main {
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0;
      int s=666;
      while(n!=0) {
    	  if(String.valueOf(s).indexOf("666")>=0) {
    		  sum++;
    		  if(sum==n) {
        		  System.out.println(s);
        		  break;
        	  }
    	  }
    	  s++;
      }
      sc.close();
   }
}