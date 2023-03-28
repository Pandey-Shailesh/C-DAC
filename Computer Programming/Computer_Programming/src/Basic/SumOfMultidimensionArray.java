package Basic;

public class SumOfMultidimensionArray {
public static void main(String[] args) {
	int [][]matrixA = {{10,20,30},{40,50,60},{70,80,90}};
	int [][]matrixB = {{110,120,130},{140,150,160},{170,180,190}};
	int [][] sumOfMatrix =new int [3][3];
	for (int i = 0; i < matrixA.length; i++) {
		for (int j = 0; j < matrixB.length; j++) {
			sumOfMatrix[i][j]=matrixA[i][j]+matrixB[i][j];
		}
	}
	System.out.println();
	for (int i = 0; i < sumOfMatrix.length; i++) {
		for (int j = 0; j < sumOfMatrix.length; j++) {
			System.out.print("[ " + sumOfMatrix[i][j] + " ] ");	
		}
		System.out.println();
	}
}
}
