package src.sandbox.objecttype;

public abstract class Human {
    static final int lifeSpan = 100;
    private String name;
    private int age;
    private float height;
    private Gender gender;

    // Empty constructor
    public Human(){}

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    // Implicit constructor
    public Human(String name, int age, float height, Gender gender){
        this(name, age);
        this.height = height;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    /*
    * Computes and prints time to live
    */
    public abstract int getTimeToLive();

//    public static void main(String[] args){
//          Human human = new Human();
//          human.setName("Daniel Kissiedu");
//          human.setAge(20);
//          human.setHeight(2.1f);
//
//        System.out.println("Name: " + human.getName() );
//        System.out.println("Age: " + human.getAge());
//        System.out.println("Height: " + human.getHeight());
//        System.out.println("Total lifespan: " + Human.lifeSpan );
//        int timeToLive = human.getTimeToLive();
//        System.out.println("Time to live: " + timeToLive);
//    }
}
