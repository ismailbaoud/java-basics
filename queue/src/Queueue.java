public class Queueue {
    public int capacity = 5;
    public int arr[] = new int[capacity];
    public int front = -1;
    public int rear = -1;
    public boolean isEmptey() {
        if(front == -1 && rear == -1 ){
            return true;
        }else {
            return false;
        }
    }

    public boolean isFull() {
        if(rear == capacity -1) {
            return true;
        }else {
            return false;
        }
    }

    public void enqueue(int val) {
        if(isFull()) return ;
        else if(isEmptey()) {
            front = rear = 0;
        }
        else {
            rear++;
        }
        arr[rear] = val;
    }

    public void dequeue() {
        if(isEmptey()) return;
        else if (front == rear) {
            front = rear = -1;
        }
        else front++;
    }

    public int front_val() {
        if(isEmptey()) return  -1;
        else return arr[front];
    }

    public void displayQueue() {
        for (int item : arr) {
            System.out.println(item);
        }
    }
}
