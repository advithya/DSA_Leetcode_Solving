class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> Intersect = new HashSet<>();

        for(int i: nums1){
            set1.add(i);
        }

        for(int i : nums2){
            if(set1.contains(i)){
                Intersect.add(i);
            }
        }

        int result[]= new int[Intersect.size()];
        int index=0;

        for(int i: Intersect){
            result[index++]=i;
        }
        return result;
    }
}