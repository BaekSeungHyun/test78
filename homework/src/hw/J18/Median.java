package hw.J18;

import java.util.Arrays;

public class Median {

	public static void main(String[] args) {

		Median median=new Median();
		
		int[] values1={10,4,53,63,17,37,52,16,33,65};
		System.out.println("input "+Arrays.toString(values1));
		System.out.println("median :"+median.findMedian(values1));
		System.out.println("================================================");
		
		int[] values2={32,53,52,76,15,98,76,65,36,10};
		System.out.println("input: "+Arrays.toString(values2));
		System.out.println("median :"+median.findMedian(values2));
	}
	
	public int findMedian(int[] values) {

		int sum=0;
		int[] arr1=new int[values.length];
		int[] arr2=new int[values.length];
		
		for (int i = 0; i < arr2.length-1; i++) {
			
			for (int j = 0; j < values.length-1; j++) {
				
				int temp01=values[j];
				int temp02=values[j+1];
				
				if(values[j]>values[j+1]){
					values[j]=temp02;
					values[j+1]=temp01;
				}
			}
		}
		
		
		for (int i = 0; i < (values.length)/2; i++) {
				arr1[i]=values[i];
		}
		
		for (int k = 0; k < (values.length)/2; k++) {
				arr2[k]=values[(values.length/2)+k];
		}
		
		for(int val:values){
			sum=sum+val;
		}
		
		double avg=(double) (sum/(values.length));
		int firstArr=(int)avg-(arr1[(values.length/2)-1]);
		int secondArr=arr2[0]-(int)avg;
		
		if (firstArr > secondArr) {
			return arr2[0];
		} else if (firstArr < secondArr) {
			return arr1[(values.length/2)-1];
		} else {
			return arr1[(values.length/2)-1];
		}
	}

}
