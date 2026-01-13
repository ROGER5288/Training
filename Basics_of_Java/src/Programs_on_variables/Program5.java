package Programs_on_variables;

public class Program5 {
	public static void main(String[] args) {
		char c ='A';//2byte
		// 2byte ---> 4 byte is called widening/ implicit  typecasting
		//narrowing/explicit typecasting is to wider data to smaller data
		//one type to another is typecasting
		int i = c;//4byte print ascii values
		System.out.println(i);
		
		//int j =65;//4byte
		//char ch =j;//2byte can't convert int to char 
	}

}
