package ch11;
public class LabP401 {

	/**
	 * @param args
	 */
	@SuppressWarnings("rawtypes")
    public static void main(String[] args) {
		java.util.ArrayList<Comparable> list = new java.util.ArrayList();
		list.add("Denver");
		list.add("Austin");
		list.add(new java.util.Date());
		String city =(String)list.get(0);
		list.add("");
		list.set(3, "Dallas");
		System.out.println(list.get(3));

		

	}

}
