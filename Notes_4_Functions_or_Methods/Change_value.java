package Notes_4_Functions_or_Methods;

// In java with primitive data types (int, char, byte, short etc) we can only do pass by value.

// if we modify object -> then value changes example in case of Arrays in java
/*
    int a[] = {1, 2 ,3}
    int b[] = a

    =>  a ----> {1, 2 ,3} <---- b
    
    b[1] = 99

    =>  a ----> {1, 99 ,3} <---- b
 */
public class Change_value {
    //int [] arr => array of inetgers
    public static void change(int[] array, int index, int value){
        array[index] = value;
    }
   public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[2]); // 3

        change(arr, 2, 100);        
        System.out.println(arr[2]); // 100

        int a[] = {1, 2, 3};
        int b[] = a; 

        b[1] = 99;
        System.out.println(a[0] + " " + a[1] + " " + a[2]);
   } 
}
