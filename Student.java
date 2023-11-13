public class Student{
  public String firstName;
  public String lastName;
  public int grade;
  public static totalStudents = 0;

  public Student(first,last, theGrade){
    firstName = first;
    lastName = last;
    grade = theGrade;
    totalStudents++;
  } 
}
  
