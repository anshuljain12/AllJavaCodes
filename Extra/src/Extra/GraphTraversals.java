package Extra;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphTraversals 
{
	public static void main(String args[])
	{
		int[][] adj = new int[5][5];
		adj[0][1]=adj[1][0]=1;
		adj[0][2]=adj[2][0]=1;
		adj[2][4]=adj[4][2]=1;
		adj[3][1]=adj[1][3]=1;
		adj[4][1]=adj[1][4]=1;
		
		dfs(adj);
		bfs(adj);
	}
	
	public static void dfs(int matrix[][])
	{
		boolean visited[] = new boolean[5];
		Stack<Integer> s = new Stack<Integer>();
		int start=0;
		s.push(start);
		visited[start]=true;
		
		while(!s.empty())
		{
			int ele = (Integer)s.pop();
			System.out.println(ele);
			for(int i=0;i<5;i++)
			{
				if(matrix[ele][i]==1 && visited[i]==false)
				{
					s.push(i);
					visited[i]=true;
				}
			}
		}
	}
	
	public static void bfs(int matrix[][])
	{
		Queue<Integer> q = new LinkedList<Integer>();
		boolean visited[] = new boolean[5];
		
		int start=0;
		q.add(start);
		visited[start]=true;
		
		while(!q.isEmpty())
		{
			int ele = (Integer)q.remove();
			System.out.println(ele);
			for(int i=0;i<5;i++)
			{
				if(matrix[ele][i]==1 && visited[i]==false)
				{
					q.add(i);
					visited[i]=true;
				}
			}
		}
	}
}
