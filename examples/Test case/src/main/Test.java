package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import builder.HumanBuilder;
import model.PersonDefinition;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDefinition parent1 = new PersonDefinition();
		parent1.setAge(83);
		parent1.setFirstName("Elga");
		
		new HumanBuilder()
		.setClothes(new ArrayList<String>() {{
	        add("pants");
	        add("shirt");
	        add("shoes");}})
		.personObject()
			.setWeight(new Double(105.3))
			.setFirstName("Mathias")
			.setAge(30)
			.allParents()
				.setAdditionalProps(new HashMap<String, PersonDefinition>() {{
			        put("mother", parent1);
			    }});
	}

}
