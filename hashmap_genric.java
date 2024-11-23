import java.util.*;

public class hashmap_genric{

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

        ArrayList<Node> table;
        private int size;
        private int count;

        public Generic(int size) {
            this.size = size;
            table = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                table.add(null);
            }
            count = 0;
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
            Node temp = table.get(idx);
            while (temp != null) {
                if (temp.key.equals(key)) {
                    temp.value = value;
                    return;
                }
                temp = temp.next;
            }
            Node newNode = new Node(key, value);
            newNode.next = table.get(idx);
            table.set(idx, newNode);
            count++;
            double loadFactor = (double) count / size;
            double threshold = 0.75;
            if (loadFactor > threshold) {
                rehash();
            }
        }

        private void rehash() {
            ArrayList<Node> oldTable = table;
            int newSize = size * 2;
            table = new ArrayList<>(newSize);
            for (int i = 0; i < newSize; i++) {
                table.add(null);
            }

            size = newSize;
            count = 0;
            for (Node n : oldTable) {
                while (n != null) {
                    put(n.key, n.value);
                    n = n.next;
                }
            }
        }

        public boolean contains(K key) {
            int idx = getIndex(key);
            Node temp = table.get(idx);

            while (temp != null) {
                if (temp.key.equals(key)) {
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }

        public void remove(K key) {
            int idx = getIndex(key);
            Node head = table.get(idx);
            Node prev = null;
            while (head != null) {
                if (head.key.equals(key)) {
                    if (prev == null) {
                        table.set(idx, head.next);
                    } else {
                        prev.next = head.next;
                    }
                    count--;
                    return;
                }
                prev = head;
                head = head.next;
            }
            System.out.println("Key not found");
        }

        public void display() {
            for (int i = 0; i < table.size(); i++) {
                Node head = table.get(i);
                while (head != null) {
                    System.out.print("Key: " + head.key + ", Value: " + head.value + " -> ");
                    head = head.next;
                }
                if (table.get(i) != null) {
                    System.out.println();
                }
            }
        }

        public void clearAllEdges() {
            for (int i = 0; i < size; i++) {
                table.set(i, null);
            }
            count = 0;
            System.out.println("All edges cleared.");
        }
    }

    public static void main(String[] args) {
        Generic<String, Integer> g = new Generic<>();
        g.put("one", 1);
        g.put("three", 3);
        g.put("two", 22);
        g.put("four", 22);
        g.display();

        System.out.println("\nRemoving key 'four'");
        g.remove("four");
        g.display();

        System.out.println("\nClearing all edges");
        g.clearAllEdges();
        g.display();
    }
}
