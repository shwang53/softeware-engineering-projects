package Entities;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public abstract class Queue<T> {

    BlockingQueue<T> queue;

    public Queue(int size)
    {

        queue = new ArrayBlockingQueue<T>(size);
    }

    public boolean put(T item){
        boolean value = false;
        try {
            queue.put(item);
            value =  true;
        }catch (InterruptedException e) {
            value = false;
        }
        return value;
    }

    public T take(){
        T value = null;
        try {
            value =  queue.take();
        }catch (InterruptedException e){
            value =  null;
        }
        return value;
    }

}
