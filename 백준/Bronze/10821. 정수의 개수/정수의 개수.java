import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{ 
	public static void main(String[]args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		char[] a=new char[100];
		a=br.readLine().toCharArray();
		int cnt=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==',') {
				cnt++;
			}
		}
		bw.write((cnt+1)+"\n");
		bw.close();
		br.close();
	}
}