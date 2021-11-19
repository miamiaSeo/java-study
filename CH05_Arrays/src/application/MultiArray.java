package application;

public class MultiArray {

	public static void main(String[] args) {
		// 이중 배열[][]
		String[][] texts = {
				{"one","two","three"},
				{"four","five","six"},
				{"seven","eight","nine"}
		};
		
		for(int i=0; i<texts.length;i++) {
			// System.out.printf("%d번째 배열 %s \n", i, texts[i]);
			// String[] inArray = texts[i];
			
			for(int j = 0; j < texts[i].length; j++) {
				System.out.printf("%s \t", texts[i][j]);
			}
			System.out.println();
		}

	}

}
