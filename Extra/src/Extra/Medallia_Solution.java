package Extra;
import java.util.*;

public class Medallia_Solution 
{
  	private static class Node 
	{
		private final Set<Node> neighbors;

		Node() 
		{
			this.neighbors = new HashSet<Node>();
		}
	}
	
	private static Map<Integer, Integer> calculateDegreeCount(Node node) 
    {
		Queue<Node> q = new LinkedList<Node>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		q.add(node);
		
		while(!q.isEmpty())
    	{
			int count=0,flag=1;
    		Node currnode = q.remove();
    		for(Node n : currnode.neighbors)
    		{
    			q.add(n);
    			count++;
    		}
    		    	
			Iterator it = map.entrySet().iterator();
		    while (it.hasNext()) 
		    {	    	
		        Map.Entry pairs = (Map.Entry)it.next();
		        if(pairs.getKey()==(Integer)count)
		        {
		        	map.put(Integer.valueOf(count), ((Integer)pairs.getValue())+Integer.valueOf(1));
		        	flag=0;
		        } 
		    }
		    if(flag==1)
		    	map.put(Integer.valueOf(count), Integer.valueOf(1));
    	}
		return map;
    }


	public static void main(String[] args) 
	{
		String line;
		Scanner stdin = new Scanner(System.in);
		Map<Integer, Node> graph = new HashMap<Integer, Node>();
		Node firstNode = null;

		while(stdin.hasNextLine() && !( line = stdin.nextLine() ).equals( "" ))
		{
			String[] tokens = line.split(" ");
			// Edge list can only be one or two nodes per line.
			if (tokens.length != 1 && tokens.length != 2) {
				throw new RuntimeException("Unknown format");
			}

			for (int i = 0; i < tokens.length; i++) {
				int id = Integer.parseInt(tokens[i]);
				if (!graph.containsKey(id)) {
					graph.put(id, new Node());
				}
			}

			Node node0 = graph.get(Integer.parseInt(tokens[0]));
			if (firstNode == null) {
				firstNode = node0;
			}

			if (tokens.length == 2) {
				Node node1 = graph.get(Integer.parseInt(tokens[1]));

				node0.neighbors.add(node1);
				node1.neighbors.add(node0);
			}

		}
		stdin.close();

		TreeMap treeMap = new TreeMap(calculateDegreeCount(firstNode));
		System.out.println(treeMap);
	}

}