class MyCircularQueue {
    public int[] data;
    public int head, tail, coount, capacity;
    
    public MyCircularQueue(int k) {
        capacity = k;
        data =new int[k];
        head=0;
        tail=0;
        count=0;
    }
    
    public boolean enQueue(int value) {
        if(isFull())return false;
        if(count>0){
            tail=(tsil+1)%capacity;
        }
        data[tail]=value;
        count++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        if (count>1){
            head = (head+1) % capacity;
        }
        count--;
        return true;
    }
    
    public int Front() {
        return isEmpty()?-1:data[head];
    }
    
    public int Rear() {
        return isEmpty()?-1:data[tail];
    }
    
    public boolean isEmpty() {
        return count==0;
    }
    
    public boolean isFull() {
        return count == capacity;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */