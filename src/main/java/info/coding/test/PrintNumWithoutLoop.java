package info.coding.test;

public class PrintNumWithoutLoop {

    public static void main(String[] args) {

        printNum(90);
    }

    public static void printNum(int num) {

        if (num < 0) {
            return;
        } else {
            printNum(num - 1);
            System.out.println(num);
        }
    }
}