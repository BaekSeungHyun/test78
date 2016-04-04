package hw.J18.Book;

import java.util.List;
import java.util.Vector;
import java.util.zip.DataFormatException;

public class Prob {

	public static void main(String[] args) {
		
		Vector bookList=new Vector();
		
		try {
			bookList.add(makeBook("JavaProgramming ���� : ��ǻ�� :35000"));
			bookList.add(makeBook("�ʺ��ڸ� ���� SQL : ��ǻ�� :28000"));
			bookList.add(makeBook("HTML5 API�Ұ� : ��ǻ�� :58000"));
			//Case1
			bookList.add(makeBook("JDBC Programming ���� : ��ǻ�� :45000"));
			//Case2
			//bookList.add(makeBook("JDBC Programming ���� : ��ǻ��"));
			bookList.add(makeBook("JSP Programming ��� : ��ǻ�� :56000"));
			
			System.out.println("<<å ���>>");
			printBookList(bookList);
			
		} catch (DataFormatException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static Book makeBook(String bookData) throws DataFormatException{
			Book book=new Book();
			
			String[] strAr=bookData.split(":");
			
			book.setTitle(strAr[0]);
			book.setKind(strAr[1]);
			if(strAr.length<3 || strAr[2]==""){
				throw new DataFormatException(book.getTitle()+"����å ������ ��ȯ�� �� ���� ������ �����Դϴ�.");
			}
			book.setRentalPrice(Integer.parseInt(strAr[2]));
			
		return book;
	}
	private static void printBookList(Vector bookList){
	
		List<String> Arr=new Vector<String>();
		
		for (int i = 0; i < bookList.size(); i++) {
			Arr.add(bookList.elementAt(i).toString());
		}
		for (int j = 0; j < bookList.size(); j++) {
			
			System.out.println(Arr.get(j));
		}
		
	}

}
