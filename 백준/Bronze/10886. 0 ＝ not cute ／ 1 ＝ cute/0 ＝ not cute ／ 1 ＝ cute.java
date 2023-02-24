import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{ 
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		int invest=0;
		int disagcnt=0;
		int agcnt=0;
		for(int i=0;i<n;i++) {
			invest=Integer.parseInt(br.readLine());
			switch(invest) {
			case 1:{
				agcnt++;
				break;
			}
			case 0:{
				disagcnt++;
				break;
			}
			}
		}
		if(disagcnt>agcnt) {
			bw.write("Junhee is not cute!"+"\n");
		}
		else {
			bw.write("Junhee is cute!"+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}