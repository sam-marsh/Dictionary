import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Dictionary is a class to maintain a set of comparable objects, allowing lg
 * time insertion, deletion and searching
 * The source file for this interface is available <a href="./Dictionary
 * .java">here</a>
 * Marking scheme: 50% report: 20% description, 20% complexity analysis, 10%
 * empirical testing
 * 50% code: 10% presentation, 20% correctness, 20% efficiancy (0 linear
 * time, 10% expected log time, 20% lower bound log time.)
 *
 * @author Tim.
 */
public interface Dictionary<E extends Comparable<E>> extends Iterable<E> {

    /**
     * Checks to see whether the Dictionary is empty
     *
     * @return true if and only if the Dictionary is Empty
     */
    boolean isEmpty();

    /**
     * Checks to see if an element is contained in the Dictionary
     *
     * @param item the item to be checked.
     * @return true if and only if the Dictionary contains something equal to
     * item.
     */
    boolean contains(E item);

    /**
     * Checks to see if an element has a predecessor in the dictionary
     *
     * @param item the item to be checked
     * @return true if and only if there is an element strictly less than
     * item in the Dictionary
     */
    boolean hasPredecessor(E item);

    /**
     * Checks to see if an element has a successor in the dictionary
     *
     * @param item the item to be checked
     * @return true if and only if there is an element strictly greater than
     * item in the Dictionary
     */
    boolean hasSuccessor(E item);

    /**
     * Find the greatest element less than the specified element
     *
     * @param item the item to be checked
     * @return the element strictly less than item in the Dictionary
     * @throws NoSuchElementException if there is no lesser element.
     */
    E predecessor(E item) throws NoSuchElementException;

    /**
     * Find the least element greater than the specified element
     *
     * @param item the item to be checked
     * @return the element strictly greater than item in the Dictionary
     * @throws NoSuchElementException if there is no greater element.
     */
    E successor(E item) throws NoSuchElementException;

    /**
     * Return the least item in the Dictionary
     *
     * @return the least element in the Dictionary
     * @throws NoSuchElementException if the Dictionary is empty.
     */
    E min() throws NoSuchElementException;

    /**
     * Return the greatest element in the dictionary
     *
     * @return the greatest element in the Dictionary
     * @throws NoSuchElementException if the Dictionary is empty.
     */
    E max() throws NoSuchElementException;

    /**
     * Adds a new element to the Dictionary
     * If there is an equal element already in the table, or the item is null
     * it returns false.
     *
     * @param item the item to be added.
     * @return true if the item is not null, and not already in the dictionary.
     */
    boolean add(E item);

    /**
     * Deletes the specified element from the Dictionary if it is present.
     *
     * @param item the element to be removed
     * @return true if the element was in the Dictionary and has now been
     * removed. False otherwise.
     */
    boolean delete(E item);

    /**
     * Provides a fail fast iterator for the Dictionary, starting at the
     * least element
     * The iterator should implement all methods of the iterator class
     * including remove
     *
     * @return an iterator whose next element is the least element in the
     * dictionary, and which will iterate through all the elements in the
     * Dictionary in ascending order.
     */
    Iterator<E> iterator();

    /**
     * Provides a fail fast iterator for the Dictionary, starting at the
     * least element greater than or equal to start
     * The iterator should implement all methods of the iterator class
     * including remove
     *
     * @param start the element at which to start iterating at.
     * @return an iterator whose next element is the least element greater
     * than or equal to start in the dictionary, and which will iterate
     * through all the elements in the Dictionary in ascending order.
     */
    Iterator<E> iterator(E start);

    /**
     * Provides a string describing all operations performed on the table
     * since its construction, or since the last time getLogString was called
     * As each operation returns (either called directly on the Dictionary,
     * or on an iterator generated by the dictionary) append a new line to
     * the String:"Operation <name of op>(<parameter values>) completed using
     * [n] comparisons".
     *
     * @return A sting listing all operations called on the Dictionary, and
     * how many comparisons were required to complete each operation.
     */
    String getLogString();

    /**
     * Provides a String representation of the Dictionary
     *
     * @return a String representation of the Dictionary
     */
    String toString();

}