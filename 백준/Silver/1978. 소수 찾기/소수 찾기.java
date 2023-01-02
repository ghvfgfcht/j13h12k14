import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int t=sc.nextInt();
    	int p[]=new int[t];
    	int prim[]=new int[1001];
    	int cnt=0;
    	for(int i=0;i<t;i++) {
    		p[i]=sc.nextInt();
    	}
    	for(int i=0;i<1000;i++) {
    		prim[i]=1;
    	}
    	prim[0]=prim[1]=0;
    	for(int a=2;a<=Math.sqrt(1000);a++) {
            for(int b=a*a;b<=1000;b+=a) {
               prim[b]=0;
            }
         }
    	for(int j=0;j<t;j++) {
    		if(prim[p[j]]==1) {
    			cnt++;
    		}
    	}
    	System.out.println(cnt);
    	sc.close();
    }
}