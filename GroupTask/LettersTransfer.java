import java.util.Scanner;

public class LettersTransfer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text: ");
		String text = sc.next();

		text = text.toUpperCase();

		if (text.length() % 2 != 0) {
			text += "P";
		}
		char[][] table = new char[5][5];
		char letter = 'A';
		for (int row = 0; row < table.length; row++) {
			for (int col = 0; col < table.length; col++) {
				table[row][col] = letter;
				letter++;
			}
		}

		char[] letters = text.toCharArray();

		int firstIndex = 0;
		int secondIndex = 1;

		for (int index = 1; index <= letters.length / 2; index++) {
			char letter1 = letters[firstIndex];
			char letter2 = letters[secondIndex];
			int rowLetter1 = 0;
			int rowLetter2 = 0;
			int colLetter1 = 0;
			int colLetter2 = 0;

			for (int row = 0; row < table.length; row++) {
				for (int col = 0; col < table[0].length; col++) {
					if (table[row][col] == letter1) {
						rowLetter1 = row;
						colLetter1 = col;
					}
					if (table[row][col] == letter2) {
						rowLetter2 = row;
						colLetter2 = col;
					}
				}
			}

			if (colLetter1 == colLetter2) {
				if (rowLetter1 == 0) {
					letter1 = table[4][colLetter1];
					letter2 = table[rowLetter2 - 1][colLetter2];
				}
				if (rowLetter2 == 0) {
					letter1 = table[rowLetter1 - 1][colLetter1];
					letter2 = table[table.length - 1][colLetter2];
				}
				if (rowLetter1 != 0 && rowLetter2 != 0) {
					letter1 = table[rowLetter1 - 1][colLetter1];
					letter2 = table[rowLetter2 - 1][colLetter2];
				}
			}

			if (rowLetter1 == rowLetter2) {
				if (colLetter1 == 0) {
					letter1 = table[rowLetter1][table[0].length - 1];
					letter2 = table[rowLetter2][colLetter2 - 1];
				}
				if (colLetter2 == 0) {
					letter1 = table[rowLetter1][colLetter1 - 1];
					letter2 = table[rowLetter2][table[0].length - 1];
				}
				if (colLetter1 != 0 && colLetter2 != 0) {
					letter1 = table[rowLetter1][colLetter1 - 1];
					letter2 = table[rowLetter2][colLetter2 - 1];
				}
			}

			if (colLetter1 != colLetter2 && (rowLetter1 != rowLetter2)) {
				letter1 = table[rowLetter1][colLetter2];
				letter2 = table[rowLetter2][colLetter1];
			}
			letters[firstIndex] = letter1;
			letters[secondIndex] = letter2;

			firstIndex += 2;
			secondIndex += 2;
		}

		for (int index = 0; index < letters.length; index++) {
			System.out.print(letters[index] + " ");
		}
		sc.close();
	}
}
