
//Refactor to create Generic Class to take in 3 variables of Generic Type

public class FindMaxIntegersNo<K extends Comparable<K>> {
	
	K x;
	K y;
	K z;
	
	//Constructor 
	public FindMaxIntegersNo(K x, K y, K z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

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
    	System.out.printf("\nMaximum of %d, %d and %d is %d", 7, 6, 5, maximum(7, 6, 5));
        System.out.printf("\nMaximum of %.1f, %.1f and %.1f is %.1f", 4.6, 8.9, 6.7, maximum(4.6,8.9, 6.7));
    	System.out.printf("\nMaximum of %s,%s and %s is %s","pear", "apple", "orange",maximum( "orange", "apple", "pear"));
    	  	
    }

}


/*
OUTPUT

Maximum of 7, 6 and 5 is 7
Maximum of 4.6, 8.9 and 6.7 is 8.9
Maximum of pear,apple and orange is pear
*/
