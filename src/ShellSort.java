public class ShellSort {

    public static void main(String[] args) {
        int[] arr = {12, 34, 54, 2, 3};

        shellSort(arr);

        System.out.println("Array ordenado:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    
    public static void shellSort(int[] arr) {
        int n = arr.length;

        // Define o intervalo inicial de h
        int h = 1;
        while (h < n / 3) {
            h = 3 * h + 1;
        }

        // Começa com o maior h e vai reduzindo até h = 1
        while (h >= 1) {
            // Ordena usando insertion sort com intervalo h
            for (int i = h; i < n; i++) {
                int key = arr[i];
                int j = i - h;

                while (j >= 0 && arr[j] > key) {
                    arr[j + h] = arr[j];
                    j -= h;
                }

                arr[j + h] = key;
            }

            h /= 3;
        }
    }    
}

