package Recurssion;

import java.util.ArrayList;
import java.util.List;

public class SublistsWithSum {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5};
        int targetSum = 7;

        List<List<Integer>> sublists = findSublistsWithSum(inputArray, targetSum);

        for (List<Integer> sublist : sublists) {
            System.out.println(sublist);
        }
    }

    public static List<List<Integer>> findSublistsWithSum(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findSublistsRecursive(arr, 0, target, new ArrayList<>(), result);
        return result;
    }

    private static void findSublistsRecursive(int[] arr, int currentIndex, int target, List<Integer> currentList, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(currentList));
            return;
        }

        if (currentIndex == arr.length) {
            return;
        }
//{1, 2, 3, 4, 5};
        // Include the current element
        if (target >= arr[currentIndex]) {
            currentList.add(arr[currentIndex]);
            findSublistsRecursive(arr, currentIndex + 1, target - arr[currentIndex], currentList, result);
            currentList.remove(currentList.size() - 1);
        }

        // Exclude the current element
        findSublistsRecursive(arr, currentIndex + 1, target, currentList, result);
    }
}
