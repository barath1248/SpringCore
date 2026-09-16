package businessLayer.firstProgram.ReflectionAPI;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
	Class<Student> ref=Student.class;
	
	 //prints Student
	 System.out.println(ref.getSimpleName());
	
	 //prints package+class name
	 System.out.println(ref.getName());
	
	 //calls constructor
     Student std= ref.getDeclaredConstructor().newInstance();
     System.out.println();

     //gets fields inside the class 
     System.out.println("Fields are : ");
     System.out.println("---------------");
     Field[] fields=ref.getDeclaredFields();   
     for(Field field : fields) {
    	 System.out.println(field.getName());
     }
     System.out.println();
     
     //setting value to a particular field and retrieving it 
     System.out.println("stdName is : ");
     System.out.println("---------------");
     Field name=ref.getDeclaredField("stdName");
     name.setAccessible(true);
     name.set(std, "Bharath");
     Object value=name.get(std);
     System.out.println(value);
     System.out.println();

     //Methods
     System.out.println("Methods are : ");
     System.out.println("---------------");
     Method method=ref.getDeclaredMethod("sayHi");
     method.invoke(std);
     System.out.println();

     //   method.invoke(s, "Bharath"); ->for param methods
      
}
}
