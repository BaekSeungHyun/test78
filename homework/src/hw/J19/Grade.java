package hw.J19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Grade {

	public static void main(String[] args) throws IOException {
		Grade grade=new Grade();
		String fileName="score.txt";
		grade.printGrade(fileName);
	}
	
	public void printGrade(String fileName) throws IOException{
		
		String name;
		int score;
		
		try{
		BufferedReader br=new BufferedReader(new FileReader(fileName));
		List<String> lis=new ArrayList<String>();
		
		String s;
		int sum=0;
		int count=0;
		
		while((s=br.readLine())!=null){
			String[] strArr=s.split(",");
			name=strArr[0];
			score=Integer.parseInt(strArr[1]);
			sum+=score;
			count++;
			lis.add(name+"의 점수는"+score+"입니다.");
		}
			lis.add("모두의 총점은"+sum+"점 입니다.");
			lis.add("모두의 평균은"+sum/count+"점 입니다.");
		br.close();
		
		BufferedWriter bw=new BufferedWriter(new FileWriter(fileName));
		
		for(int j=0; j<lis.size(); j++){
			bw.write(lis.get(j));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		} catch(IOException e) {
			System.out.println(e.getMessage());
			System.out.println("오류!");
		}
	} 
		
}