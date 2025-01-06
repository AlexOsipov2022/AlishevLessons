package Lambda;

public class Test1 {
    public static void main(String[] args) {

//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello!");
//            }
//        });
        Thread thread = new Thread(() -> System.out.println("Hello!")); //лямбда это мет од без названия
    }
}
