package ch11.book.s1106;

import java.lang.reflect.Field;

public class ReflectionExample {
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("java.lang.");
		
		System.out.println("클래스 이름");
		System.out.println(clazz.getName());
		System.out.println();
		
		System.out.println("생성자 정보");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			System.out.println(")");
			System.out.println();
			
			System.out.println("필드 정보");
			Field[] fields  = clazz.getDeclaredFields();
			for(Field field : fields) {
				System.out.println(field.getType().getSimpleName() + " " + field.getName());
			}
			System.out.println();
			
			System.out.println("메소드 정보");
			Method[] methods = clazz.getDeclaredMethods();
			for(Method method : methods) {
				System.out.println(method.getName() + "(");
				Class[] parameters = method.getParameter Types();
				pringParameters(parameters);
				System.out.println(")");
			}
		}
	}
}
