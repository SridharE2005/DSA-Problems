import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for (String s : strs) {
            char[] str = s.toCharArray();
            Arrays.sort(str);
            String sorted = new String(str);

            res.putIfAbsent(sorted, new ArrayList<>());
            res.get(sorted).add(s);
        }

        return new ArrayList<>(res.values());
    }

    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();
        String[] input = {"act", "pots", "tops", "cat", "stop", "hat"};
        List<List<String>> output = ga.groupAnagrams(input);

        for (List<String> group : output) {
            System.out.println(group);
        }
    }
}
