import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[]args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int cnt=0;
		HashSet<String> nh =new HashSet<String>();
		String ns[]=new String[m];
		for(int i=1;i<=n;i++) {
			String nheard= br.readLine();
			nh.add(nheard);
		}
		for(int i=0;i<m;i++) {
			ns[i]=br.readLine();
			if(nh.contains(ns[i])) {
				cnt++;
			}
		}
		Arrays.sort(ns);
		bw.write(cnt+"\n");
		for(int i=0;i<m;i++) {
			if(nh.contains(ns[i])) {
				bw.write(ns[i]+"\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}