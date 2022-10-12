
package gradebook;


public class GradeBookTest
 {
 public static void main( String[] args )
 {
 GradeBook myGradeBook = new GradeBook(
 "CS101 Introduction to Java Programming" );

 myGradeBook.display(); // display welcome message
 myGradeBook.input(); // read grades from user
myGradeBook.report();

 } // end main
 } // end class GradeBookTest

