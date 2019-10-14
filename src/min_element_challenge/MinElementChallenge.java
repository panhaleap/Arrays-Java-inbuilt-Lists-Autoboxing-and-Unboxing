package min_element_challenge;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {
    private Scanner scanner = new Scanner(System.in);

    public int[] readIntegers(int count){
        int[] array = new int[count];
        System.out.println("Please Enter "+ count +" array values: ");
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public int findMin(int[] array){
        Arrays.sort(array);
        return array[0];
    }

    public void reverse(int[] array){
        int[] newArray = new int[array.length];
        int j = 0;
        for(int i = array.length-1; i >= 0; i--){
            newArray[j] = array[i];
            j++;
        }
        //System.out.println(Arrays.toString(newArray));
        for(int i = 0; i < newArray.length; i++){
            array[i] = newArray[i];
        }
    }
}
