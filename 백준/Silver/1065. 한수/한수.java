import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	public static void main(String[]args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		int cnt=0;
		if(n<100) {
			cnt=n;
		}
		else {
			cnt=99;
			for(int i=100;i<=n;i++) {
				int hund=i/100;
				int ten=(i%100)/10;
				int one=i%10;
				if((hund-ten)==(ten-one)) {
					cnt++;
				}
			}	
		}
		bw.write(cnt+"\n");
		bw.close();
		br.close();
	}
}