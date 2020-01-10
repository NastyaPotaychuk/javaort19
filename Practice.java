import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double literA = 10000;
		double milB = 100;
		double literC = 20;

		String userInput;

		while (true) {
			System.out.println("Input value for liter A :");
			userInput = scanner.nextLine();
			double unchekedSideAVaule = Double.parseDouble(userInput);

			if (unchekedSideAVaule <= 0) {
				System.out.println("Your input is not correct");
				continue;
			} else {
				literA = unchekedSideAVaule;
				break;
			}
		}
		while (true) {
			System.out.println("Input value for liter C :");
			userInput = scanner.nextLine();
			double unchekedSideAVaule = Double.parseDouble(userInput);

			if (unchekedSideAVaule <= 0) {
				System.out.println("Your input is not correct");
				continue;
			} else {
				literC = unchekedSideAVaule;
				break;
			}
		}
		System.out.println("Residue in capacity" + (literA - literC));
		
		while (true) {
			System.out.println("Input value for mil B :");
			userInput = scanner.nextLine();
			double unchekedSideAVaule = Double.parseDouble(userInput);
         if (unchekedSideAVaule <= 0) {
				System.out.println("Your input is not correct");
				continue;
			} else {
				milB= unchekedSideAVaule;
				break;
			}
		}
		System.out.println("Servings were flooded" + (literC* 1000 / milB));
	}
}