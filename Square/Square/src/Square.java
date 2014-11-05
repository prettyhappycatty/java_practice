
public class Square {
	public static void main(String[] args){
		int x = 1;
		while ( square(x) < 50 ){
			System.out.println(square(x));
			x++;
		}
	}
	
	static int square(int x){
		return x*x;
	}

}
