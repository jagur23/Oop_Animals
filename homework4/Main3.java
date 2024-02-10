package homework4;

import java.util.Iterator;

public class Main3 {
    public static void main(String[] args) {

        MyLinkedList<String> stringsList = new MyLinkedList<>();
        /* stringsList.addFirst("5");
        stringsList.addFirst("21");
        stringsList.addFirst("555");
        stringsList.addFirst("1000"); */

        /* for (String str : stringsList) {
            System.out.println(str);
        }

        Iterator iter = stringsList.descendingIterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        } */

        

        stringsList.addLast("99");
        stringsList.addLast("899999");
        stringsList.addLast("111");
        stringsList.addLast("1");
        stringsList.addLast("22");
        //System.out.println(stringsList);

        /* for (int i = 0; i < stringsList.size(); i++) {
            System.out.println(stringsList.getElement(i));
        } */

        System.out.println("Size = : " + stringsList.size());
        System.out.println(stringsList.getElement(0));
    }
}
