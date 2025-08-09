////Quick Sort
// import java.util.*;
// class Main{
//     public static void main(String [] args)
//     {
//         int [] arr = {2,31,4,6,7};
//         quickSort(arr, 0, arr.length-1);
//         System.out.println(Arrays.toString(arr));
//     }
//     public static void quickSort(int [] arr, int low, int high)
//     {
//         if(low < high)
//         {
//             int pi = pivot(arr, low, high);
//             quickSort(arr, low, pi-1);
//             quickSort(arr, pi+1, high);
//         }
//     }
//     public static int pivot(int [] arr, int low, int high)
//     {
//         int piv = arr[high];
//         int i = low - 1;
//         for(int j = low; j < high; j++)
//         {
//             if(arr[j] < piv)
//             {
//                 i++;
//                 int temp = arr[j];
//                 arr[j] = arr[i];
//                 arr[i] = temp;
//             }
//         }
//         int tmep = arr[i+1];
//         arr[i+1] = arr[high];
//         arr[high] = tmep;
//         return i+1;
        
//     }
// }
// _____________________________________________________________________________________________________________________________________________________
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
// //remove duplicates using two pointers.
// //So that all duplicates are next to each other.
// //i – keeps track of the position of the last unique number.
// //j – moves through the array to check for new numbers.
// //If nums[j] is different from nums[i], it's a new unique number.
// //Move i forward by 1.
// //Copy nums[j] to nums[i].
// //Repeat this until j reaches the end of the array.
// //Now, the first (i + 1) elements in the array are all the unique numbers.
// import java.util.*;
// class Main{
//     public static void main(String [] args)
//     {
//         int [] nums = {3,4,1,4,5,2};
//         Arrays.sort(nums);
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
//_______________________________________________________________________________________________________________________________________________________
// //valid paranthesis 
// //push it into stack if its open(
// //if closed appears) -> check stack if the stack is emply then its invalid
// //if not empty . chck the top element of the stack if its opening match then we pop the matching opening out of the stack
// //if not matched then its invalid
// //at end if the stack is empty then valid.
// import java.util.*;
// class Main{
//     public static void main(String [] args)
//     {
//         String str = "{{()}}";
//         char [] arr = str.toCharArray();
//         Stack<Character> stk = new Stack<>();
//         for(char ch : arr)
//         {
//             if(ch == '{' || ch == '(' || ch == '[')
//             {
//                 stk.add(ch);
//             }
//             else
//             {
//                 if(stk.isEmpty())
//                 {
//                     System.out.println("in valid");
//                 }
//                 char top = stk.pop();
//                 if(ch == '}' && top != '{' || ch == ')' && top != '(' || ch == ']' && top != '[')
//                 {
//                     System.out.println("in valid");
//                 }
//             }
//         }

//         System.out.println(stk.isEmpty());

//     }
// }
//______________________________________________________________________________________________________________________________________________________
// class Main{
//     public static void main(String [] args)
//     {
//         Computer lap = new Laptop();
//         Computer des = new Desktop();
//         Developer dev = new Developer();
//         dev.devApp(lap);

//     }
// }

// interface Computer
// {
//      void code();
// }
// class Laptop implements Computer
// {
//     @Override
//     public void code()
//     {
//         System.out.println("laptop");
//     }

// }
// class Desktop implements Computer
// {
//     @Override
//     public void code()
//     {
//         System.out.println("Desktop");
//     }

// }
// class Developer
// {
//     public void devApp(Computer comp)
//     {
//         comp.code();
//     }

// }
//_________________________________________________________________________________________________________________________________________________
//Inheritance
// class Main{
//     public static void main(String[] args) 
//     {
//         A a = new A();
//         B obj = new B();
//         System.out.println(obj.b);
//     }
// }
// class A 
// {
//     int a = 20;
// }
// class B extends A 
// {
//     int b = 40;
// }
//__________________________________________________________________________________________________________________________________________________
//encapsulation
// class Main
// {
//     public static void main(String [] args)
//     {
//         Person obj = new Person(25);
//         obj.setAge(2);
//         System.out.println(obj.getAge());
//     }
// }
// class Person
// {
//    private int age;
//    public Person(int age)
//    {
//     this.age = age;
//     setAge(age);
//    }
//    public void setAge(int age)
//    {
//     this.age = age;
//    }
//    public int getAge()
//    {
//     return age;
//    }
// }
//_________________________________________________________________________________________________________________________________________________
//overloding
// class Main{
//     public static void main(String [] args)
//     {
//         sum obj = new sum();
//         System.out.println(obj.add(1,2));
//         System.out.println(obj.add(1));
//     }
// }
// class sum{
//     public static int  add(int a, int b)
//     {
//         return a+b;
//     }
//     public static int  add(int a)
//     {
//         return a+1;
//     }
// }
//______________________________________________________________________________________________________________________________________________
////Overriding
// import java.util.*;
// class Main{
//     public static void main(String [] args)
//     {
//         A obj = new B();
//         System.out.println(obj.sum(2,3));
//     }
// }
// class A 
// {
//     public  int sum(int a, int b)
//     {
//         return a+b;
//     }
// }
// class B extends A
// {
//     @Override
//     public  int sum(int a, int b)
//     {
//         return a+1;
//     }
// }
//_________________________________________________________________________________________________________________________________________________
//count number of one bits - brian kerninghan's algorithm
// class Main{
//     public static void main(String [] args)
//     {
//         int n = 5;
//         int count = 0;
//         while(n != 0)
//         {
//             n = n & (n-1);
//             count ++;
//         }
//         System.out.println(count);
//     }
// }
//_________________________________________________________________________________________________________________________________________________
//231. Power of Two
// class Main{
//     public static void main(String [] args)
//     {
//         int n = 5;
//         int count = 0;
//         while(n != 0)
//         {
//             n = n & (n-1);
//             count++;
//         }
//         if(n == 1)
//         {
//             System.out.println("n is power of 2");
//         }
//         else
//         {
//             System.out.println("no");
//         }
//     }
// }
