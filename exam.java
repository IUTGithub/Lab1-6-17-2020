
public class exam {
	public static void main(String[] args) {
		int[] intArray = new int[27];
		
		for (int x = 0; x < 9; x++) {
			intArray[x] = x + 1;
		}
		for (int x = 9; x < 18; x++) {
			intArray[x] = intArray[x - 9] * 3;;
		}
		
		for (int x = 18; x < 27; x++) {
			intArray[x] = intArray[x - 18] * 5;
		}
		
		for (int x = 0; x < 10; x++) {
			if (x == 3) {
				System.out.println("");
			}
			if (x == 7) {
				System.out.println("");
			}
			for (int i = 0; i < 27; i++) {
				if (x < 3 && i < 8) {
					System.out.printf("%s,", intArray[i]);
				} else if (i == 8 && x < 3){
					System.out.printf("%s#", intArray[i]);
				}
				
				if (x > 3 && x < 7 && i > 8 && i < 18 && i != 17) {
					System.out.printf("%s,", intArray[i]);
				} else if (i == 17 && x > 3 && x < 7) {
					System.out.printf("%s#", intArray[i]);
				}
				
				if (x > 6 && x < 10 && i > 17 && i < 27 && i != 26) {
					System.out.printf("%s,", intArray[i]);
				} else if (i == 26 && x > 6 && x < 10) {
					System.out.printf("%s#", intArray[i]);
				}
			}
			
		}
	}
}
