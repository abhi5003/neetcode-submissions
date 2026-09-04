class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
     return nums;
   }
   

   private void mergeSort(int[] num, int l, int r){
      if(l >= r) return;

      int m = (l + r)/2;
      mergeSort(num, l, m);
      mergeSort(num, m + 1, r);
      merge(num, l, m, r);
   }

  private void merge(int[] num, int l, int m, int r){
    List<Integer> list = new ArrayList<>();
    int i = l;
    int j = m + 1;

    while(i <= m && j <= r){
        if(num[i] <= num[j]){
            list.add(num[i]);
            i++;
        }else{
            list.add(num[j]);
            j++;
        }
    }

    while(i <= m){
        list.add(num[i]);
        i++;
    }

    while(j <= r){
        list.add(num[j]);
        j++;
    }

    for(i = l; i<=r; i++){
        num[i] = list.get(i - l);
    }
  }
}