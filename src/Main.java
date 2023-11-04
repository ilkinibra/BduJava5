// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
    // then press Enter. You can now see whitespace characters in your code.
    public class Main {
    public static void main(String[] args) {
     /*   Student.display();
        Student.display(45);
        Student.display(50.0f);*/
        Student s =new Student();
        String result= s.findMax("il","ilk");//obyektini yaratmadan cagirmaq ucun metodun onune static yaziriq
//        int result= s.findMax(5,6,7); //3 ededin muqayisesi
//THIS clasin icinde yaradan obyekti temsil edir
        System.out.println(result);

    }
}
    class Student {
        String name;
        String surName;
        static String university="BDU";
        int age;
        Student(){
            System.out.println("Empty");
        }
        Student(String myName, int myAge) {
            this();
            System.out.println("constructor");
            this.name = myName;
            this.age = myAge;
        }
        int findMax(int a,int b){
           return a > b ? a:b; //terbary operator
        }
        int findMax(int a,int b,int c){
            if(a>b && a>c)return a;
            if(b>a && b>c)return b;
            return c;


          /*  int i = a > b ? (a > c ? a : c) : (b > c ? b : c);
            return i;*/
        }
        String findMax(String a,String b){
            return a.length() > b.length() ? a:b;
        }
//    static void display(){
//        System.out.println("Salam");
//    }
//        static void display(int a){
//            System.out.println("Salam int"+a);
//        }
//        static void display(float a){
//            System.out.println("Salam float"+a);
//        }

}