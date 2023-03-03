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
		for(int i=1;i<=n;i++) {
			StringTokenizer st= new StringTokenizer(br.readLine()," ");
			String a=st.nextToken();
			String b=st.nextToken();
			if(a.length()!=b.length()) {
				bw.write(a+" & "+b+" are NOT anagrams."+"\n");
			}
			else{
				char cha[]=a.toCharArray();
				char chb[]=b.toCharArray();
				Arrays.sort(cha);
				Arrays.sort(chb);
				String tmpa=String.valueOf(cha);
				String tmpb=String.valueOf(chb);
				if(tmpa.equals(tmpb)) {
					bw.write(a+" & "+b+" are anagrams."+"\n");
				}
				else {
					bw.write(a+" & "+b+" are NOT anagrams."+"\n");
				}
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}