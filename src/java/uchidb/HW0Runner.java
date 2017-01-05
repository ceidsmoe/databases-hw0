package uchidb;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author aelmore
 */
public class HW0Runner implements Containers<Integer, String> {

	private static HW0Runner instance = null;
	
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> initList(Integer[] tArray) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Integer> initEmptyMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void storeMap(Map<String, Integer> mapToStoreInClass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addToMap(String key, Integer value, boolean overwriteExistingKey) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer getValueFromMap(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getValueFromMap(String key, Integer defaultValue) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args){
		
	}
}
