
//Given three float find maximum,ensured test code has passed test case

public class FindMaxIntegersNo {

	public static float findMax(Float x, Float y, Float z) {
        Float max = x; // assume x is initially the largest

        if (y.compareTo(max) > 0)
            max = y; // y is the largest so far

        if (z.compareTo(max) > 0)
            max = z; // z is the largest
        
        System.out.printf("The max of three numbers %s %s %s is : %s \n",x,y,z,max);
        return max; // returns the largest object
    } 

    public static void main(String args[]) {
    	//TC1. 1 max no. at first
        float float1 = 99.25f,float2 = 80.2f, float3 = 36.4f;
        float max1 = findMax(float1,float2,float3);

        //TC1 .2 max no. at second
        float float4 = 17.6f,float5 = 85.5f,float6 = 50.5f;
        float max2 = findMax(float4,float5,float6);

        //TC1. 3 max no. at third
        float float7 = 30.1f,float8 = 35.3f,float9 = 76.2f;
        float max3 = findMax(float7,float8,float9);
    }

}


/*
OUTPUT

The max of three numbers 99.25 80.2 36.4 is : 99.25 
The max of three numbers 17.6 85.5 50.5 is : 85.5 
The max of three numbers 30.1 35.3 76.2 is : 76.2 

*/
