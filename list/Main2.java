package list;

import list.interfaces.GbList;
import list.interfaces.impl.GbArrayList;

public class Main2 {
    public static void main(String[] args) {
        GbList <Integer> gbList = new GbArrayList<>();
        gbList.add(10);
        gbList.add(5);
        gbList.add(4);
        System.out.println(gbList);
        System.out.println(gbList.get(1));
        gbList.remove(1);
        System.out.println(gbList);
    }
}
