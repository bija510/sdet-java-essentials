package intermediateJava;

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
*whenever you have 2 variable with same name and you want to differentiate between them use this.name 
*this class indicate the class itself = JP_01_Access_Modifier
*/
public class JP_01_Access_Modifier {

	private String name; 
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) { //note: this.name = JP_01_Access_Modifier.name []
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
