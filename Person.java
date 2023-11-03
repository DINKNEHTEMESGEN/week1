public class Person {
    private int id;
    private String name;
    private int age;
    private boolean parentPermission;


    public Person(int age, boolean parentPermission, String name) {

        this.age = age;
        this.parentPermission = parentPermission;
        this.name = name != null ? name : "unknown";  //set default value "unknown"for  name if it is null
    }

    public Person(int age, boolean parentPermission) {
        this(age, parentPermission, "unknown");//call the constructor with default name value"unknown"
    }

    public Person(int age) {
        this(age, true, "unknown");//call the constructor with default name value"unknown" and parentpermission value true
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name != null ? name : "unknown";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean ofAge() {
        return age >= 18;
    }

    public boolean canUseServices() {
        return ofAge() || parentPermission;
    }
}
