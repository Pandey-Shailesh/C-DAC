package Basic;

public class PrintAnArray {
public static void main(String[] args) {
	//WAP to display the array elements with index value.
	int arr[]= new int[10];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=i;  
		System.out.println("arr["+i+"] = "+arr[i]);
	}
	System.out.println();
//not possible with the for each loop.
	int j=0;
	while (j < arr.length) {
		arr[j]=j;
		System.out.println("arr["+j+"] = "+arr[j]);
		j++;
		
	}
}
}
