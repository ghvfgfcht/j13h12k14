import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	static int p(String isp) {
		int lt=0;
		int rt=isp.length()-1;
		while(lt<rt) {
			if(isp.charAt(lt)!=isp.charAt(rt)) {
				return 0;
			}
			rt--;
			lt++;
		}
		return 1;
	}
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String isp=br.readLine();
		if(p(isp)==1) {
			bw.write("true"+"\n");
		}
		else {
			bw.write("false"+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}