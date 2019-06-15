package Topics;

public class Arrays {

	public static void main(String[] args) {
//Below are the examples of static array
		//advantage of array is that multiple similar datatype values can be stored in one variable 
		//disadvantages
		//1. size is fixed of these arrays -->static array --> To overcome this we use dynamic array/collections(arraylist,hastable)
		//2. stores only similar data type--> to overcome this  we use object array
int i[] = new int[4];//similarly Array can be of type char/boolean/string/double
i[0] = 1;
i[1] = 2;
System.out.println(i[1]);
System.out.println(i.length);//to check the length of array

//object is super class of all the classes
//object array  --> Is used to store the different datatype
Object ob[] = new Object[4];
ob[0]  = "Tom";
ob[1] = 25;
ob[2] = 'C';
ob[3] = "1/1/1991";

System.out.println(ob.length);
for (int j=0;j<ob.length;j++){
	System.out.println(ob[j]);
}



	}

}
