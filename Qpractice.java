
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Qpractice{
    public static void main(String[] args){
        //priortity queue
       PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
       pq.add(8);
       pq.offer(2);
       pq.offer(5);
       pq.add(7);
       pq.add(1);


       //System.out.println(pq);
       //System.out.println(pq.peek());//head of value is printing
       //System.out.println(pq.poll()); //removal value

       //while(!pq.isEmpty())
           // System.out.println(pq.poll());

       // addition-offere,add
       // retrievel-peek
       // removal-poll,remove
       //clear- clear all elememnts

       ArrayDeque<String> ad = new ArrayDeque<>();
       ad.add("banana");
       ad.addFirst("cherry");
       ad.addLast("apple");
       ad.offerFirst("kiwi");
       ad.offer("pear");
       ad.offerLast("mango");

       System.out.println(ad);
       System.out.println(ad.peek());
       System.out.println(ad.peekFirst());
       System.out.println(ad.peekLast());

       System.out.println(ad.poll());
       System.out.println(ad.pollFirst());
       System.out.println(ad.pollLast());

       System.out.println(ad.size());//size




       




//addition -offfer,offerfirst,offerlast,add ,addfirst,addlast,addall
//retruival-peek,peekfirst,peeklast.
//removal-poll-remove, remove first,removelast

    }
}
       
   