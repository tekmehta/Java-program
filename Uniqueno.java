/*unique elements in an array*/
import java.util.HashSet;
import java.util.Set;

public class Uniqueno{
  public static void main(String[] args) {
    int[] arrNum = {1, 2, 2, 1, 3, 4, 3, 4, 1, 5, 3, 5,3,5,2,2,4,8,9,9,8,7,6,5};
    Set<Integer> uniqueNumbers = findUniqueNumbers(arrNum);
    System.out.println("Unique numbers: " + uniqueNumbers);
  }

  public static Set<Integer> findUniqueNumbers(int[] arrNum) {
    Set<Integer> uniqueNumbers = new HashSet<>();
    for (int num : arrNum) {
      uniqueNumbers.add(num);
    }
    return uniqueNumbers;
  }
}
