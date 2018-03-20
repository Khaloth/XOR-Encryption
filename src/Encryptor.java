import java.util.Random;

public class Encryptor {
	private String password;
	private String key;
	private int[] encryption;
	
	public Encryptor(String password) {

		char[] charArr = password.toCharArray();
		int[] intArr = new int[charArr.length];
		fill(intArr);
		int[] converted = convert(charArr);
		int[] encrypted = encrypt(intArr, converted);
		this.encryption = encrypted;
	}
	
	public static void fill(int[] arr) {
		
		for (int i = 0; i < arr.length; i ++) {
			Random gen = new Random();
			arr[i] = gen.nextInt(101);
		}
	}
	
	public static int[] convert (char[] arr) {
		
		int[] converted = new int[arr.length];
		for (int i = 0; i < arr.length; i ++) {
			int temp = (int) arr[i];
			converted[i] = temp;
		}
		return converted;
	}
	
	public static int[] encrypt(int[] arr0, int[] arr1) {
		assert(arr0.length == arr1.length); //Something must have gone horribly wrong.
		int[] encrypted = new int[arr0.length];
		for (int i = 0; i < arr0.length; i++) {
			int temp = arr0[i]^arr1[i];
			encrypted[i] = temp;
		}
		return encrypted;
	}
	
	public void giveHash() {
		for (int i = 0; i < this.encryption.length; i ++) {
			System.out.print(this.encryption[i]);
		}
	}
}
