import java.util.*;

public class hashmap1 {

    public static class Generic<K, V> {
        public class Node {
            K key;
            V value;
            Node next;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
                this.next = null;
            }
        }

        ArrayList<Node> list;
        private int size;
        public Generic(int size) {
            this.size = size;
            list = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                list.add(null);
            }
        }
        public Generic() {
            this(4);
        }
        private int getIndex(K key) {
            int idx = key.hashCode();
            return Math.abs(idx) % size;
        }
        public void put(K key, V value) {
            int idx = getIndex(key);
            Node temp = list.get(idx);
            while (temp != null) {
                if (temp.key.equals(key)) {
                    temp.value = value;
                    return;
                }
                temp = temp.next;
            }
            temp = list.get(idx);
            Node newNode = new Node(key, value);
            list.set(idx, newNode);
            newNode.next =temp;
        }

        public boolean  contains(K key){
            int idx = getIndex(key);
            Node temp = list.get(idx);

            while (temp != null) {
                if (temp.key.equals(key)) {
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
        public void display() {
            for (int i = 0; i < list.size(); i++) {
                Node head = list.get(i);
                while (head != null) {
                    System.out.print("Key: " + head.key + ", Value: " + head.value + " -> ");
                    head = head.next;
                }
            }
        }
    }

    public static void main(String[] args) {
        Generic<String, Integer> g = new Generic<>();
        g.put("one", 1);
        g.put("two", 2);
        g.put("three", 3);
        g.put("two", 22);
        g.display();
    }
}