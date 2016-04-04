package hw.J19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Prob {

	private static final String String = null;

	public static void main(String[] args) {
		Prob p2=new Prob();
		Vector scores=p2.getScore("src/data.txt");
		for (int i = 0; i < scores.size(); i++) {
			Score score=(Score)scores.get(i);
			System.out.println(score.getName()+":"+score.getKor()+" "+score.getEng()+" "+score.getMath()
							   +" "+score.getSum());
		}
	}
	
	public Vector getScore(String fileName){
		
		Vector vector=new Vector();

		try{
			BufferedReader br=new BufferedReader(new FileReader(fileName));
			
			String s;
			
			while((s=br.readLine())!=null){
				String[] strArr=s.split("/");
				String name=strArr[0];
				int kor=Integer.parseInt(strArr[1]);
				int eng=Integer.parseInt(strArr[2]);
				int math=Integer.parseInt(strArr[3]);
				int sum=kor+eng+math;
				
				Score score=new Score(name,kor,eng,math,sum);
				vector.add(score);			
				}
				br.close();
			} catch(IOException e) {
				System.out.println("¿À·ù!");
	}
		return vector;
}

class Score{
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	
	public Score(String name,int kor,int eng,int math,int sum){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.sum=sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
 }
}
