package day50_collections_part_2;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;

public class J02_Queue {
    public static void main(String[] args) {

        Queue<String> queue=new PriorityQueue<>();

        System.out.println("queue.add(\"Ali\") = " + queue.add("Ali"));
        System.out.println("queue.offer(\"Fatih\") = " + queue.offer("Fatih"));
        //System.out.println("queue.add(null) = " + queue.add(null)); //NullPointerException hatası verir yani null değeri alamaz queue

        System.out.println("queue = " + queue);
        System.out.println("Kuyruktan çıkan kişi: " + queue.poll()); //çıkan kişiyi yazar
        System.out.println("queue = " + queue);

        System.out.println(queue.remove()+" kuyruktan çıkarıldı");
        System.out.println("queue = " + queue);

        //System.out.println("queue.remove() = " + queue.remove()); //NoSuchElementException hatası eğer kuyrukta eleman kalmazsa
        System.out.println("queue.remove() = " + queue.poll()); //null değerini döndürür eğer kuyrukta eleman kalmazsa

        queue.add("Veli");
        queue.add("Adem");
        queue.add("Berat");
        queue.add("Can");
        queue.add("Lale");

        System.out.println("queue = " + queue);
        //özel bir sıralama yapar comparator ile yapar bunu o yüzden sıra farklı olabilir.

        System.out.println("queue.peek() = " + queue.peek());



    }
}
