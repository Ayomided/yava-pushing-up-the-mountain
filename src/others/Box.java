package others;

public class Box<T> {
    private T t;
    public void set(T t){ this.t = t; }
    public T get(){ return t; }

    public static <T extends String> int count(T[] anArray, T elem) {
        int cnt = 0;
        for (T e : anArray)
            if (e.equals(elem))
                ++cnt;
        return cnt;
    }

    public static void main(String[] args) {
        Box<Integer> IntegerBox = new Box<Integer>();
        Integer[] nums = {1,2,4,5,7,9,1,1,2,1};
        String[] strings = {"ab"};
        System.out.println(countGreaterThan(nums, 0));
        System.out.println(count(strings, "ab"));
//        IntegerBox.set(1);
//        System.out.println(IntegerBox.get());
//
//        others.Box<String> StringBox = new others.Box<>();
//        StringBox.set("String box");
//        System.out.println(StringBox.get());
    }

    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }
}
