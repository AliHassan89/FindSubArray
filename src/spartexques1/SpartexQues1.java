/*

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

 */
package spartexques1;

import java.util.*;

/**
 *
 * @author Ali
 */
public class SpartexQues1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr1 = {4,9,3,7,8,9,7,8,3,6,3};
        int[] arr2 = {3,7};
        System.out.println(findArray(arr1, arr2));
    }
    
    public static int findArray(int[] array, int[] subArray) 
    {
      if (subArray.length <= 0 || array.length <= 0)
      {
        return -1;
      }
      
      int result = -1;
      Map<Integer, ArrayList<Integer>> map = new HashMap<>();
      ArrayList<Integer> listOfIndices;
      
      for (int i=0; i<array.length; i++)
      {
        if (map.get(array[i]) != null)
        {
          listOfIndices = map.get(array[i]);
        }
        else
        {
          listOfIndices = new ArrayList<>();
        }
        listOfIndices.add(i);
        map.put(array[i], listOfIndices);
      }
      
      listOfIndices = map.get(subArray[0]);
      
      for (int index : listOfIndices)
      {
        int count = 0;
        int x = index;
        for (int i=0; i<subArray.length; i++)
        {
          if (x < array.length && subArray[i] == array[x])
          {
            count++;
          }
          x++;
        }
        
        if (count == subArray.length)
        {
          result = index;
        }
      }
      
      return result;
    }
    
}
