package ArrayListLessons;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

//        ArrayList<Integer> arrayList = new ArrayList<>(); List - интерфейс, ArrayList - класс в List
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            arrayList.add(i);
        }
        for (int x: arrayList) {
            System.out.println(x);
        }

        System.out.println(arrayList); //метод toString определен уже в ArrayList
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.size());

        arrayList.remove(5);
        System.out.println(arrayList);
        System.out.println(arrayList.get(5));

        //Много удалений
        arrayList = new LinkedList<Integer>();
    }
}
