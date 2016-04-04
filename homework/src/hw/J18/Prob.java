package hw.J18;

public class Prob {
	public static void main(String[] args) {
		
		int value=Integer.parseInt(args[0]);
		
		if(value==0 || value<0){
			System.out.println("0보다 큰 값을 제대로 입력하세요");
			System.exit(0);
		}
		
		for (int i=0; i<value ;i++ ) {
			
			for (int j=value-i; j>0; j--) {
				System.out.print(" ");
			}
			
			for (int k = 0; k < i*2+1; k++) {
				System.out.print("*");
			}
				System.out.println();
		 }

	}//end of main
}//end of class