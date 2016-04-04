package hw.J19;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Vector;

public class Prob1 {
	public static void main(String[] args) {
		Prob1 e=new Prob1();
		Vector scores=e.getList();
		for (int i = 0; i < scores.size(); i++) {
			System.out.println(scores.get(i));
		}

	}
	
	public Vector getList()  {
		
		Vector vector=new Vector();
		BufferedReader br=null;
		
		try{
			br=new BufferedReader(new FileReader("list.txt"));
			String str="";
			
			while((str=br.readLine())!=null){
				
				String[] arrayStr=str.split("/");
				String pName=arrayStr[1];
				int pScore=Integer.parseInt(arrayStr[2]);
				String result="미수료";
				
				if("java".equalsIgnoreCase(pName)&&pScore>=80){
					result="수료";
				} else if("sql".equalsIgnoreCase(pName)&&pScore>=90){
					result="수료";
				}
				str="["+arrayStr[0]+","+pName+","+pScore+","+result+"]";
				vector.add(str);
	
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally{
			if(br!=null){
				try{	br.close();	}catch(Exception e){}
			}
		}
		return vector;
	}

}
