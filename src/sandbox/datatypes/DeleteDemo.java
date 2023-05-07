package src.sandbox.datatypes;

public class DeleteDemo {
    public static void print(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.println("i = " + i + ", j = " + j);
            }
            System.out.println("End of Inner loop");
        }
        System.out.println("End of outer loop");
    }

    public static void removeEven(int[] arr){
        int n = arr.length;
        for (int i=0; i<n; i++){
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static int[] getOdd(int[] arr){
        int oddCount = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i] % 2 != 0){
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int idx = 0;
        for (int i=0;i< arr.length;i++){
            if (arr[i] % 2 != 0){
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        DeleteDemo.print(3);
        int[] array = {3, 2, 4, 7, 10, 6, 5};
        int[] returnArray = DeleteDemo.getOdd(array);
        System.out.print(returnArray);
    }
}
