import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{ 
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[10];
		for(int i=0;i<n;i++) {
			StringTokenizer st= new StringTokenizer(br.readLine()," ");
			for(int j=0;j<10;j++) {
				a[j]=Integer.parseInt(st.nextToken());
			}
			Arrays.sort(a);
			bw.write(a[a.length-3]+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}