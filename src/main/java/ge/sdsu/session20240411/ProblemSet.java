package ge.sdsu.session20240411;

import java.util.*;

public class ProblemSet {

    /*
    Problem 1:
    if the key "a" has a value, set the key "b" to have that same value.
    In all cases remove the key "c", leaving the rest of the map unchanged.

    solution({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
    solution({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
    solution({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}

    Problem 2:
    Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys.
    If both keys are present, append their 2 string values together and store the result under the key "ab".

    mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
    mapAB({"a": "Hi"}) → {"a": "Hi"}
    mapAB({"b": "There"}) → {"b": "There"}

    Problem 3:
    if the keys "a" and "b" are both in the map and have equal values, remove them both.

    mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
    mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
    mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}

    Problem 4:
    Write a Java program to determine the number of unique elements in an integer array.
    (write to versions, one using map and another one with set)
     */

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(5);
        System.out.println(set);
//        map.put(null, 15);
//        map.put(1, null);
        map.put(1, 5);
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.get(5));

//        solution({"a": "aaa", "c": "meh", "d": "hi"})

        Map<String, String> input = new HashMap<>();
        input.put("a", "aaa");
        input.put("c", "meh");
        input.put("d", "hi");
        Map<String, String> output = solution(input);
        System.out.println(output); // {"a"="aaa", "b"="aaa", "d"="hi"}

        Map<String, String> input1 = new HashMap<>();
        input1.put("a", "Hi");
        input1.put("b", "There");
        Map<String, String> result1 = mapAB(input1);
        System.out.println(result1); //{"a": "Hi", "ab": "HiThere", "b": "There"}

        Map<String, String> input2 = new HashMap<>();
        input2.put("a", "aaa");
        input2.put("b", "aaa");
        input2.put("c", "cake");
        Map<String, String> map1 = mapAB2(input2);
        System.out.println(map1); // {"c": "cake"}

        List<Integer> nums = List.of(1, 1, 1, 1, 2, 3, 3, 4, 4, 4, 5);
        int result = uniqueIntegerCount(nums);
        System.out.println(result); //5

        String inputStr = "Helloworld";
        System.out.println(uniqueIntegerCount(inputStr)); // 7
    }

    public static Map<String, String> solution(Map<String, String> map) {
        if (map.containsKey("c")) {
            map.remove("c");
        }
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        return map;
    }

    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String ab = map.get("a") + map.get("b");
            map.put("ab", ab);
        }
        return map;
    }

    public static Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }

    public static int uniqueIntegerCount(List<Integer> nums) {
        Set<Integer> set = new HashSet<>();
        for (Integer num : nums) {
            set.add(num);
        }
        return set.size();
    }

    public static int uniqueIntegerCount(String input) {
        char[] charArray = input.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (char c: charArray){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int unique = 0;
        for (int count : map.values()){
            if (count == 1 || count > 1){
                unique++;
            }
        }
        return unique;
    }
}
