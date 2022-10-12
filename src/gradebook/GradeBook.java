
package gradebook;

 import java.util.Scanner;
public class GradeBook
 {
 String coursname;
 int total,gradecount;
 int a,b,c,d,f;
 public GradeBook(String name){
     coursname=name;
     
 }
 public GradeBook(){
     
 }
 public void setname(String name){
     coursname=name;
 }
 public String getname(){
     return coursname;
 }
public void display(){
    System.out.printf("%s kursu notlarına hosgeldin\n",getname());
}  
public void input(){
    Scanner inp=new Scanner(System.in);
    int grade;
     do{
         System.out.printf("0-100 arası notları gir(cikis icin -1 e bas):");
         grade=inp.nextInt();
         total+=grade;
         ++gradecount;
         inclettercount(grade);
     }while(grade!=-1);
    
}
public void inclettercount(int grade){
    switch(grade/10){
        case 10:
        case 9:++a;
            break;
        case 8:++b;
            break;
        case 7:++b;
            break;
        case 6:++c;
            break;
        case 5:++d;
            break;
        default:++f;
            break;
      }
}
public void report(){
    System.out.printf("\nNotlar:");
   if(gradecount!=0){
       double avg=(double)total/gradecount;
       System.out.printf("\n%d notun toplamı.%d",gradecount,total);
       System.out.printf("\nOrtalaması:%.2f",avg);
       System.out.printf("\nHer harf notunu alan öğrenci sayısı:\nA:%d\nB:%d\nC:%d\nD:%d\nF:%d\n",a,b,c,d,f);
   }
   else
     System.out.printf("Not girilmedi");   
    
   }
}