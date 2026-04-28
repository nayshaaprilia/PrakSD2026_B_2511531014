package pekan4_2511531014;

public class QueueArray_2511531014 {
	int front, rear, size;
	int capacity;
	int array[];
	
	public QueueArray_2511531014(int capacity) {
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity - 1;
		array = new int [this.capacity];
	}
	
	boolean isFull_2511531014 (QueueArray_2511531014 queue) {
		return (queue.size == queue.capacity);
	}
	
	boolean isEmpty_2511531014 (QueueArray_2511531014 queue) {
		return (queue.size == 0);
	}
	
	void enqueue_2511531014(int item) {
		if (isFull_2511531014(this))
			return;
		this.rear = (this.rear + 1) %this.capacity;
		this.array[this.rear] = item;
		this.size = this.size + 1;
		System.out.println(item + " enqueued to queue");
	}
	
	int dequeue_2511531014() {
		if (isEmpty_2511531014(this))
			return Integer.MIN_VALUE;
		int item = this.array[this.front];
		this.front = (this.front + 1) % this.capacity;
		this.size = this.size - 1;
		return item;
	}
	
	int front_2511531014() {
		if (isEmpty_2511531014(this))
			return Integer.MIN_VALUE;
		
		return this.array[this.front];
	}
	
	int rear_2511531014() {
		if (isEmpty_2511531014(this))
			return Integer.MIN_VALUE;
		return this.array[this.rear];
	}
	
	//mencetak elemen antrian
	void display_2511531014() {
		int i;
		if (front == rear) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		//kunjungi dari blkg lalu cetak
		for (i = front; i < rear; i++)  {
			System.out.printf(" %d <--", array[i]);
		}
		return;
	}

}
