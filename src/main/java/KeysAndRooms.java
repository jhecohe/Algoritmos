import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class KeysAndRooms {

    // https://leetcode.com/problems/keys-and-rooms/description/

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        Queue<Integer> keys = new LinkedList<>();

        visited[0] = true;
        keys.add(0);
        int visCount = 0;

        while (!keys.isEmpty()) {
            int cur = keys.poll();
            visCount++;

            for (int key : rooms.get(cur)) {
                if (!visited[key]) {
                    visited[key] = true;
                    keys.add(key);
                }
            }
        }

        return visCount == n;

    }

    public static void main(String[] args) {
        // List<List<Integer>> rooms = List.of(List.of(1),List.of(2),List.of(3),List.of()); // true
        List<List<Integer>> rooms = List.of(List.of(1,3),List.of(3,0,1),List.of(2),List.of(0)); //false
        // List<List<Integer>> rooms = List.of(List.of(2),List.of(),List.of(1)); // true
        boolean result = canVisitAllRooms(rooms);
        System.out.println(result);
    }

    // DFS
    // private boolean[] visited;
    // public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    //     int n = rooms.size();
    //     visited = new boolean[n];

    //     dfs(0, rooms);

    //     for (boolean v : visited) {
    //         if (!v) return false;
    //     }
    //     return true;
    // }

    // private void dfs(int room, List<List<Integer>> rooms) {
    //     if (visited[room]) return;
    //     visited[room] = true;

    //     for (int key : rooms.get(room)) {
    //         dfs(key, rooms);
    //     }
    // }

    // Example 1:

    // Input: rooms = [[1],[2],[3],[]]
    // Output: true
    // Explanation:
    // We visit room 0 and pick up key 1.
    // We then visit room 1 and pick up key 2.
    // We then visit room 2 and pick up key 3.
    // We then visit room 3.
    // Since we were able to visit every room, we return true.

    // Example 2:

    // Input: rooms = [[1,3],[3,0,1],[2],[0]]
    // Output: false
    // Explanation: We can not enter room number 2 since the only key that unlocks
    // it is in that room.


    // It does not work in all the cases
    // public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
    //     Set<Integer> keys = new HashSet<>();
    //     keys.add(0);
    //     for(int j=0; j< rooms.size(); j++){
    //         if(!keys.contains(j)){
    //             return false;
    //         }
    //         for(int i=0; i< rooms.get(j).size(); i++){
    //             keys.add(rooms.get(j).get(i));
    //         }
    //     }

    //     return true;
    // }
}
