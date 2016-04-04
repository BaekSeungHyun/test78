package hw.J18;

import java.io.File;

public class Dir {
	public static void main(String[] args) {
		new Dir().pointDir("test_dir");
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}
	
	private void pointDir(String str){
		if(new File(str).isDirectory()){
			String[] children=new File(str).list();
			for (int i = 0; i < children.length; i++) {
				pointDir(str+"/"+children[i]);
			}
			System.out.println(str);
		}
	}

}
