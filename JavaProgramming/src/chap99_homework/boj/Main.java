package chap99_homework.boj;


import java.nio.ByteOrder;

public class Main {

	public static void main(String[] args) {

        if (ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN)) {
            System.out.println("Big Endian");
        } else {
            System.out.println("Little Endian");
        }
    }
}
