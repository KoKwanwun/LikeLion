package algorithm.sort.quicksort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public List<Integer> sort(List<Integer> arr) {
        int size = arr.size();
        int pivot = arr.get(size/2);

        List<Integer> smallList = new ArrayList<>();
        List<Integer> medianList = new ArrayList<>();
        List<Integer> largeList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            if(pivot == arr.get(i)){
                medianList.add(arr.get(i));
            }else if(pivot < arr.get(i)){
                largeList.add(arr.get(i));
            }else {
                smallList.add(arr.get(i));
            }
        }

        if(smallList.size() > 1){
            smallList = sort(smallList);
        }
        if(largeList.size() > 1){
            largeList = sort(largeList);
        }

        List<Integer> joined = new ArrayList<>();
        joined.addAll(smallList);
        joined.addAll(medianList);
        joined.addAll(largeList);

        return joined;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{20, 18, 5, 19, 5, 25, 40, 50};

        
    }
}
