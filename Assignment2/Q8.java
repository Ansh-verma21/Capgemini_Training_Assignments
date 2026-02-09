public class SelectionNmarks {
	
	static boolean bubble(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] < b[i])
				return true;
			if (a[i] > b[i])
				return false;

		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3 }, { 1, 3, 2 }, { 2, 1, 3 }, { 2, 3, 1 }, { 2, 3, 2 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (bubble(arr[i], arr[j])) {
					int[] temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
