package hw.j15;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileController {
	
	public void reverseLine(String oldf, String newf) throws Exception{
		
		BufferedReader br=new BufferedReader(new FileReader(oldf));
		List<String> m=new ArrayList<String>();

		String line=null;
		
		while((line=br.readLine())!=null){
			m.add(line);
		}
		br.close();
		
		PrintWriter pw=new PrintWriter(new FileOutputStream(newf));
		for (int i = m.size()-1; i >= 0; i--) {
			pw.println(m.get(i));
		}
		pw.flush();
		pw.close();
	}

	public static void main(String[] args) throws Exception {
		FileController c=new FileController();
		String oldf="files/oldf.txt";
		String newf="files/newf.txt";
		c.reverseLine(oldf,newf);
	}

}
