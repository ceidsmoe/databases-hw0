package uchidb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author aelmore
 */
public class HW0Runner implements Containers<Integer, String> {

	private static HW0Runner instance = null;
	private Map<String, Integer> m = new HashMap<String, Integer>();
	
	private HW0Runner() { }
	
	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm
	public static Containers<Integer, String> getContainers() {
		if(instance == null) {
	         instance = new HW0Runner();
	      }
	      return instance;
	}

	@Override
	public Set<Integer> initSet(Integer[] tArray) {
		Set<Integer> output = new HashSet<Integer>();
		for (int i = 0; i < tArray.length; i++)
			output.add(tArray[i]);
		return output;
	}

	@Override
	public List<Integer> initList(Integer[] tArray) {
		List<Integer> output = new ArrayList<Integer>();
		for (int i = 0; i < tArray.length; i++)
			output.add(tArray[i]);
		return output;
	}

	@Override
	public Map<String, Integer> initEmptyMap() {
		Map<String, Integer> output = new HashMap<String, Integer>();
		return output;
	}

	@Override
	public void storeMap(Map<String, Integer> mapToStoreInClass) {
		this.m = mapToStoreInClass;
		
	}

	@Override
	public boolean addToMap(String key, Integer value, boolean overwriteExistingKey) {
		if (!this.m.containsKey(key) || overwriteExistingKey) {
			this.m.put(key, value);
			return true;
		}
		else
			return false;
	}

	@Override
	public Integer getValueFromMap(String key) {
		return this.m.get(key);
	}

	@Override
	public Integer getValueFromMap(String key, Integer defaultValue) {
		Integer output = this.m.get(key);
		if (output == null)
			return defaultValue;
		else
			return output;
	}
	
	public static void main(String[] args){
		
	}
}
