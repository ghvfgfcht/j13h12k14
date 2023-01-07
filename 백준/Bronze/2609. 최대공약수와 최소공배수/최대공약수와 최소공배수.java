import java.util.Scanner;
public class Main {
	static int res(int a, int b) {
		int res;
		while(b!=0) {
			res=a%b;
			a=b;
			b=res;
		}
		return a;
	}
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      int a=0; int b=0;
      a=Math.max(n, m);
      b=Math.min(n, m);
      System.out.println(res(a,b));
      System.out.println((a/res(a,b)*(b/res(a,b)*res(a,b))));
      sc.close();
   }
}