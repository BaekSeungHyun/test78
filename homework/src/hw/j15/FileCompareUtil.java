package hw.j15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileCompareUtil {
	public static void main(String[] args) throws Exception {
		FileCompareUtil util=new FileCompareUtil();
		System.out.println(util.compareFile("/files/fstFile1.txt","/files/scdFile1.txt"));
		System.out.println("Successful!!");
	}
	
	public ArrayList compareFile(String fstFileName, String scdFileName) throws Exception {
			
		BufferedReader fsrBr=new BufferedReader(new FileReader(fstFileName));
		BufferedReader scdBr=new BufferedReader(new FileReader(scdFileName));
		
		String fstLine=fsrBr.readLine();
		String scdLine=scdBr.readLine();
		
		int lineNum=0;
		
		ArrayList<String> resultList=new ArrayList<String>();
		
		while(fstLine!=null){
			
			lineNum++;
			if(!fstLine.equals(scdLine)){
				resultList.add("LINE"+lineNum+":"+scdLine);
			}
			
			fstLine=fsrBr.readLine();
			scdLine=scdBr.readLine();
			
		}
		return resultList;
	}
}
