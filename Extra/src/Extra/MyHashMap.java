package Extra;
import java.util.LinkedList;

class KeyValuePair<K,V>
{
	K key;
	LinkedList<V> value;
	
	public KeyValuePair()
	{	
		this.value = new LinkedList<V>();
	}
	
	public KeyValuePair(K key, V value)
	{
		this.key = key;
		this.value.add(value);
	}
}

public class MyHashMap<K,V> 
{
	int size;
	int capacity;
	KeyValuePair<K,V>[] myMap;
	
	public MyHashMap(int capacity)
	{
		this.size = 0;
		for(int i=0; i<capacity; i++)
			this.myMap[i] = new KeyValuePair<K,V>();
	}
	
	public boolean containsKey(K key)
	{
		if(this.size==0)
			return false;
		else
		{
			for(int i=0; i<size; i++)
			{	
				if(this.myMap[i].key == key)
					return true;
			}		
		}
		return false;
	}
}
