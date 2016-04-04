package hw.J18.Book;

import java.util.List;
import java.util.Vector;
import java.util.zip.DataFormatException;

public class Prob {

	public static void main(String[] args) {
		
		Vector bookList=new Vector();
		
		try {
			bookList.add(makeBook("JavaProgramming 기초 : 컴퓨터 :35000"));
			bookList.add(makeBook("초보자를 위한 SQL : 컴퓨터 :28000"));
			bookList.add(makeBook("HTML5 API소개 : 컴퓨터 :58000"));
			//Case1
			bookList.add(makeBook("JDBC Programming 기초 : 컴퓨터 :45000"));
			//Case2
			//bookList.add(makeBook("JDBC Programming 기초 : 컴퓨터"));
			bookList.add(makeBook("JSP Programming 고급 : 컴퓨터 :56000"));
			
			System.out.println("<<책 목록>>");
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
				throw new DataFormatException(book.getTitle()+"기초책 정보는 변환할 수 없는 데이터 포맷입니다.");
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
