//Array03.java

public class Array03 {
	public static void main(String []args){
		int [][]sales; //declaration
		sales = new int[3][];//construction of outer array;
		sales[0]=new int[5]; //construction of inner array
		sales[1]=new int[3];
		sales[2]=new int[6];
		System.out.println("sales.length="+sales.length);

		for(int i = 0;i<sales.length;i++){
			System.out.println("sales["+i+"].length="+sales[i].length);
			for(int j = 0;j<sales[i].length;j++){
				sales[i][j]=100+((i+10)*(j+5));
				System.out.println("Sales of Branch"+(i+1)+" Department "+ (j+1) + " is "+sales[i][j]);
			}
		}

	}
}