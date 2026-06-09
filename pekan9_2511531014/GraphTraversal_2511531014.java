package pekan9_2511531014;

	import java.util.*;
	public class GraphTraversal_2511531014 {
	    private Map<String, List<String>> graph_1014 = new HashMap<>();

	    // Menambahkan edge (graf tak berarah)
	    public void addEdge_1014(String node1_1014, String node2_1014) {
	        graph_1014.putIfAbsent(node1_1014, new ArrayList<>());
	        graph_1014.putIfAbsent(node2_1014, new ArrayList<>());
	        graph_1014.get(node1_1014).add(node2_1014);
	        graph_1014.get(node2_1014).add(node1_1014);
	    }
	    // Menampilkan graf awal
	    public void printGraph_1014() {
	        System.out.println("Graf Awal (Adjacency List):");
	        for (String node_1014 : graph_1014.keySet()) {
	            System.out.print(node_1014 + " -> ");
	            List<String> neighbors_1014 = graph_1014.get(node_1014);
	            System.out.println(String.join(", ", neighbors_1014));
	        }
	        System.out.println();
	    }
	    // DFS Rekursif
	    public void dfs_1014(String start_1014) {
	        Set<String> visited_1014 = new HashSet<>();
	        System.out.println("Penelusuran DFS:");
	        dfsHelper_1014(start_1014, visited_1014);
	        System.out.println();
	    }
	    private void dfsHelper_1014(String current_1014, Set<String> visited_1014) {
	        if (visited_1014.contains(current_1014)) return;
	        visited_1014.add(current_1014);
	        System.out.print(current_1014 + " ");
	        for (String neighbor_1014 : graph_1014.getOrDefault(current_1014, new ArrayList<>())) {
	        	dfsHelper_1014(neighbor_1014, visited_1014);
	        }
	    }

	    // BFS Iteratif
	    public void bfs_1014(String start_1014) {
	        Set<String> visited_1014 = new HashSet<>();
	        Queue<String> queue_1014 = new LinkedList<>();
	        queue_1014.add(start_1014);
	        visited_1014.add(start_1014);
	        System.out.println("Penelusuran BFS:");
	        while (!queue_1014.isEmpty()) {
	            String current_1014 = queue_1014.poll();
	            System.out.print(current_1014 + " ");
	            for (String neighbor_1014 :graph_1014.getOrDefault(current_1014, new ArrayList<>())) {
	            	if (!visited_1014.contains(neighbor_1014)) {
	            		queue_1014.add(neighbor_1014);
	                    visited_1014.add(neighbor_1014);
	                }
	            }
	        }

	        System.out.println();
	    }
	    // Main
	    public static void main(String[] args) {
	        GraphTraversal_2511531014 graph_1014 = new GraphTraversal_2511531014();

	        // Contoh graf : A-B, A-C, B-D, B-E
	        graph_1014.addEdge_1014("A", "B");
	        graph_1014.addEdge_1014("A", "C");
	        graph_1014.addEdge_1014("B", "D");
	        graph_1014.addEdge_1014("B", "E");
	        // Cetak graf awal
	        System.out.println("Graf Awal adalah:");
	        graph_1014.printGraph_1014();
	        // Lakukan penelusuran
	        graph_1014.dfs_1014("A");
	        graph_1014.bfs_1014("A");
	    }
	}

