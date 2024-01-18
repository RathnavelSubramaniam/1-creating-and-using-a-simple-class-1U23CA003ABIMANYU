class Persona {
    String firstName;
    String lastName;
    int age;
Persona(String fName, String lName, int a) {
    firstName = fName;
    lastName =  lName;
    age = a;
}
String getFullName(){
    return firstName + "" + lastName;
}
}
class Person{
    public static void main (String args []) {
    Persona a1 = new Persona("John", "Doe", 30);
    Persona a2 = new Persona("Alice", "Smith", 20);

    String  kk = a1.getFullName();
    String lk = a2.getFullName();

    System.out.println("Person 1: "+kk);
    System.out.println("Person 2: "+lk);

    double average = ((a1.age + a2.age)/2.0);
    System.out.println ("Average: " +average);
}
}

