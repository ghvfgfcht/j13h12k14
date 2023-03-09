import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main{
	static int isp(int n) {
		if(n==1) {
			return 1;
		}
		int p[]=new int[2*n];
		int cnt=0;
		p[0]=p[1]=0;
		Arrays.fill(p, 1);
		for(int i=2;i<2*n;i++) {
			for(int j=2;i*j<2*n;j++) {
					p[i*j]=0;
			}
		}
		for(int i=n+1;i<2*n;i++) {
			if(p[i]==1) {
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			int input=Integer.parseInt(br.readLine());
			if(input==0||input>123456) {
				break;
			}
			else {
				int result=isp(input);
				bw.write(result+"\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}