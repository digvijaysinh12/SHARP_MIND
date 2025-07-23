public class CopyContructor {
    String name;
    int age;

    CopyContructor(String name,int age){
        this.name = name;
        this.age = age; 
    }

    // Copy constructor
    CopyContructor(CopyContructor other) {
        this.name = other.name;
        this.age = other.age;
    }

    public static void main(String[] args) {
        CopyContructor original = new CopyContructor("Alice", 30);
        CopyContructor copy = new CopyContructor(original);

        System.out.println("Original: " + original.name + ", Age: " + original.age);
        System.out.println("Copy: " + copy.name + ", Age: " + copy.age);
    }
}

