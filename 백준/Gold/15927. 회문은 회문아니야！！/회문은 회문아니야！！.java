import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	static boolean allsame(String a) {
		int lt=0;
		int rt=a.length()-1;
		for(int i=lt;i<rt;i++) {
			if(a.charAt(i)!=a.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[]args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String a=br.readLine();
		int lt=0;
		int rt=a.length()-1;
		int sy=0;
		if(a.charAt(lt)!=a.charAt(rt)) {
			bw.write(a.length()+"\n");
		}
		else {
			if(allsame(a)) {
				bw.write("-1"+"\n");
			}
			else {
				for(int i=lt;i<a.length()/2;i++) {
					if(a.charAt(i)!=a.charAt(rt-i)) {
						sy++;
						break;
					}
				}
				if(sy!=0) {
					bw.write(a.length()+"\n");
				}
				else {
					bw.write(a.length()-1+"\n");
				}
			}
			
		}
		bw.flush();
		bw.close();
		br.close();
	}
}