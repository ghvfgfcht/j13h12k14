import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		HashSet<String> name=new HashSet<String>();
		for(int i=0;i<n;i++) {
			StringTokenizer st= new StringTokenizer(br.readLine()," ");
			String nam=st.nextToken();
			String state=st.nextToken();
			if(state.equals("enter")) {
				name.add(nam);
			}
			else {
				name.remove(nam);
			}
		}
		ArrayList<String> a= new ArrayList<>(name);
		Collections.sort(a,Collections.reverseOrder());
		Iterator <String> it=a.iterator();
		while(it.hasNext()) {
			bw.write(it.next()+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}