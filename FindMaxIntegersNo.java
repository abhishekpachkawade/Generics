
//Given three String find maximum,ensured test code has passed test case

public class FindMaxIntegersNo {

	// determines the largest of three Comparable objects
	public static <K extends Comparable<K>> K maximum(K x, K y, K z) {
        K max = x; // assume x is initially the largest

        if (y.compareTo(max) > 0)
            max = y; // y is the largest so far

        if (z.compareTo(max) > 0)
            max = z; // z is the largest
        
        return max; // returns the largest object
    } 

    public static void main(String args[]) {
    	//print statement and passing string value
    	System.out.printf("\nMaximum of %s,%s and %s is %s","pear", "apple", "orange",maximum( "pear", "apple", "orange"));
    	  	
    }

}


/*
OUTPUT

Maximum of pear,apple and orange is pear

*/
