package Sort;

public class SelectionSort_InPlace {
	public static void main(String[] args) {
		int[] num = new int[] {7,2,5,1,6,4,3};
		Sort(num);
		for (int nu : num) {
			System.out.print(nu + " ");
		}
	}

	public static void Sort(int[] array)
    {
        for (int i = 0, minIndex; i < array.length - 1; ++i)
        {
            minIndex = i;
            for (int j = i + 1; j < array.length; ++j)
                if (array[j] < array[minIndex])
                    minIndex = j;
            if (minIndex != i)
                Swap(array, minIndex, i);
        }
    }
 
    private static void Swap(int[] array, int indexA, int indexB)
    {
        int tmp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = tmp;
    }

}
