public class Missing{
    public static void main(String[] args) {
      int[] arr = {1, 2,  5, 6};
      int n = arr.length;
      int max = arr[n - 1];
  
      System.out.print("Missing numbers are: ");
      for (int i = 0; i < n - 1; i++) {
        if (arr[i + 1] - arr[i] > 1) {
          for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
            System.out.print(j + " ");
          }
        }
      }
    }
  }
  
