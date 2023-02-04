import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{ 
	static int renum(int n) {
		int n1=n/100;
		int n2=(n%100)/10;
		int n3=n%10;
		
		int rn=(n3*100)+(n2*10)+n1;
		return rn;
		
	}
	public static void main(String[]args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		int ra=renum(a);
		int rb=renum(b);
		bw.write(Math.max(ra, rb)+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}