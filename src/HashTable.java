//public class Main {
//    public static void main(String[] args) {
//
//        // System.out.println("Hello world!");
//        int b = 0;
//        for (int n = 0; n < 100; n++){
//            b = n + 5;
//            System.out.println(b);
//        }
//    }
//
//}

public class HashTable<K, V>{
    private class Entity{
        private K key;
        private V value;
    }

    public class Basket{
        private Node head;

        private class Node{
            private Node next;
            private Entity value;
        }
    }
}

