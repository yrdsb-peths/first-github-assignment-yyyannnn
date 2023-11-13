public class Student{
  public String firstName;
  public String lastName;
  public int grade;
  public int mark;
  public static totalStudents = 0;

  public Student(first,last, theGrade, theMark){
    firstName = first;
    lastName = last;
    grade = theGrade;
    mark = theMark;
    totalStudents++;
  } 
}
  
