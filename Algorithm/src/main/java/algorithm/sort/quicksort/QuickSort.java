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

        // pivot을 기준으로 나누기
        for (int i = 0; i < size; i++) {
            if(pivot == arr.get(i)){
                medianList.add(arr.get(i));
            }else if(pivot < arr.get(i)){
                largeList.add(arr.get(i));
            }else {
                smallList.add(arr.get(i));
            }
        }

        // 각 size가 1이하라면 더이상 재귀하지 않음
        if(smallList.size() > 1){
            smallList = sort(smallList);
        }
        if(largeList.size() > 1){
            largeList = sort(largeList);
        }

        // 모든 정렬된 리스트를 병합하여 리턴
        List<Integer> joined = new ArrayList<>();
        joined.addAll(smallList);
        joined.addAll(medianList);
        joined.addAll(largeList);

        return joined;
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();

        int[] arr = new int[]{20, 18, 5, 19, 5, 25, 40, 50};

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        System.out.println(quickSort.sort(list));
    }
}
