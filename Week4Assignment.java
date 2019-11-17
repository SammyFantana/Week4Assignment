
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week4Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> employeeNames = new ArrayList<String>();
		Set<Integer> ids = new HashSet<Integer>();
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
//		List of Names
		employeeNames.add("Sam");
		employeeNames.add("Tom");
		employeeNames.add("Bert");
		employeeNames.add("Joe");
		employeeNames.add("Joey");
//		List of ID's
		ids.add(1000);
		ids.add(1001);
		ids.add(1002);
		ids.add(1003);
		ids.add(1004);
		
		int i = 0;
		
		for (int id : ids) {
			
			employeeMap.put(id, employeeNames.get(i++));
			
			
		}
		
		for (int key : employeeMap.keySet()) {
			System.out.println(employeeMap.get(key));;
		}
		
		StringBuilder idsBuilder = new StringBuilder();
		
		for (int id : ids) {
			idsBuilder.append( id + "-");
		}
		System.out.println(idsBuilder.toString());
		
		StringBuilder namesBuilder = new StringBuilder();
		
		for (String name : employeeNames) {
			namesBuilder.append(name + " ");
		}
		System.out.println(namesBuilder.toString());
	}

}
