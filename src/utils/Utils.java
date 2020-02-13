package utils;

public class Utils {
    public static void lines(String title) {
        System.out.println("------------------------ #" + title + "# ------------------------");
    }
    public static void lines() {
        System.out.println("------------------------------------------------");
    }


    public static void swap(int[] arr , int first , int second){
        var temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
