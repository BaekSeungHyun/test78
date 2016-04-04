package hw.J14.Prob2;

//import com.sun.org.apache.xpath.internal.operations.Equals;

public class Prob1 {

	public static void main(String[] args) {
		String url1="http://localhost/order?prodid=PROD.001&prodName=갤럭시3&price=980000";
		
		String prodName=getParameter(url1,"prodName");
		System.out.println("제품 이름 : "+prodName);
		
		String url2="http://localhost/registUser?userld=USER-001&userName=홍길동&address=서울시 강남구&userAge=26";
		
		String userAddress=getParameter(url2,"address");
		System.out.println("회원 주소 : "+userAddress);
	}
	
	private static String getParameter(String url, String paramName){
		
		String sp="";
		
		String[] result =url.split("=|,|&");
		
		for (int i = 0; i < result.length; i++) {
			if(result[i].length()==paramName.length()){
				for (int j = 0; j < result[i].length(); j++) {		
					if(result[i].toString().equals(paramName.toString())){	//equals(object obj)
							sp=result[i+1];
					} 
				}
			}
		}
		
		return sp;
	}

}
