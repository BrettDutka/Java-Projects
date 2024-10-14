class Problem2 {

    /**
     * Finds the middle of the two arrays. By combining and using the index.
     *
     * @param A given sorted array
     * @param B given sorted array
     * @return The average of the combined arrays.
     */
    static int median(int[] A, int[] B) {
        int lengthA = A.length;
        int lengthB = B.length;
        int[] sumOfLists = new int[lengthA + lengthB];

        int first = 0;
        int last = 0;
        int t = 0;
        while(first < lengthA && last < lengthB){
            if(A[first] <= B[last]){
                sumOfLists[t++] = A[first++];
            } else{
                sumOfLists[t++] = B[last++];
            }
        }
        while(first < lengthA){
            sumOfLists[t++] = A[first++];
        }
        while(last < lengthB){
            sumOfLists[t++] = B[last++];
        }

        if((lengthA + lengthB) % 2 == 0){
            int tmp = sumOfLists[(lengthA + lengthB) / 2 - 1];
            int mid = sumOfLists[(lengthA + lengthB) / 2];
            return(tmp + mid) / 2;
        }else{
            return sumOfLists[(lengthA + lengthB) / 2];
        }
    }
}