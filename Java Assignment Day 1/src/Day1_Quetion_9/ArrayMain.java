package Day1_Quetion_9;

public class ArrayMain {
	public static void main(String[] args) {
		int[] arr = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};
        
        int sum = 0;
        int min = arr[0];
        for(int i = 0; i < 15; i++) {
            sum += arr[i];
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        arr[15] = sum;
        arr[16] = sum / 15;
        arr[17] = min;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
	}

}
