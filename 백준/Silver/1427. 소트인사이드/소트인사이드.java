import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Main{ 
	public static void main(String[]args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String a=br.readLine();
		Integer ps[]=new Integer[a.length()];
		for(int i=0;i<a.length();i++) {
			ps[i]=a.charAt(i)-48;
		}
		Arrays.sort(ps,Collections.reverseOrder());
		String result="";
		for(int i=0;i<ps.length;i++) {
			result+=ps[i].toString();
		}
		bw.write(result+"\n");
		bw.close();
		br.close();
	}
}