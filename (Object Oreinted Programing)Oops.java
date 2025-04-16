public class Oops{
    public static void main(String[] args) {
// Copy consttructor 
/* 
    Student s1 = new Student();
    s1.name = "Ayush";
    s1.roll = 4568;
    s1.pass = "ayush--";
    s1.marks[0] = 100;
    s1.marks[1] = 100;
    s1.marks[2] = 100;
    Student s2 = new Student(s1);
    s1.marks[2] = 00;
    for(int i =0 ; i<s1.marks.length;i++){
        System.out.println(s2.marks[i]);
    }
}
   */ 
// Single Inheritance
/* 
   fish dolphin = new fish();
    dolphin.eat();
   dolphin.setfin(10);
   dolphin.setcolor("pink");
   System.out.println(dolphin.getcolor());
*/
// multi-level inheritance
/* 
dog golu = new dog();
 golu.setcolor("brown");
 golu.legs = 4;
 golu.breed = "German sepered";
 System.out.println("legs = " + golu.legs + " |" + "Breed = " + golu.breed + " |" +"color = "+ golu.getcolor() +" ");
*/
// Hierarchial inheritance 
/* 
fish shark = new fish();
shark.setcolor("blue");
System.out.println(shark.getcolor());
mammals human = new mammals();
human.walk();
human.breathe();
shark.swim();
*/
//Polymorphism inheritance method overloading 
/* 
calculator cal = new calculator();
System.out.println(cal.sum((float)1.5, (float)1.5));
System.out.println(cal.sum(4, 5));
*/
//Abstraction 
/* 
horse chetak= new horse();
chetak.walk();
*/
//Encapsulation 
/* 
Bankaccount first = new Bankaccount();
first.name = "ayush";
System.out.println(first.name);
first.setpassword("ayushppp4oio");
System.out.println(first.getpassword());
*/
//Interface 
/* 
queen qi = new queen();
qi.move();
*/
// Interface (multilevel inheritance) 
/* 
tourtle t1 = new tourtle();
t1.swim();
t1.walks();
*/
//Test obj = new Test();
}

}

// Constructor 
/* 
   //class Student{
    //String name;
    //String pass;
    //int roll;
    //int marks[];
 */   
/* 
    Student() {
        marks = new int[3];
        System.out.println("constructor is calling...");   
    }
*/         
// Swallow copy or Copy constructor
/*    
  Student (Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.pass = s1.pass;
        this.marks = s1.marks;
        }
*/
// Deep copy or copy constructor
/*          
Student (Student s1) {
    marks = new int[3];
    this.name = s1.name;
    this.roll = s1.roll;
    this.pass = s1.pass;
    for (int i = 0; i < s1.marks.length; i++) {
    this.marks[i] = s1.marks[i]   ;
    }

    }
    */
// Inheritance (Single level)
/*      
class animal {
    String color; 
    void eat(){
        System.out.println("Animals can eat ");
    }
    void breathe (){
        System.out.println("Animals can breathe");
    }
    void setcolor (String color){
        this.color = color;
    }
    String getcolor(){
        return this.color;
    }
    
}
class fish extends animal {
    int fins ;
    void swim (){
        System.out.println("Fishes can swim");
    }
    void setfin(int fins){
        this.fins = fins;
   1 }
    int getfins (){
        return this.fins;
    }
}
*/
// Inheritance (multi level)
/*  
class animal {
    String color; 
    void eat(){
        System.out.println("Animals can eat ");
    }
    void breathe (){
        System.out.println("Animals can breathe");
    }
    void setcolor (String color){
        this.color = color;
    }
    String getcolor(){
        return this.color;
    }
}
class mammal extends animal{
    int legs;
} 
class dog extends mammal{
    String breed;
}
*/    
// Hierarchial inheritance
/* 
class animal {
    String color; 
    void eat(){
        System.out.println("Animals can eat ");
    }
    void breathe (){
        System.out.println("Animals can breathe");
    }
    void setcolor (String color){
        this.color = color;
    }
    String getcolor(){
        return this.color;
    }
}
class mammals extends animal{
    void walk(){
        System.out.println("mamals can walk ");
    }
}
class fish extends animal{
    void swim(){
        System.out.println("fishes can swaim");
    }
}*/
//POlymorphism compile time method overloadjing 
/*
class calculator {
    int sum (int a , int b , int c){
        return a+b+c;
    }
    int sum (int a , int b){
        return a+b;
    }
    float sum (float a , float b){
        return a+b ;
    }
}*/
// Abstraction 
/* 
abstract class animal {
abstract void walk ();
}

class horse extends animal{
    void walk(){
    System.out.println("walks on 4 leg");
    }
}
    */
//Encapsulation
/* 
class Bankaccount {
String name;
String address;
private String passwords;
void setpassword(String pass){
    this.passwords = pass;
}
String getpassword (){
    return passwords;
}
} */

//Interface 
/* 
interface Chessplayer {
    void move();
}    
class queen implements Chessplayer{
   public  void move(){
        System.out.println("all position arond upar niche daye baye or chaye saye saye ");
    }
}
    */
// Interface (multi-level inheritance) 
/* 
interface survve_in_water  {
    void swim();
}
interface survive_in_land{
void walks();
}
class tourtle implements survive_in_land,survve_in_water{
    public void swim(){
        System.out.println("terata bhi or jinda bhi raheta hai panni ke andar");
    }
   public void walks(){
    System.out.println("jammen me chlta bhi hai or rehta bhi hai jinda");
   
} 
}
*/
//constructor chaning 
/* 
class Test {
    Test() { 
        this(10);  // Same class ka parameterized constructor call kiya
        System.out.println("Default constructor");
    }

    Test(int x) { 
        System.out.println("Parameterized constructor: " + x);
    }
}
*/


