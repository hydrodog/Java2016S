
public class Hello {
	public static void main(String[] args) {
		
//		sum(1..n) = n * (n+1) / 2
		long sum = 0;
		for (int i = 0; i <= 1000000; i++)
			sum += i;
		System.out.println(sum);
		
	}
}
