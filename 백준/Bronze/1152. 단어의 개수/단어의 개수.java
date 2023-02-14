import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String s=br.readLine().trim();
		StringTokenizer st= new StringTokenizer(s," ");
		int cnt=st.countTokens();
		bw.write(cnt+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}