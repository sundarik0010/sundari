package week1.day3;

public class characterocc {
	public static void main(String[] args) {

		String str="welcome to Chennai";
int count=0;
		

		for (int i=0; i< str.length(); i++) {

		if(str.charAt(i)=='e') {
		count++;
		}
		}
		System.out.println('e'+" appears "+count+" times in the given statement");
		}
		}


