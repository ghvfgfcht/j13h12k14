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
		int a[]=new int[42];
		Arrays.fill(a, 0);
		int cnt=0;
		for(int i=0;i<10;i++) {
			a[Integer.parseInt(br.readLine())%42]=1;
		}
		for(int i=0;i<42;i++) {
			if(a[i]==1) {
				cnt++;
			}
		}
		bw.write(cnt+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
} 