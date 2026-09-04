class MyHashMap {
    List<Pair> list = null;

    public MyHashMap() {
        list = new ArrayList<>();
    }

    public void put(int key, int value) {
        for (Pair p : list) {
            if (p.key == key) {
                p.val = value;
                return;
            }
        }

        list.add(new Pair(key, value));
    }

    public int get(int key) {
        for (Pair p : list) {
            if (p.key == key)
                return p.val;
        }

        return -1;
    }

    public void remove(int key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).key == key) {
                list.remove(i);
                return;
            }
        }
    }



    class Pair {
        int key, val;

        Pair(int k, int v) {
            key = k;
            val = v;
        }
    }

}

    /**
     * Your MyHashMap object will be instantiated and called as such:
     * MyHashMap obj = new MyHashMap();
     * obj.put(key,value);
     * int param_2 = obj.get(key);
     * obj.remove(key);
     */