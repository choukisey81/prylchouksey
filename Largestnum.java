package priyal;

public class Largestnum {
	public static void main(String args[]) {
		int num[]= {5,9,21,4,54,55,12};
		int largest=num[0];
		for(int i=0; i<num.length;i++) {
			if(num[i]>largest) {
				largest=num[i];
				System.out.println("largest number is:"+largest);
			}
		}
	}

}
