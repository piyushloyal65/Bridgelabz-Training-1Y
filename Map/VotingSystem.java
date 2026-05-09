import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {
        String[] votes = {"A", "B", "A", "C", "A", "B"};

        Map<String, Integer> count = new HashMap<>();

        for(String vote : votes) {
            count.put(vote, count.getOrDefault(vote, 0) + 1);
        }

        System.out.println(count);
    }
}