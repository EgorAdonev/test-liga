import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(generateListInRange(i));
        List<Integer> array = generateListInRange(i);
        System.out.println(mixList(array));
    }
    private static List<Integer> generateListInRange(int arg) {
        List<Integer> list = new ArrayList<>();
        int i;
        for (i = 1; i <= arg; i++) {
            list.add(i);
        }
        return list;
    }
    private static List<Object> mixList(List<Integer> inputList){
        Random rand = ThreadLocalRandom.current();
        Object out[] = inputList.toArray();
        for (int i = inputList.size()-1; i > 0; i--) {
            int idx = rand.nextInt(i+1);
            out[idx] = inputList.get(i);
            Integer a = (Integer) out[idx];
            out[idx] = out[i];
            out[i] = a;
        }
        return List.of(out);
    }

}
