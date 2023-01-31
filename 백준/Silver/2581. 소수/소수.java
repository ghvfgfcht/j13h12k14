import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main{
	public static void main(String[]args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int m=Integer.parseInt(br.readLine());
		int n=Integer.parseInt(br.readLine());
		int isp[]=new int[n+1];
		int sum=0;
		int min=n;
		Arrays.fill(isp, 1);
		isp[0]=isp[1]=0;
		for(int i=2;i<n;i++) {
			for(int j=2;i*j<isp.length;j++) {
				isp[i*j]=0;
			}
		}
		for(int i=m;i<=n;i++) {
			if(isp[i]==1) {
				sum+=i;
				 if(i<min) {
					 min=i;
				 }
			}	
		}
		if(sum!=0) {
			bw.write(sum+"\n");
			bw.write(min+"\n");	
		}
		else {
			bw.write("-1"+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}