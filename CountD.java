package priyal;

public class CountD {
	public static void main(String arg[]) {
		int num=989665467;
		int count=0;
		if (num==0) {
			System.out.println(0);
			
		}else {
			for(int i=num; i>0; i=i/10)
				        count++;
			System.out.println("number of digit is"+count);
		}
	
	}

}
