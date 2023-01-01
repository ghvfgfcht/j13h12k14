import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int m=sc.nextInt();
    	int n=sc.nextInt();
    	int p[]=new int[n+1];
    	for(int f=0;f<p.length;f++) {
    		p[f]=0;
    	}
    	p[0]=1;
    	p[1]=1;
    	for(int i=2;i<p.length;i++) {
    		for(int j=2;i*j<p.length;j++) {
    			p[i*j]=1;
    		}
    	}
    	for(int a=m;a<=n;a++) {
    		if(p[a]==0) {
    			System.out.println(a);
    		}
    	}
    }
}