import java.util.Scanner;
public class Main {
	static void is_p(String i) {
		int l=i.length();
		if(l==1) {
			System.out.println(i);
		}
		if(l==2) {
			if(i.charAt(0)==i.charAt(1)) {
				System.out.println(i);
			}
		}
		if(l==3) {
			if(i.charAt(0)==i.charAt(2)) {
				System.out.println(i);
			}
		}
		if(l==4) {
			if(i.charAt(0)==i.charAt(3)&&i.charAt(1)==i.charAt(2)) {
				System.out.println(i);
			}
		}
		if(l==5) {
			if(i.charAt(0)==i.charAt(4)&&i.charAt(1)==i.charAt(3)) {
				System.out.println(i);
			}
		}
		if(l==6) {
			if(i.charAt(0)==i.charAt(5)&&i.charAt(1)==i.charAt(4)&&i.charAt(2)==i.charAt(3)) {
				System.out.println(i);
			}
		}
		if(l==7) {
			if(i.charAt(0)==i.charAt(6)&&i.charAt(1)==i.charAt(5)&&i.charAt(2)==i.charAt(4)) {
				System.out.println(i);
			}
		}
	}
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      if(b>9999999) {
    	  b=9999999;
      }
      int n[]=new int[b+1];
      String p[]=new String[b+1];
      for(int i=0;i<n.length;i++) {
    	  n[i]=1;
      }      
      n[0]=n[1]=0;
      for(int x=2;x<n.length;x++) {
    	  for(int y=2;x*y<n.length;y++) {
    		  n[x*y]=0;
    	  }
      }
      for(int i=a;i<=b;i++) {
    	  if(n[i]==1) {
    		is_p(String.valueOf(i));
    	  }
      }
      System.out.println("-1");
      sc.close();
   }
}