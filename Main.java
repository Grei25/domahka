//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void printArr(int[] arr, int size) {
        if (size < 1 || arr == null || arr.length == 0) {
            return;
        }
        System.out.print(arr[arr.length - size] + " ");
        printArr(arr, size - 1);
    }




    public static void main(String[] args) {
        int [] num ={1,2,3,4,5};
        printArr(num,num.length);

































        }
    }
