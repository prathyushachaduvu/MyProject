//import java.util.HashMap;
import java.util.Hashtable;

import java.util.Iterator;
import java.util.Set;

public class DemoMap {

	public static void main(String[] args) {
		//HashMap<String , Integer> contacts = new HashMap<>();
		Hashtable<String , Integer> contacts = new Hashtable<>();
		contacts.put("aUser1",10000);
		contacts.put("cUser2",60000);
		contacts.put("bUser3",20000);
		contacts.put("dUser5",30000);
		contacts.put("eUser4",80000);
		//contacts.put(null,null);
		//contacts.put(null,123);
		System.out.println(contacts);
		//System.out.println(contacts.get("User2"));
		Set<String> keys=contacts.keySet();
		System.out.println(keys);
		Iterator<String> it=keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key +" :"+contacts.get(key));
		}
	}

}
