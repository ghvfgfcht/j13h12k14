import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	static int vowel(String a) {
		char tmp[]=a.toCharArray();
		int cnt=0;
		for(int i=0;i<tmp.length;i++) {
			if(tmp[i]=='a'||tmp[i]=='e'||tmp[i]=='i'||tmp[i]=='o'||tmp[i]=='u') {
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int r=0;
		while(true) {
			String a=br.readLine().toLowerCase();
			if(a.equals("#")) {
				break;
			}
			r=vowel(a);
			bw.write(r+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}