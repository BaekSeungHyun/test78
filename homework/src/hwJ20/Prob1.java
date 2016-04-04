package hwJ20;

import java.util.Vector;

public class Prob1 {

	public static void main(String[] args) throws Exception {
		
		String pathName="./src/data.txt";
		
		FileUtil.fileToPrint(pathName);
		
		System.out.println("=================");
		System.out.println("화일 내용중 서울 정보 검색");
		Vector<User> vector=FileUtil.fileFindAddres(pathName, "서울");
		for (int i = 0; i < vector.size(); i++) {
			
		}
		
		System.out.println("=================");
		System.out.println("화일 내용중 경주 정보 검색");
		vector=FileUtil.fileFindAddres(pathName, "경주");
		for (int i = 0; i < vector.size(); i++) {
			
		}
		
		System.out.println("=================");
		System.out.println("화일 내용중 경기도 정보 검색");
		vector=FileUtil.fileFindAddres("./src/data.txt", "경기도");
		for (int i = 0; i < vector.size(); i++) {
			
		}


	}

}
