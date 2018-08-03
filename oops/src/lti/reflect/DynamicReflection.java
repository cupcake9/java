package lti.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DynamicReflection {
	public static void main(String[] args) throws Exception {
		String qcn = "lti.reflect.Customer";// qualified class name
		
		//Manual loading of class
		Class custClass= Class.forName(qcn);
		//getting parameterized constructor
		Constructor custConst=custClass.getConstructor(String.class);
		//Instantiating with parameterized constructor
		Object obj=custConst.newInstance("tasneem");
		System.out.println(obj);
		//get private method of class with name and param types
		Method printMethod=custClass.getDeclaredMethod("print", null);
		printMethod.setAccessible(true);
		printMethod.invoke(obj, null);
	}
}
