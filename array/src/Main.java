import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public  class Main {
    //int
//    public static void main(String[] args) {
////        int arr[] = {1,2,3,4,5};
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("enter the number of items you'll add :");
//        int length = scanner.nextInt();
//        int arr[] = new int[length];
//
//        for(int i = 0; i < arr.length;i++){
//            System.out.print("enter element '" + (i+1) + "' :");
//            arr[i] = scanner.nextInt();
//        }
//        // sum of array items
//        int sum = 0;
//        for(int i = 0; i < arr.length;i++){
//            sum += arr[i];
//        }
//        float avg = sum/arr.length;
//
//        int num = 2;
//        boolean found = false;
//        for(int n : arr){
//            if(n == num){
//                found = true;
//                break;
//            }
//        }
//
//        int min = arr[0];
//        int max = arr[0];
//
//        for(int i =0; i < arr.length ; i++){
//            if(arr[i] < min){
//                min = arr[i];
//            }
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//
//        Arrays.sort(arr);
//        for (int n : arr) {
//            System.out.println(n);
//        }
//        System.out.println(min +" "+ max);
//        System.out.println(found == true ? "the item is found" : "item not found");
//        System.out.println("the sum is : " + sum);
//        System.out.println("the avg is : " + avg);
//
//
//
//    }

    //char
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    char arr[] = new char[]{};
//    System.out.println("enter your expression : ");
//    String str = scanner.nextLine();
//    arr = str.toCharArray();
//    Arrays.sort(arr, 7,10);
//    System.out.println(arr);
//    }

    //passing array to methods
//public static void main(String[] args) {
//    int arr[] = {1,3,6,8};
//    print(new int[]{2,4,6,8});
//    int arr1[] = getArray();
//    for (int i : arr1){
//        System.out.println(i + ":");
//    }
//}
//static  int[] getArray(){
//    int[] arr = {1,3,7,9};
//    return arr;
//
//}
//public static void print(int x[]){
//    for(int i : x){
//        System.out.println(i);
//    }
//}
//    public static void main(String[] args) {
//        int arr[][] ={{1,2,3},{4,5},{6}};
//
//
//        print(arr);
//        for(int i = 0; i <arr.length ; i++){
//            System.out.println("* "+(i+1)+ " *");
//            for (int j = 0; j < arr[i].length ; j++){
//                System.out.print(arr[i][j] + " " );
//            }
//            System.out.println();
//        }

//        for(int i = 0; i <arr.length ; i++){
//            System.out.println("* "+(i+1)+ " *");
//            for (int j = 0; j < arr[i].length ; j++){
//                System.out.print(arr[i][j] + " " );
//            }
//            System.out.println();
//        }





//    public static void print(int [][]arr){
//        for(int i = 0; i <arr.length ; i++){
//            System.out.println("* "+(i+1)+ " *");
//            for (int j = 0; j < arr[i].length ; j++){
//                System.out.print(arr[i][j] + " " );
//            }
//            System.out.println();
//        }
//    }

    //string
    static void main() {
        String str1 = "hello hello hello";
        for(String val : str1.split("l")){
            System.out.println(val);

        }
    }



}

