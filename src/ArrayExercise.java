import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise {

    public static int[] getInteger(int num){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[num];
        System.out.println("Please input "+ num +" interger type for array elements:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] array){
        System.out.println("Array Elemets are: ");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int lowest = array[0];
        int minus = 0;
        int lowestIndex = 0;
        int[] newArray = new int[array.length];
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array.length; j++){
                if( i + minus < array.length && newArray[i + minus] != array[lowestIndex] && lowest > array[j]){
                    lowest = array[j];
                    lowestIndex = j;
                }
            }
            newArray[i] = lowest;
            minus++;
        }

        //Arrays.sort(array);
        return newArray;
    }

    public static void main(String[] args) {
//        int[] arr = getInteger(5);
//        printArray(arr);

        int[] arr = {3,2,5,4,1};
        printArray(sortIntegers(arr));
    }
}
