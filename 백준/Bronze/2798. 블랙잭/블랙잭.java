import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{ 
	public static void main(String[]args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int a[]= new int[n];
		int sum=100000;
		int r=0;
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<n;i++) {
			a[i]=Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int b=j+1;b<n;b++) {
					if(a[i]+a[j]+a[b]<=m) {
						r=m-(a[i]+a[j]+a[b]);
						sum=Math.min(sum, r);
					}
				}
			}
		}
		bw.write(m-sum+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}