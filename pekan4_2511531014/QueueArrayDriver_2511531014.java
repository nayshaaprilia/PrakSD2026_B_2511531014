package pekan4_2511531014;

public class QueueArrayDriver_2511531014 {
	public static void main(String[] args) {
		QueueArray_2511531014 queue = new QueueArray_2511531014(1000);
		queue.enqueue_2511531014(10);
		queue.enqueue_2511531014(20);
		queue.enqueue_2511531014(30);
		queue.enqueue_2511531014(40);
		System.out.println("item di depan " + queue.front_2511531014());
		System.out.println("item paling belakang " + queue.rear_2511531014());
		System.out.println("tampilkan queue");
		queue.display_2511531014();
		System.out.println();
		System.out.println(queue.dequeue_2511531014() + "dihapus dari queue");
		System.out.println("item di depan " + queue.front_2511531014());
		System.out.println("item paling belakang " + queue.rear_2511531014());
		System.out.println("tampilkan queue setelah satu data dihapus");
		queue.display_2511531014(); 
		
	}

}
