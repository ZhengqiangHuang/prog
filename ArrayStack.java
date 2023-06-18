public class ArrayStack<E> implements Stack<E>{
    public Object[] elements;
    int capacity;
    int size;

    public ArrayStack() {
        this.capacity = 1;
        elements = new Object[1];
        size = 0;
    }
    @Override
    public void push(Object element) {
        if(size==capacity){
            capacity=capacity*2;
            Object[] newElements=new Object[capacity];
            System.arraycopy(elements,0,newElements,0,size);
            elements=newElements;
            elements[size]=element;
            size++;
        }else{
            elements[size]=element;
            size++;
        }

    }

    @Override
    @SuppressWarnings("unchecked")
    public E pop() {
        if(size == 0) {
            return null;
        }else{
            int position = size - 1;
            Object obj = elements[position];
            elements[size-1] = null;
            size--;
            if(size <= capacity*0.4) {
                capacity /= 2;
                Object[] newElements = new Object[capacity];
                System.arraycopy(elements, 0, newElements, 0, size);
                elements = newElements;
            }
            return (E) obj;
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public E top() {
        if(size == 0) {
            return null;
        }else{
            int position = size - 1;
            return (E) elements[position];
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }


}
