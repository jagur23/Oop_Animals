package homework4;

import java.util.Iterator;

public class MyLinkedList <E> implements Linked <E>, Iterable<E>, DescendingIterator<E> {
    
    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;

    public MyLinkedList(){
        firstNode = new Node<E>(null, null, lastNode);
        lastNode = new Node<E>(firstNode, null, null);
    }
    

    @Override
    public void addLast(E element) {
        Node<E> prev = lastNode;
        prev.setCurrentElement(element);
        lastNode = new Node<E>(prev, null, null);
        prev.setNextElement(lastNode);
        size++;
    }


    @Override
    public void addFirst(E element) {
        Node<E> next = firstNode;
        next.setCurrentElement(element);
        firstNode = new Node<E>(null, null, next);
        next.setPrevElement(firstNode);
        size++;
    }


    @Override
    public int size() {
        return size;
    }


    @Override
    public E getElement(int index) {
        Node<E> target = firstNode.getNextElement();
        for (int i = 0; i < index; i++) {
            target = getNextElem(target);
        }
        return target.getCurrentElement();
    }


    private Node<E> getNextElem(Node<E> current){
        return current.getNextElement();
    }


    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public E next() {
                return getElement(counter++);
            }
        };
    }


    @Override
    public Iterator<E> descendingIterator() {
        return new Iterator<E>() {
            int counter = size - 1;

            @Override
            public boolean hasNext() {
                return counter >= 0;
            }

            @Override
            public E next() {
                return getElement(counter--);
            }
        };
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        int index = 0;
        while (index != size) {
            sb.append(getElement(index)).append(",");
            index++;
        }
        if (sb.length() == 1) return "{}";
            sb.deleteCharAt(sb.length() - 1).append("}");
            return sb.toString();
        }   
}


class Node<E> {
    E currentElement; 
    Node<E> nextElement;
    Node<E> prevElement;

    Node(Node<E> prevElement, E currentElement, Node<E> nextElement){
        this.currentElement = currentElement;
        this.prevElement = prevElement;
        this.nextElement = nextElement;
    }

    public E getCurrentElement(){
        return currentElement;
    }

    public void setCurrentElement(E currentElement){
        this.currentElement = currentElement;
    }

    public Node<E> getNextElement(){
        return nextElement;
    }

    public void setNextElement(Node<E> nextElement){
        this.nextElement = nextElement;
    }

    public Node<E> getPrevElement(){
        return prevElement;
    }

    public void setPrevElement(Node<E> prevElement){
        this.prevElement = prevElement;
    }
}
