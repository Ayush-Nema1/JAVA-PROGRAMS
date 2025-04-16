public class InversionQuestion {
        public static int mergesort(int arr[], int si, int en) {
            int count = 0;
            if (si >= en) {
                return count;
            }
      
            int mid = (si + en) / 2;
            count += mergesort(arr, si, mid);       // Sort the left half
            count += mergesort(arr, mid + 1, en);   // Sort the right half
            count += merge(arr, si, mid, en);       // Merge both halves and count inversions
      
            return count;
        }
      
        public static int merge(int arr[], int si, int mid, int en) {
            int temp[] = new int[(en - si) + 1];    // Temporary array for merging
            int i = si, j = mid + 1, k = 0;
            int ans = 0;
      
            // Merge the two halves while counting inversions
            while (i <= mid && j <= en) {
                if (arr[i] <= arr[j]) {             // Correct comparison
                    temp[k] = arr[i];
                    i++;
                } else {
                    ans += (mid - i + 1);           // Count the inversions
                    temp[k] = arr[j];
                    j++;
                }
                k++;
            }
      
            // Copy the remaining elements from the left half (if any)
            while (i <= mid) {
                temp[k++] = arr[i++];
            }
      
            // Copy the remaining elements from the right half (if any)
            while (j <= en) {
                temp[k++] = arr[j++];
            }
      
            // Copy the sorted subarray back into the original array
            for (i = si, k = 0; k < temp.length; k++, i++) {
                arr[i] = temp[k];
            }
      
            return ans;  // Return the count of inversions
        }
      
        public static void print(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
      
        public static void main(String[] args) {
            int arr[] = {5, 4, 8, 6, 7, 9};
            int en = arr.length - 1;
            System.out.println(mergesort(arr, 0, en));  // Output the number of inversions
        }
      }
         

