package hwJ20;

import java.util.Vector;

public class Prob1 {

	public static void main(String[] args) throws Exception {
		
		String pathName="./src/data.txt";
		
		FileUtil.fileToPrint(pathName);
		
		System.out.println("=================");
		System.out.println("ȭ�� ������ ���� ���� �˻�");
		Vector<User> vector=FileUtil.fileFindAddres(pathName, "����");
		for (int i = 0; i < vector.size(); i++) {
			
		}
		
		System.out.println("=================");
		System.out.println("ȭ�� ������ ���� ���� �˻�");
		vector=FileUtil.fileFindAddres(pathName, "����");
		for (int i = 0; i < vector.size(); i++) {
			
		}
		
		System.out.println("=================");
		System.out.println("ȭ�� ������ ��⵵ ���� �˻�");
		vector=FileUtil.fileFindAddres("./src/data.txt", "��⵵");
		for (int i = 0; i < vector.size(); i++) {
			
		}


	}

}
