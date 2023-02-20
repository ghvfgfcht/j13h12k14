import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main{ //2108
	public static void main(String[]args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[n];
		int sum=0;
		int max=-4000;
		int min=4000;
		int cnt[]=new int[8001];
		for(int i=0;i<n;i++) {
			a[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(a);
		int lm=a.length/2;
		for(int i=0;i<n;i++) {
			max=Math.max(max,a[i]);
			min=Math.min(min, a[i]);
			sum+=a[i];	
			cnt[a[i]+4000]++;
		}
		int tmp=0;
		int count=0;
		int p=0;
		for(int i=-0;i<cnt.length;i++) {
			if(tmp<cnt[i]) {
				tmp=cnt[i];
				count=i-4000;
			}
		}
		for(int i=0;i<cnt.length;i++) {
			if(tmp==cnt[i]) {
				count=i-4000;
				if(p==1) {
					break;
				}
				p++;
			}
		}
		
		bw.write(Math.round(sum/(double)a.length)+"\n"); 
		bw.write(a[lm]+"\n"); 
		bw.write(count+"\n");
		bw.write((max-min)+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}