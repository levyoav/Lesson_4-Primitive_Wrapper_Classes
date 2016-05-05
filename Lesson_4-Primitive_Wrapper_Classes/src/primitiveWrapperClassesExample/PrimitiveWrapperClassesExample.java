package primitiveWrapperClassesExample;

public class PrimitiveWrapperClassesExample {

	public static void main(String[] args) {

		int x = 5;

		//Inboxing - The primitive value of 'x' is being converted into an Integer wrapper type and now
		//can be referenced as an object and can be stored in a collection.
		Integer a = new Integer(x);
		System.out.println(a);

		//Outboxing - The Integer value of 'a' is being converted into a primitive int type. This enables to perform
		//arithmetic operations on it.
		int y = a.intValue();
		System.out.println(y);

		// maximum and minimum values
		System.out.println(Byte.MAX_VALUE); //Maximum value of Byte type.
		System.out.println(Byte.MIN_VALUE); //Minimum value of Byte type.

		System.out.println(Integer.MAX_VALUE); //Maximum value of Integer type.
		System.out.println(Integer.MIN_VALUE); //Minimum values of Integer type.

		System.out.println(Long.MAX_VALUE); //Maximum value of Long type.
		System.out.println(Long.MIN_VALUE); //Minimum value of Long type.


		//Transform a String to a number
		String str = "15";

		//Parsing the string value to the Integer value it represents. All the characters must be decimal digits.
		int val = Integer.parseInt(str);
		System.out.println(val);

		str = "-15";
		//In case of negative value, the first character should be '-'.
		val = Integer.parseInt(str);
		System.out.println(val);

		//Decimal points also can be used.
		str = "1.5";
		double val2 = Double.parseDouble(str);
		System.out.println(val2);

		//This will throw exception due to illegal format.
		//str = "1.5x";
		//al2 = Double.parseDouble(str);
		//System.out.println(val2);
	}

}
