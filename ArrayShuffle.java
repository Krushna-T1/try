import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class ArrayShuffle {
    public static void main(String[] args)
    {
        Integer[] arr={1,2,3,4,5,6,7};
      
        System.out.println("Array Before Shuffle : ");
        for(int i=0; i<arr.length;i++)
        {
          System.out.println(arr[i]);
        }
   
       List <Integer> l=Arrays.asList(arr);
       Collections.shuffle(l);
       l.toArray(arr);
       System.out.println("Array After Shuffle");
        for(int i=0; i<arr.length;i++)
        {
          System.out.println(arr[i]);
        }

    }
    
}
