
public class FirstJava {
	public static void main(String[] args) {
		double avg = 89.5;
		long value1 = Double.doubleToLongBits(avg);
		System.out.println(Long.toBinaryString(value1));

	}
}
