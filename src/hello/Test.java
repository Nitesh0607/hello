package hello;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {-1,1,3,5,7,9};
		int[] arr2 = {-2,2,3,4,5,6};
		int[] arr3 = new int[arr1.length + arr2.length];
		
		System.out.println(mergeArrays(arr1,arr2,arr3));
		for(int i=0;i<arr1.length+arr2.length;i++) {
			System.out.println(arr3[i] + " ");
		}

	}
	public static int[] mergeArrays(int[]arr1,int[]arr2,int[] arr3){
		
		
		int i=0, j=0, k=0;
		
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]<arr2[j])
				arr3[k++] = arr1[i++];
			else
				arr3[k++] = arr2[j++];
		    
		}
		while(i<arr1.length)
			arr3[k++] = arr1[i++];
		while(j<arr2.length)
			arr3[k++] = arr1[j++];
		
		
		
		
		return arr3;
	}
	

	    
	
	

}
