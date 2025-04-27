package Tp8;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task10 {
    public static <T> Map<T,Integer> freq(List<T>list){
Map <T,Integer> freqency=new HashMap<>();
for (T ele:list){
    freqency.put(ele,freqency.getOrDefault(ele,0 )+1);
}
return freqency;
    }
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 1, 4, 2);
        Map<Integer, Integer> numberFrequency = freq(numbers);
        System.out.println("Number Frequency: " + numberFrequency);
    }
}
