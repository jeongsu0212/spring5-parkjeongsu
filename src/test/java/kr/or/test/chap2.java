package kr.or.test;

public class chap2 {

	public static void main(String[] args) {
		int[][] intArray = new int[4][4];
		int num = 1;
		for(int i=0; i<intArray.length; i++) {
			for(int j=0; j<intArray[i].length; j++) {
				intArray[i][j] = num++;
				System.out.print(intArray[i][j]+ "\t");
			}System.out.println();
		}
		
			
	}
}
