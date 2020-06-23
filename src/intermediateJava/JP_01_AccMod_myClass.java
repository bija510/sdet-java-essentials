package intermediateJava;

public class JP_01_AccMod_myClass {
	/*The scope of access modifiers in tabular form
	------------+-------+---------+--------------+--------------+--------
	            | Class | Package | Subclass     | Subclass     |Outside|
	            |       |         |(same package)|(diff package)|Class  |
	————————————+———————+—————————+——————————----+—————————----—+————————
	public      | Yes   |  Yes    |    Yes       |    Yes       |   Yes |    
	————————————+———————+—————————+—————————----—+—————————----—+————————
	protected   | Yes   |  Yes    |    Yes       |    Yes       |   No  |    
	————————————+———————+—————————+————————----——+————————----——+————————
	default     | Yes   |  Yes    |    Yes       |    No        |   No  |
	————————————+———————+—————————+————————----——+————————----——+————————
	private     | Yes   |  No     |    No        |    No        |   No  |
	------------+-------+---------+--------------+--------------+--------
	*/
	public static void main(String[] args) {
		JP_01_Access_Modifier stu = new JP_01_Access_Modifier();
		
		stu.setName("mark");
		System.out.println(stu.getName());
		
		stu.setAge(15);
		System.out.println(stu.getAge());
		
		

	}

}











