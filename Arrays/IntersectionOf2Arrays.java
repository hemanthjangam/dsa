package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOf2Arrays {
    static int[] intersect(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums1); Arrays.sort(nums2);

        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                set.add(nums1[i]);
                i++; j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            }
        }
        int size = set.size();
        int[] intersections = new int[size];
        int curr = 0;
        for (int num : set) {
            intersections[curr++] = num;
        }

        return intersections;
    }

    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums1 = new int[n];
        String[] parts1 = br.readLine().split("\\s+");
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = Integer.parseInt(parts1[i]);
        }

        int m = Integer.parseInt(br.readLine());
        int[] nums2 = new int[m];
        String[] parts2 = br.readLine().split("\\s+");
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = Integer.parseInt(parts2[i]);
        }

        int[] intersections = intersect(nums1, nums2);
        System.out.println(Arrays.toString(intersections));
    }
}
