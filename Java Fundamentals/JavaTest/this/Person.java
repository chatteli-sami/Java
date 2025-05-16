
class Person {
    private int age;
    private String name;

    public Person(int ageParam, String nameParam){
        this.age = ageParam;
        this.name = nameParam;
    }
    public void ObjectMethods(Person otherObject){
        System.out.println("Class name: " + this.getClass().getSimpleName());
        System.out.println("toString: " + this.toString());
        System.out.println("Equals: " + this.equals(otherObject));
    }
}