package week1.day41;

public class PalindromMadam {
	public static void main(String args[])
	   {
		String str = "madam", reverseStr = "";
	    
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; i--) {
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println(str + " is a Palindrom String.");
	    }
	    else {
	      System.out.println(str + " is not a Palindrom String.");
	 
	   }
	}

}
