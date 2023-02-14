import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	static boolean isp(String a) {
		int lt=0;
		int rt=a.length()-1;
		while(lt<rt) {
			if(a.charAt(lt)!=a.charAt(rt)) {
				return false;
			}
			lt++;
			rt--;
		}
		return true;
	}
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String s=br.readLine();
		if(isp(s)) {
			bw.write("1"+"\n");
		}
		else {
			bw.write("0"+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}