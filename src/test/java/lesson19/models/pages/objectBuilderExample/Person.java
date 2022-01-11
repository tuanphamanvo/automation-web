package lesson19.models.pages.objectBuilderExample;

public class Person {
    private String name;
    private int age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person person = null;
        try{person = ObjectBuilder.buildObject(Person.class);}catch (Exception ignore){}
        if(person!=null){
            System.out.println(person);
        }

    }
}
