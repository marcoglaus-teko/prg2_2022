package ch.teko.prg2.tag02.input.demoInterface;

/**
 * @author Marco Glaus jun.
 * @version 1.0.1
 */
public interface IArithmeticOperations {
    /**
     * Returns the sum of two random integer numbers.
     * @param numberA first value
     * @param numberB second value
     * @return an integer.
     */
    int sum(int numberA, int numberB);

    /**
     * Returns the difference of two random integer number.
     * @param numberA
     * @param numberB
     * @return an integer.
     */
    int difference(int numberA, int numberB);

    /**
     *
     * @param numberA
     * @param numberB
     * @return an integer
     */
    int product(int numberA, int numberB);

    /**
     *
     * @param numberA first value
     * @param numberB second value
     * @return an Integer
     */
    int quotient(int numberA, int numberB);

}
