import java.util.LinkedList;
public class Cache<T> {
    private int n;
    private LinkedList<T> list = new LinkedList<>();
    
    public Cache(int n){
        this.n = n;
    }
    public void add(T item){
        if ((list.size()+1) > n){
            list.removeFirst();
        } 
        list.addLast(item);
    }
    public bool remove(T item){
        bool result = list.contains(item);
        list.remove(item);
    }
}