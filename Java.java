
import java.util.HashSet;

// // merge sort - telusko yt
//1.divide the array using mid
//2.recurcively call first half or array and second half of array (call mergsort 2 times)
//3.then need to merge the arrays 
//4.create 2 arrays left array and right array - with size of array larr -> low to mid, rarr -> mid to high
//5.add elements into larr and rarr form main arr
//6.use i,j,k for pointing the arrays, now need to perform sorting, if larr element is small place it in arr
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         {
//             int [] arr = { 5,1,2,3,4 };
//             mergeSort(arr, 0, arr.length-1);
//             System.out.println(Arrays.toString(arr));


//         }
//     }
//     public static void mergeSort(int [] arr, int l, int r)
//     {
//         if(l<r)
//         {
//             int mid = (l+r)/2;
//             mergeSort(arr,l,mid);
//             mergeSort(arr,mid+1,r);

//             merge(arr, l, mid, r);
//         }
//     }
//     public static void merge(int[] arr, int l, int mid , int r)
//     {

//         int n1 = mid - l + 1;
//         int n2 = r - mid;
//         int larr []  = new int[n1];
//         int rarr [] = new int[n2];

//         for(int i = 0; i < n1 ;i++)
//         {
//             larr[i] = arr[l+i];
//         }
//         for(int i = 0; i < n2; i++)
//         {
//             rarr[i] = arr[mid+1+i]; 
//         }
        
//         int i = 0;
//         int j = 0;
//         int k = l;

//         while(i<n1 && j<n2)
//         {
//             if(larr[i] <= rarr[j])
//             {
//                 arr[k] = larr[i];
//                 i++;
//             }
//             else
//             {
//                 arr[k] = rarr[j];
//                 j++;
//             }
//             k++;
//         }
//         while(i<n1)
//         {
//             arr[k] = larr[i];
//             i++;
//             k++; 
//         }
//         while(j<n2)
//         {
//             arr[k] = rarr[j];
//             j++;
//             k++;
//         }
           
//     }
// }
//________________________________________________________________________________________________________________________________________________________
//Binary Search
// import java.util.*;
// class Main{
//     public static void main(String [] args)
//     {
//         int [] arr = {4,2,3,5,1};
//         int k = 3;
//         Arrays.sort(arr);
//         int ans = binarySearch(arr, k);
//         if(ans == -1)
//         {
//             System.out.println("Element is not present");
//         }
//         else
//         {
//             System.out.println("present at " + ans);
//         }
//     }
//     public static int  binarySearch(int[] arr, int k )
//     {
//         int low = 0;
//         int high = arr.length - 1;
//         while(low <= high)
//         {
//             int mid = low+(high-low)/2;

//             if(arr[mid] == k)
//             {
//                 return mid;
//             }
//             if(arr[mid] < k)
//             {
//                 low = mid + 1;
//             }
//             else
//             {
//                 high = mid - 1;
//             }
//         }
//         return -1;
//     }
// }
//_____________________________________________________________________________________________________________________________________________________________
//remove duplicates using two pointers.
// class Main{
//     public static void main(String [] args)
//     {
//         int [] nums = {3,4,1,4,5,2};
//         int i  = 0;
//         for(int j = 1; j < nums.length; j++)
//         {
//             if(nums[j] != nums[i])
//             {
//                 i++;
//                 nums[i] = nums[j];
//             }
//         }
//         System.out.println(i+1);
        
//     }
// }
//________________________________________________________________________________________________________________________________________________________
// // move zeros to end using two pointers.
// import java.util.*;
// class Main{
//     public static void main(String [] args)
//     {
//         int [] arr = {2,1,9,03,42,2,0,1,0,4};
//         int i = 0;
//         for(int x : arr)
//         {
//             if(x != 0)
//             {
//                 arr[i] = x;
//                 i++;
//             }
//         }
//         while(i < arr.length)
//         {
//             arr[i] = 0;
//             i++;
//         }
//         System.out.println(Arrays.toString(arr));
//     }
// }
//____________________________________________________________________________________________________________________________________________________
// //reverse a string 
// class Main{
//     public static void main(String [] args)
//     {
//         String str = "saketh";
//         char [] arr = str.toCharArray();
//         int l = 0;
//         int r = str.length()-1;
//         while(l < r)
//         {
//             char temp = arr[l];
//             arr[l] = arr[r];
//             arr[r] = temp; 
//             l++;
//             r--;
//         }
//         String str1 = new String(arr);
//         System.out.println(str1);
//         //System.out.println(Arrays.toString(arr));

//     }
// }
//___________________________________________________________________________________________________________________________________________________
// //two sum 
// //we use hash map. store the first element in the hash map -> and we search for difference ie target- array element. 
// //if the difference is found we return the currect element and the element in the map that is equal to diff.
// import java.util.*;
// class Main{
//     public static void main(String[] ags)
//     {
//         int [] arr = {2,2,5,6,8};
//         int target = 7;
//         int [] arr1 = new int[2];
//         HashMap<Integer,Integer> mp = new HashMap<>();
//         for(int i = 0; i < arr.length; i++)
//         {
//             int diff = target - arr[i];
//             if(mp.containsKey(diff))
//             {
//                 arr1 = new int[2];
//                 arr1[0] = mp.get(diff);
//                 arr1[1] = i;

//             }
//             mp.put(arr[i],i);
//         }
//         System.out.println(Arrays.toString(arr1));
        
//     }
// }
//____________________________________________________________________________________________________________________________________________________________
// //max sum array sum using sliding window
// //first find the sum of k elements.
// //and then add the k+1 element to the sum and subract the first element 0th element form the sum. 
// class Main{
//     public static void main(String [] args)
//     {
//         int [] arr = {1,2,3,20,4,5,6,6};
//         int k = 3;
//         int sum = 0;
//         int max = 0;
//         for(int i = 0; i < k; i ++)
//         {
//             sum = sum + arr[i];
//         }
//         max = sum;
//         for(int i = k; i < arr.length; i++)
//         {
//             sum = sum + arr[i] - arr[i-k];
//             max = Math.max(max, sum);
//         }

//         System.out.println(max);
//     }
// }
//___________________________________________________________________________________________________________________________________________________
// //219. Contains Duplicate II
// import java.util.*;
// class Main{
//     public static void main(String [] args)
//     {
//         int [] arr = {1,2,1,3,1,4,2,4};
//         int k = 3;
//         HashMap<Integer, Integer> mp = new HashMap<>();
//         for(int i = 0; i < arr.length; i++)
//         {

//             if(mp.containsKey(arr[i]))
//             {
//                 int x = mp.get(arr[i]);
//                 if(Math.abs(x-i)<=k)
//                 {
//                     System.out.println("found");
//                     break;
//                 }
//             }
//             mp.put(arr[i],i);
//         }
//         System.out.println("not found");

//     }
// }
//_______________________________________________________________________________________________________________________________________________
// //find the longest non repeating substring
// class Main{
//     public static void main(String [] args)
//     {
//         String str = "aabac";
//         HashSet<Character> st = new HashSet<>();
//         int l = 0;
//         int r = 0;
//         int max = 0;
//         while(r < str.length())
//         {
//             char ch = str.charAt(r);
//             if(!st.contains(ch))
//             {
//                 st.add(ch);
//                 max = Math.max(max, (r-l)+1);
//                 r++;
//             }
//             else
//             {
//                 st.remove(str.charAt(l));
//                 l++;
//             }
//         }
//         System.out.println(max);
//         System.out.println(st);

//     }
// }

