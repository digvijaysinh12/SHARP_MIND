public class Constructor {
   String name;
   int age;

   Constructor(){
    name="Default";
    age=0;
   }

    Constructor(String name){
     this.name=name;
     this.age=0;
    }

    Constructor(String name, int age){
     this.name=name;
     this.age=age;
    }

    public static void main(String[] args) {
        Constructor person1 = new Constructor();
        Constructor person2 = new Constructor("Alice");
        Constructor person3 = new Constructor("Bob", 25);

        System.out.println("Person 1: " + person1.name + ", Age: " + person1.age);
        System.out.println("Person 2: " + person2.name + ", Age: " + person2.age);
        System.out.println("Person 3: " + person3.name + ", Age: " + person3.age);
    }
}
