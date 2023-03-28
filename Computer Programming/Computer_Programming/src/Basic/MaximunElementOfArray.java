package Basic;
public class MaximunElementOfArray {
//	WAP to find the maximum element in an array
//	total sum of all the elements inside an array
//	WAP to find the second maximum element in an array
	public static void main(String[] args) {
		int sum = 0;
		int array[] = { 9, 67, 98, 34,150 };
		for (int i = 0; i < array.length; i++) {
			sum = array[i] + sum;
		}
		System.out.println("total sum of all the elements inside an array is: " + sum);

		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("the maximum element in an array is : "+max);
	}
}
