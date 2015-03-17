package Extra;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringPermutations 
{
	public static void main(String[] args)
	{
		Map<Integer, String[]> list = new HashMap<Integer, String[]>();
		list.put(Integer.valueOf(0), new String[]{"quick", "slow"});
		list.put(Integer.valueOf(1), new String[]{"brown", "red"});
		list.put(Integer.valueOf(2), new String[]{"fox", "dog"});
	
		List<String> output = new ArrayList<String>();
		output = calculatePermutations(list,0);
		for(String str : output)
		{
			System.out.println(str);
		}
	}
	
	public static List<String> calculatePermutations(Map<Integer, String[]> list, int index)
	{
		String[] values = list.get(index);
		List<String> output = new ArrayList<String>();
		
		for(String str : values)
		{
			if(index == list.size()-1)
			{
				output.add(str);	
			}
			else
			{
				List<String> result = calculatePermutations(list,index+1);
				for(String s : result)
				{	
					output.add(str + " " + s);
				}
			}	
		}
		return output;	
	}
}
