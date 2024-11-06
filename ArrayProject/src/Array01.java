//Array01.java

public class Array01 {
	public static void main(String []args){
		int []arr; //declaration
		arr = new int[3];//Construction
		arr[0]=10;//Initialization
		arr[1]=20;
		arr[2]=30;
		//Extraction from array
		for(int i = 0;i<arr.length;i++)
			System.out.println("arr["+i+"]="+arr[i]);
	}
}