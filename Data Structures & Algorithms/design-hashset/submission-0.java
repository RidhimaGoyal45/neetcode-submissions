class MyHashSet {
    public static HashSet<Integer> map;
    public MyHashSet() {
        map = new HashSet<>();
    }
    
    public void add(int key) {
        map.add(key);
    }
    
    public void remove(int key) {
        map.remove(key);
    }
    
    public boolean contains(int key) {
        return map.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */