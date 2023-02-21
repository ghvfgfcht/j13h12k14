import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{ 
	static String rev(String a) {
		int len=a.length()-1;
		String re="";
		for(int i=len;i>=0;i--) {
			re+=a.charAt(i);
		}
		return re;
	}
	public static void main(String[]args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		String x=st.nextToken();
		String y=st.nextToken();
		int revx=Integer.parseInt(rev(x));
		int revy=Integer.parseInt(rev(y));
		bw.write(Integer.parseInt(rev(String.valueOf(revx+revy)))+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}