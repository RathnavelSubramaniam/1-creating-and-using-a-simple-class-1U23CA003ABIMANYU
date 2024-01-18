class Persona {
    String firstName;
    String lastName;
    int age;
Persona (String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName =  lastName;
    this.age = age;
}
String getFullName(){
    return firstName + "" + lastName;
}
}
class Person{
    public static void main (String args []) {
    Persona a1 = new Persona("Michael", "Scott", 46);
    Persona a2 = new Persona("Jim", "Halpert", 28);

    String  kk = a1.getFullName();
    String lk = a2.getFullName();

    System.out.println(kk);
    System.out.println(lk);

    double average = ((a1.age + a2.age)/2.0);
    System.out.println (average);
}
}

