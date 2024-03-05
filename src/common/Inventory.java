package common;

import java.util.ArrayList;
import java.util.List;

public class Inventory <T>{
    private List<T> inventory;

    public Inventory(){
        this.inventory=new ArrayList<>();
    }
    public void add(T t){
        inventory.add(t);
    }
    public T remove(int i){
        return inventory.remove(i);
    }
    public boolean contains(T t) {
        return inventory.contains(t);
    }
    public T get(int i) { return inventory.get(i);}
    public void clear(){inventory.clear();}

}
