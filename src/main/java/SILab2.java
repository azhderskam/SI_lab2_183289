
public class SILab2 {
	 static boolean checkPrime(int n) { //1
	        if (n < 0) { //2
	            throw new RuntimeException("Number should not be negative"); //3
	        } //4
	        int m = n / 2; //5
	        if (n == 0 || n == 1) { //6
	            return false; //7
	        } else {
	            for (int i = 2; i <= m; i++) { //8
	                if (n % i == 0) { ///9
	                    return true; //10
	                } //11
	            } //12
	            return false; //13
	        }
	    }//15

}
