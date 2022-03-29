
public class InPlaceBubbleSort {
    public int[] bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - (1 + i); j++) {

                if (arr[j] > arr[j + 1]) {
                    swap(j, arr);

                }
            }
        }
        return arr;
    }
    private void swap(int j, int[] arr){

        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
    }

    public static void main(String[] args) {
        InPlaceBubbleSort b = new InPlaceBubbleSort();
        int[] arr = {30, 10, 50, 20, 60, 40};
        System.out.println("Before sorting: ");
        b.traverse(arr);
        arr = b.bubbleSort(arr);
        System.out.println("\nAfter sorting: ");
        b.traverse(arr);
    }
    private void traverse(int [] arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
