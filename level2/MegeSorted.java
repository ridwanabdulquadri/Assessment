package level2;
import java.util.Arrays;
public class MegeSorted {
    public static void main(String[] args) {
            int[][] array = {{1,3,4,5}, {2,6,7,8}};
            int[] mergedSet = mergeSets(array);
            System.out.println(Arrays.toString(mergedSet));
        }

        public static int[] mergeSets(int[][] array) {
            int totalLength = 0;
            for (int[] merge : array) {
                totalLength += merge.length;
            }
            int[] mergedSet = new int[totalLength];
            int index = 0;
            for (int[] merge : array) {
                for (int element : merge) {
                    mergedSet[index++] = element;
                }
            }
            Arrays.sort(mergedSet);
            return mergedSet;
        }
    }