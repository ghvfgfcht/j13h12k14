import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{ //2108
	public static void main(String[]args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int list[]=new int[3];
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		for(int i=0;i<3;i++) {
			list[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(list);
		for(int i=0;i<3;i++) {
			bw.write(list[i]+" ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}