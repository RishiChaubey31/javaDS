import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;

public class practisce {
    public static void arrailist() {
        ArrayList<String> teacherName = new ArrayList<>();
        ArrayList<String> studentName = new ArrayList<>();
        teacherName.add("t1");
        teacherName.add("t2");
        teacherName.add("t3");
        studentName.add("Rakesh");
        studentName.add("billu");
        studentName.add(1, "chillu");
        studentName.add("kamla");
        studentName.add("vimla");
        studentName.add("shimla");
        studentName.addAll(teacherName);
        System.out.println(studentName);
        System.out.println(studentName.remove(5));
        System.out.println(studentName.remove(String.valueOf("chillu")));
        studentName.set(2, "gamla");
        System.out.println(studentName);
        System.out.println(studentName.contains("t2"));
        System.out.println(Collections.min(studentName));
        System.out.println(Collections.max(studentName));
        System.out.println(Collections.frequency(studentName, "billu"));
        // studentName.clear();

    }

    public static void Stacks() {
        Stack<String> animal = new Stack<>();
        animal.push("tiger");
        animal.push("lion");
        animal.push("zebra");
        animal.push("rishi");
        animal.push("palak");
        animal.push("chiku");
        System.out.println(animal);
        System.out.println(animal.pop());
        System.out.println(animal.peek());

    }

    public static void Linkedlists() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("webdev");
        queue.offer("dsa");
        queue.offer("gate");
        queue.offer("gym");
        queue.offer("college");
        queue.offer("relax");
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue);
    }

    public static void LearnPriorityQueue() {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.offer("dsa");
        pq.offer("webdev");
        pq.offer("gate");
        pq.offer("gym");
        pq.offer("college");
        pq.offer("relax");
        pq.poll();
        System.out.println(pq);
    }

    public static void LearnArrayDeque() {
        ArrayDeque<String> adq = new ArrayDeque<>();
        adq.offer("bablue");
        adq.offerFirst("chintu");
        adq.offerLast("maNISGH");
        adq.pollFirst();
        adq.pollLast();
        adq.poll();
        adq.peek();
        adq.peekFirst();
        adq.peekLast();

    }

    public static void LearnSet() {
        Set<Integer> set = new HashSet<>();
        set.add(45);
        set.add(56);
        set.add(69);
        set.add(21);
        set.add(455);
        set.remove(69);
        set.size();
        set.clear();
        System.out.println(set.contains(455));
        System.out.println(set);
    }

    public static void LearnHashset() {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(45);
        set.add(56);
        set.add(69);
        set.add(21);
        set.add(455);
        set.remove(69);
        set.size();
        set.clear();
        System.out.println(set.contains(455));
        System.out.println(set);
    }

    public static void Learntreeset() {
        Set<Integer> set = new TreeSet<>();
        set.add(45);
        set.add(56);
        set.add(69);
        set.add(21);
        set.add(455);
        set.remove(69);
        set.size();
        // set.clear();
        System.out.println(set.contains(455));
        System.out.println(set);
    }

    public static void LearnMAp() {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("one", 2);
        mp.put("sixty-nine", 69);
        System.out.println(mp);

    }

    public static void Learnarray() {
        int[] arr = { 1, 12, 13, 45, 85, 95, 115, 125, 469 };
        System.out.println(Arrays.binarySearch(arr, 125));
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        Learnarray();
    }
}