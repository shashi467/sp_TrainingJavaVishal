package JavaPractice2;

public class ArrayMultidimensionarray {

	public static void main(String[] args) {
		
		int a [][]=new int [3][2]; //make matrix of 3*2
		//give the value of array element 
		a[0][0]=90;
		a[1][0]=91;
		a[2][0]=92;
		a[0][1]=93;
		a[1][1]=94;
		a[2][1]=95;
		//print size of row & column
		System.out.println("no. of rows :"+a.length); //no of rows
		System.out.println("no of column :"+ a[0].length);
		//read the value 
		
		for(int i=0;i<a.length;i++)
		{
	      for(int j=0;j<a[0].length;j++)
	      {
	    	  System.out.println(a[i][j]);
	      
	      }
		
		}

	}

}
