package org.example.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TargetIndexSearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(null, 3));
        List<Integer> nums1 = new ArrayList<>();
        System.out.println(binarySearch(nums1, 3));
        nums1.add(1);nums1.add(2);nums1.add(3);nums1.add(4);nums1.add(5);
        System.out.println(binarySearch(nums1, 3));
        List<Integer> nums2 = new ArrayList<>();
        nums2.add(2);nums2.add(4);nums2.add(6);nums2.add(8);nums2.add(10);nums2.add(12);nums2.add(14);nums2.add(16);
        System.out.println(binarySearch(nums2, 16));
        System.out.println(binarySearch(nums2, 5));

    }

    public static int binarySearch(List<Integer> nums, int target) {
        if (Objects.isNull(nums) || nums.isEmpty()){
            return -1;
        }
        return nums.indexOf(target);
    }
}
