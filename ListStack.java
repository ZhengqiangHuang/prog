import java.util.Iterator;
import java.util.LinkedList;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ListStack <E> implements Stack<E>, Iterable<E>{
    LinkedList<E> elements = new LinkedList<>();
    @Override
    public void push(E element) {
        elements.addFirst(element);
    }

    @Override
    public E pop() {
        return elements.removeFirst();
    }

    @Override
    public E top() {
        return elements.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public int size() {
        return elements.size();
    }


    @Override
    public Iterator<E> iterator() {
        return elements.iterator();
    }
}
