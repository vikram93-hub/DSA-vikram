
        import java.util.*;

class Solution {

    public void mergeSort(int[] arr, int l, int r) {

        // Base case
        if (l >= r) {
            return;
        }

        int mid = (l + r) / 2;

        // Sort left half
        mergeSort(arr, l, mid);

        // Sort right half
        mergeSort(arr, mid + 1, r);

        // Merge both sorted halves
        merge(arr, l, mid, r);
    }

    public void merge(int[] arr, int l, int mid, int r) {

        ArrayList<Integer> temp = new ArrayList<>();

        int left = l;
        int right = mid + 1;

        while (left <= mid && right <= r) {

            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= r) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = l; i <= r; i++) {
            arr[i] = temp.get(i - l);
        }
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna