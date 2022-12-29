import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int t=sc.nextInt();
    	int sum[][]=new int[15][15];
    	for(int init=0;init<15;init++) {
    		sum[0][init]=init;
    		sum[init][1]=1;
    	}
    	for(int i=1;i<=t;i++) {
        	int k=sc.nextInt();
        	int n=sc.nextInt();
        	for(int a=1;a<=k;a++) {
        		for(int b=1;b<=n;b++) {
        			sum[a][b]=sum[a-1][b]+sum[a][b-1];
        		}
        	}
        	System.out.println(sum[k][n]);
    	}
}
}