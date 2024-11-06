//Array02.java

public class Array02 {
	public static void main(String []args){
		int [][]sales; //declaration
		sales = new int[2][4];//construction;
		System.out.println("sales.length="+sales.length);
		System.out.println("sales[0].length="+sales[0].length);

		for(int i = 0;i<sales.length;i++){
			for(int j = 0;j<sales[i].length;j++){
				sales[i][j]=100+((i+10)*(j+5));
				System.out.println("Sales of Branch"+(i+1)+" Department "+ (j+1) + " is "+sales[i][j]);
			}
		}

	}
}