package hash;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestHashMap {

	
	
	
	public static void main(String[] args) {
	
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for (int i = 0; i<10 ; i++)
		hm.put(i, i*2);
		
		hm.put(null, 10);
		hm.put(null, 20);
		
		hm.put(1, null);
		
		//hm.en
		
		//System.out.println(hm.values());
		Iterator it = hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		
		
		for (Map.Entry<Integer, Integer> entry: hm.entrySet())
		{
			//entry.
		}
		
		//Collection<int> col = new Collection<int>();
		
		
		
	}
	
	
}
