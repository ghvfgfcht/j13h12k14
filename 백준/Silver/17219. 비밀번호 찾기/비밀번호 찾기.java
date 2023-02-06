import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[]args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		HashMap<String, String> pw=new HashMap<String, String>();
		//st= new StringTokenizer(br.readLine()," ");
		for(int i=1;i<=n;i++) {
			st= new StringTokenizer(br.readLine()," ");
			String address=st.nextToken();
			String password=st.nextToken();
			pw.put(address,  password);
			// put(key, value);
		}
		for(int i=1;i<=m;i++) {
			String r=br.readLine();
			bw.write(pw.get(r)+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}