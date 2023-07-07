package Hybridinher;
public class perinstance {
	
	    String name;
	   int age;

	    public perinstance(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }
	}
 class Main {
	
	    public static void main(String[] args) {
	    	perinstance person1 = new perinstance("John", 25);
	    	perinstance person2 = new perinstance("Jane", 30);

	        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
	        System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");
	    }
}
	