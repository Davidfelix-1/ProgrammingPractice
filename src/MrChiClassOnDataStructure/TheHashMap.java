package MrChiClassOnDataStructure;
import  java.util.HashMap;
public class TheHashMap<K, V> {

    private HashMap<K,V> map;
    public TheHashMap(){
        this.map = new HashMap<>();
    }
    public void put(K key, V value){
        map.put(key,value);
    }

    public int size() {
        return map.size();
    }

    public boolean containsKey(K key) {
        return map.containsKey(key);
    }

    public V get(K key) {
        return map.get(key);
    }

    public void remove(K key) {
        map.remove(key);
    }
}

