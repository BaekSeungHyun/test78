package hw.J14.Prob2;

//import com.sun.org.apache.xpath.internal.operations.Equals;

public class Prob1 {

	public static void main(String[] args) {
		String url1="http://localhost/order?prodid=PROD.001&prodName=������3&price=980000";
		
		String prodName=getParameter(url1,"prodName");
		System.out.println("��ǰ �̸� : "+prodName);
		
		String url2="http://localhost/registUser?userld=USER-001&userName=ȫ�浿&address=����� ������&userAge=26";
		
		String userAddress=getParameter(url2,"address");
		System.out.println("ȸ�� �ּ� : "+userAddress);
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
