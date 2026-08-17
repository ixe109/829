import java.util.Random; //Import tells you where to find  Random

public class NumberPicker{
	public static void main(String[] args){
		
		Random r = new Random();
		System.out.println(r.nextInt(10)); // a number 0-9
	}

}
