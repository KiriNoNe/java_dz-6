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
    public boolean remove(T item){
        boolean result = list.contains(item);
        list.remove(item);
        return result;
    }
    public boolean exists(T item){
        return list.contains(item);
    }
    public T getFirst(){
        if (list.isEmpty()){
            return null;
        }
        return list.getFirst();
    }
    public T getLast(){
        if (list.isEmpty()){
            return null;
        }
        return list.getLast();
    }
    public T getItemByIndex(int i){
        if (list.size() > i){
            return list.get(i);
        }
        else{
            return null;
        }
    }


}