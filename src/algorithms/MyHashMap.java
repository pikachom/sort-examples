package algorithms;

import java.util.LinkedList;

public class MyHashMap {
    class MyNode{
        String key;
        String value;
        MyNode(String key, String value){
            this.key = key;
            this.value = value;
        }

        String getValue() {
            return value;
        }
        void changeValue(String value){
            this.value = value;
        }
    }
    LinkedList<MyNode>[] data;
    MyHashMap(int size){
        this.data = new LinkedList[size];
    }
    private int getHashCode(String key){
        int code = 0;
        for(char c : key.toCharArray()){
            code += c;
        }
        return code;
    }
    private int convertHashToIndex(int code){
        return code % data.length;
    }
    private MyNode searchKey(LinkedList<MyNode> list, String targetKey){
        for(MyNode node : list){
            if(node.key.equals(targetKey)){
                return node;
            }
        }
        return null;
    }
    void put(String key, String value){
        int hashCode = getHashCode(key);
        int index = convertHashToIndex(hashCode);
        if(data[index] == null){
            LinkedList<MyNode> newList = new LinkedList<>();
            data[index] = newList;
        }
        MyNode node = searchKey(data[index], key);
        if(node == null){
            data[index].addLast(new MyNode(key, value));
        }else{
            node.changeValue(value);
        }
    }
    String get(String key){
        int hashCode = getHashCode(key);
        int index = convertHashToIndex(hashCode);
        if(data[index] == null){
            return "NOT FOUND";
        }else{
            MyNode node = searchKey(data[index], key);
            return node == null ? "NOT FOUND" : node.getValue();
        }
    }
}
class test{
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap(17);
        map.put("사과", "과일");
        map.put("포도", "과일");
        map.put("당근", "채소");
//        System.out.println(map.getHashCode("사과"));
        System.out.println(map.get("사과"));
    }
}
