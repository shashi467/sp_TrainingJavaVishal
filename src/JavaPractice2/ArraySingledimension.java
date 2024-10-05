package JavaPractice2;

public class ArraySingledimension {

	public static void main(String[] args) {
		
	//	int [] roll = new int[5];
	//	roll[0]=10;
	//	roll[1]=11;
	//	roll[2]=12;
	//	roll[3]=13;
	//	roll[4]=14;
		
		int roll []={20,30,40,50,60};
		System.out.println("size of an array "+roll.length);  //length of an array
		System.out.println("value of 2nd element : "+roll[1]);
		
	//read all value of an array 
		
		for(int i=0; i<roll.length; i++)
		{
			System.out.println("value is " +roll[i]);
		}
	}

}
