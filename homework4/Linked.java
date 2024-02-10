package homework4;

public interface Linked <E> {
    
    void addLast(E element);
    void addFirst(E element);
    int size();
    E getElement(int index);
}
