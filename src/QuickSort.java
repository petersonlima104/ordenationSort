public class QuickSort {

     public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Array ordenado:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort2 (int[] a, int lo, int hi){
        int i=lo, j=hi, h;
        int x=a[(lo+hi)/2];
        do {
            while (a[i]<x)
                i++;
                while (a[j]>x)
                    j--;
                    if (i<=j){
                        h=a[i]; a[i]=a[j]; a[j]=h;
                        i++;
                        j--;
                    }
        } while (i<=j);
            if (lo<j) quickSort(a, lo, j);
            if (i<hi) quickSort(a, i, hi);
    } 

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }   
}

