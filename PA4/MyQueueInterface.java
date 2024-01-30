public interface MyQueueInterface<T>  {

    public int size();

    public boolean isEmpty();

    public void enqueue(T data);

    public T dequeue();

    public T peek();

}
