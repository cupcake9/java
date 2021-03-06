package lti.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CustomerReflection {
	public static void main(String[] args) {

		Customer c1=new Customer("Polo");
		System.out.println(c1);
		
		Class cc=c1.getClass();
		System.out.println(cc);
		
		System.out.println("\n--list of constructors--");
		Constructor[] constructors=cc.getConstructors();
		for(Constructor c:constructors) {
			System.out.println(c);
		}
		
		System.out.println("\n--list of methods--");
		Method[] methods=cc.getMethods();
		for(Method m:methods) {
			System.out.println(m);
		}
		
		System.out.println("\n--list of declared methods--");
		Method[] decMethods=cc.getDeclaredMethods();
		for(Method m:decMethods) {
			System.out.println(m);
		}
		
		System.out.println("\n--List of fields--");
		Field[] fields=cc.getDeclaredFields();
		for(Field f:fields) {
			System.out.println(f);
		}
	}
}
