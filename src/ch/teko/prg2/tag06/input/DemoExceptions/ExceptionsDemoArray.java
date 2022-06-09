package ch.teko.prg2.tag06.input.DemoExceptions;

/**
 * mögliche RuntimeException, ist "unchecked" und muss nicht zwingend behandelt werden. Compiler reklamiert nicht.
 */
public class ExceptionsDemoArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        for (int i = 0; i < 6; i++){
            System.out.println(array[i]);
        }
    }
}
