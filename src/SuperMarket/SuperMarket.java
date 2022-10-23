package SuperMarket;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class SuperMarket {

    List<String> names = List.of("Петров Андрей", "Петров Алексей", "Иванов Пётр", "Петров Михаил", "Петров Степан", "Иванов Роман", "Иванов Андрей", "Иванов Глеб", "Шевелев Никита", "Шевелев Пётр");

    public final int MAX_SIZE = 5;
    private final Random RANDOM = new Random();

     public void randomFilling (Queue<String> queue) {
         int size = RANDOM.nextInt(MAX_SIZE+1);
         for (int i = 0; i < size; i++) {
             queue.offer(names.get(RANDOM.nextInt(names.size())));
         }
     }

     public void add (String name, Queue<String> queue1, Queue<String> queue2) {
         if (queue1.size() < queue2.size() && queue1.size() < MAX_SIZE) {
             queue1.offer(name);
         } else if (queue2.size() < MAX_SIZE) {
             queue2.offer(name);
         } else if (queue1.size() == MAX_SIZE && queue2.size() == MAX_SIZE){
             System.out.println("Галя открой третью кассу!!!");
             Queue<String> queue3 =  new ArrayDeque<>(5);
             queue3.offer(name);
             System.out.println("Третья очередь " + queue3);
         }
     }

    public void remove(Queue<String> queue1, Queue<String> queue2) {
        if (RANDOM.nextBoolean()) {
            queue1.poll();
        } else {
            queue2.poll();
        }
    }
}
