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
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		HashSet<Integer> num=new HashSet<Integer>();
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		for(int i=0;i<n;i++) {
			num.add(Integer.parseInt(st.nextToken()));
		}
		ArrayList<Integer> a=new ArrayList<>(num);
		Collections.sort(a);
		Iterator<Integer> it=a.iterator();
		while(it.hasNext()) {
			bw.write(it.next()+" ");
		}
		bw.close();
		br.close();
	}
}