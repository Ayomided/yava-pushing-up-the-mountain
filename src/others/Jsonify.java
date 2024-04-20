package others;

import java.util.ArrayList;

public class Jsonify <K, V> implements JsonElement<K, V>{
    private K key;
    private V value;
    private static ArrayList<Jsonify> JSONList = new ArrayList<>();

    public Jsonify(K key, V value){
        this.key = key;
        this.value = value;
        JSONList.add(this);
    }
    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    public static int ListCount(){
        return JSONList.size();
    }

    public static void main(String[] args) {
        Jsonify<String, Integer> jsonString = new Jsonify<>("id", 1);
        Jsonify<String, String> jsonString2 = new Jsonify<>("name", "name");
        String str = "";
        for(int i = 0; i < ListCount(); i++){
            if(ListCount() > 1){
                str = "{" +
                        "\n\t\t" + jsonString.getKey() + ": " + jsonString.getValue() + "," +
                        "\n}";
            } else {
                str = "{" +
                        "\n\t\t" + jsonString.getKey() + ": " + jsonString.getValue() +
                        "\n}";
            }
        }
        System.out.println(str);
    }
}
