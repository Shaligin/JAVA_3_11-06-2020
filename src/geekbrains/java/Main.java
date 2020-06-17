package geekbrains.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private static Object String;

    public static void main(String[] args) {
        int []abc = new int[4];
        changeArr(); // не пойму как в метод передать массив???
    }

    public static <N> ArrayList<N> changeArr(N[] arr){
        return new ArrayList<N>(Arrays.asList(arr));
    }

        public static void rechange (Object[] arr, int a, int b){
            Object num = arr[a];
            arr[a] = arr[b];
            arr[b] =  arr[a];
        }

}
