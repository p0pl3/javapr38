package pr3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class MyMap<K, V> implements Map<K, V> {
    private HashMap<K, V> map;
    private static final Semaphore semaphore = new Semaphore(1);

    public MyMap() {
        this.map = new HashMap<>();
    }

    @Override
    public int size() {
        try {
            semaphore.acquire();
            int a = map.size();
            semaphore.release();
            return a;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public boolean isEmpty() {
        try {
            semaphore.acquire();
            boolean a = map.isEmpty();
            semaphore.release();
            return a;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return true;
        }
    }

    @Override
    public boolean containsKey(Object key) {
        try {
            semaphore.acquire();
            boolean a = map.containsKey(key);
            semaphore.release();
            return a;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean containsValue(Object value) {
        try {
            semaphore.acquire();
            boolean a = map.containsValue(value);
            semaphore.release();
            return a;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public V get(Object key) {
        try {
            semaphore.acquire();
            V a = map.get(key);
            for (int i = 10; i < 20; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            semaphore.release();
            return a;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public V put(K key, V value) {
        try {
            semaphore.acquire();
            V a = map.put(key, value);
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            semaphore.release();
            return a;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public V remove(Object key) {
        try {
            semaphore.acquire();
            V a = map.remove(key);
            semaphore.release();
            return a;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        try {
            semaphore.acquire();
            map.putAll(m);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void clear() {
        try {
            semaphore.acquire();
            map.clear();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Set<K> keySet() {
        try {
            semaphore.acquire();
            var a = map.keySet();
            semaphore.release();
            return a;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Collection<V> values() {
        try {
            semaphore.acquire();
            var a = map.values();
            semaphore.release();
            return a;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        try {
            semaphore.acquire();
            var a = map.entrySet();
            semaphore.release();
            return a;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
