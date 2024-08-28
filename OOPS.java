
public class OOPS {

    public static void main(String args[]) {
        // // Pen p1 = new Pen(); // created a pem object
        // p1.setcolor("blue"); // setter
        // System.out.println(p1.getcolor()); // getter
        // p1.settip(5); // setter
        // System.out.println(p1.gettip()); // getter
        // Bankdetails bc = new Bankdetails();
        // bc.username = "palak chaubey";
        // // bc.password=5;

        // Student s1 = new Student();
        // s1.name = "arya";
        // s1.roll = 123;
        // s1.password = "abcd";
        // s1.marks[0] = 100;
        // s1.marks[1] = 90;
        // s1.marks[2] = 80;

        // Student s2 = new Student(s1);
        // s2.password = "xyz";
        // s1.marks[2] = 69;

        /*
         * Student s2 = new Student("rishi");
         * System.out.println(s2.name);
         * Student s3 = new Student(29);
         * System.out.println(s3.roll);
         * 
         * 
         * for (int i = 0; i < 3; i++) {
         * System.out.println(s2.marks[i]);
         * }
         * 
         * public static void main(String args[]) {
         * Horse h = new Horse();
         * h.eats();
         * h.walk();
         * System.out.println(h.color);
         * chicken c = new chicken();
         * c.eats();
         * c.walk();
         * 
         * }
         * }
         * 
         * abstract class Animals {
         * String color;
         * 
         * Animals() {
         * color = "brown";
         * }
         * 
         * void eats() {
         * System.out.println("animal eats");
         * }
         * 
         * abstract void walk();
         * }
         * 
         * class Horse extends Animals {
         * void changecolor() {
         * color = "dark brown";
         * }
         * 
         * void walk() {
         * System.out.println("walks on four  legs");
         * }
         * }
         * 
         * class chicken extends Animals {
         * void changecolor() {
         * color = "yellow";
         * }
         * 
         * void walk() {
         * System.out.println("walks on two legs");
         * }
         * }
         * 
         * class Student {
         * String name;
         * int roll;
         * String password;
         * int marks[];
         * 
         * /*
         * Student(Student s1) { // copy constructer (SHALLOW COPY)
         * marks = new int[3];
         * this.name = s1.name;
         * this.roll = s1.roll;
         * this.marks = s1.marks;
         * }
         */

        // DEEP COPY CONSTRUCTER
        // Student(Student s1) {
        // marks = new int[3];
        // this.name = s1.name;
        // this.roll = s1.roll;
        // for (int i = 0; i < marks.length; i++) {
        // this.marks[i] = s1.marks[i];
        // }
        // }

        // Student() { // non-paramatrised constructer
        // marks = new int[3];
        // System.out.println("constructer is called...");
        // }

        // Student(String name) { // paramatrised constructor
        // marks = new int[3];
        // this.name = name;
        // }

        // Student(int roll) { // paramatrised constructor
        // marks = new int[3];
        // this.roll = roll;
        // }
        // }

        // class Bankdetails {
        // public String username = "Rishi Chaubey";
        // // private long password = 9914;

        // }

        // class Pen {
        // private String color;
        // private int tip;

        // String getcolor() {
        // return this.color; // this keyword
        // }

        // int gettip() {
        // return this.tip;
        // }

        // void setcolor(String newcolor) {
        // color = newcolor;
        // }

        // void settip(int newtip) {
        // tip = newtip;
        // }
        // }
    }
}
