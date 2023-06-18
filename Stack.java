/**
 * A generic interface where E represents the element type.
 * <p>
 * @param <E> Type of element stored in the stack
 */
public interface Stack<E> {

    /**
     *Adds an element to the stack.
     *<p>
     * @param element to be pushed onto the stack
     */
    void push(E element);

    /**
     * Remove the top element and return it.
     *<p>
     * @return the element at the top of the stack
     */
    E pop();

    /**
        * Return the top element without removing it.
        *<p>
        * @return the element at the top of the stack
        */
    E top();

    /**
     * Check if the stack is empty.
     * <p>
     * @return true if the stack is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Return the number of elements in the stack.
     * <p>
     * @return the number of elements in the stack
     */
    int size();
}