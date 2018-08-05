public class MergeSort {
    public static int a = 5;

    static void mergeSort(int[] n, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left)/2;

        mergeSort(n, left, mid);
        mergeSort(n, mid + 1, right);
        MergeSort ms = new MergeSort();
        ms.merge(n, left, right, mid);
    }

    void merge(int[] n, int left, int right, int mid) {
        int helper[] = new int[n.length];
        int leftindex = left;
        int rightindex = mid + 1;
        for (int i = 0; i < n.length; i++) {
            helper[i] = n[i];
        }
        while (leftindex <= mid && rightindex <= right) {
            if (helper[leftindex] < helper[rightindex]) {
                leftindex++;
                left++;
            }
            else {
                n[left] = helper[rightindex];
                n[rightindex++] = helper[left++];
            }

        }
        while(leftindex <= mid) {
            n[left++] = helper[leftindex++];
        }
        return;

    }
    public static void main(String[] args) {
        int[] newSort = {1, 8, 7, 60, 5, 4};
        int left = 0;
        int right = newSort.length -1;
        MergeSort.mergeSort(newSort, left, right);
        for(int k = 0; k < newSort.length; k++) {
            System.out.println(newSort[k]);

        }

    }
}
