package businessLayer.firstProgram.Annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Student{
	public String name();
	public int id();
}

@Student(name="Bharath",id=101)
class University{
	
}

@Student(name="BharathRaja",id=102)
class School{
	
}
public class Main {
public static void main(String[] args) {
	  University un=new University();
	  School sc=new School();
  
	  Class<University> ref1=University.class;
	  Student annotation1=ref1.getAnnotation(Student.class);
	  
	  System.out.println("Name : "+annotation1.name());
	  System.out.println("ID : "+annotation1.id());
  
	  Class<School> ref2=School.class;
	  Student annotation2=ref2.getAnnotation(Student.class);
	  
	  System.out.println("Name : "+annotation2.name());
	  System.out.println("ID : "+annotation2.id());

}
}
