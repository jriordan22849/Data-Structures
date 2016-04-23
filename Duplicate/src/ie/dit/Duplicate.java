package ie.dit;

public class Duplicate {
	static int[] myArray = new int[] {7,3,3,4,5};
	static boolean run = true;
	static String myString = "hello";
	Duplicate() {
		
	}
	
	public static void main(String[] args) {
		
		//checkDuplicate(myArray);
		//checkDuplicateCharacter(myString);
		smallestNumber(myArray);

	}
	
	public static void smallestNumber(int[] numbers) {
		
        int tempVar;
        int n = numbers.length;
        for (int c = 0 ; c < ( n - 1 ); c++)
        {
          	for (int d = 0 ; d < n - c - 1; d++)
          	{
            		if (numbers[d] > numbers[d+1]) /* For decreasing order use < */
            		{
            			tempVar       = numbers[d];
             			numbers[d]   = numbers[d+1];
             			numbers[d+1] = tempVar;
            		}
          	}// end inner for	

      	
       }// end outer for()

        for (int i = 0; i < numbers.length; i++)
        {
                  System.out.println(numbers[i]);
        }
		
	}
	
	public static void checkDuplicateCharacter(String myString) {
		int size = myString.length();
		char[] myChar = myString.toCharArray();
		int[] myArray = new int[size];
		int count = 1;
		
		for(int i = 0; i < myChar.length; i ++) {
			System.out.println(myChar[i]);;
		}
		
		for(int i = 0; i < myChar.length; i ++) {
			for(int j = i + 1; j < myChar.length; j ++) {
				if(myChar[i] == myChar[j]) {
					myArray[i] += count;
				}
			}
		}
		
		for(int i = 0; i < myArray.length; i ++) {
			if(myArray[i] >= 1) {
				System.out.println("Duplicate: " + myChar[i]);
			}
		}

	}
	
	public static void checkDuplicate(int[] myArray) {
		int count = 1;
		int size = myArray.length;
		System.out.println("size: " + size);
		int [] dup = new int[size] ;
		
		for(int i = 0; i < myArray.length; i ++) {
			System.out.println(myArray[i]);
		}
		
		for(int i = 0; i < size; i ++) {
			for(int j = i + 1; j < size; j ++) {
				if(myArray[i] == myArray[j]) {
					dup[i] += count;
				}
			}
		}
		
		for(int k = 0; k < size; k ++) {
			//System.out.println(dup[k]);
			if(dup[k] >= 1) {
				System.out.println("Duplicate " + myArray[k]);
			}
		}
		
	}
}

