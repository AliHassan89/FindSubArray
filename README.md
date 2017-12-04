# FindSubArray
Implement the findarray.MyFindArray.findArray(int[] array, int[] subArray) 
method that given two arrays as parameters will find the starting index where 
the second parameter occurs as a sub-array in the array given as the first 
parameter.

If given sub-array (second parameter) occurs more than once then the method 
should return the starting index of the last occurrence.

Your implementations should return -1 if the sub-array cannot be found.

For extra points: implement it in an efficient way for large input arrays.

Sample Input:

[4,9,3,7,8] and [3,7] should return 2.
[1,3,5] and [1] should return 0.
[7,8,9] and [8,9,10] should return -1.
[4,9,3,7,8,3,7,1] and [3,7] should return 5.
