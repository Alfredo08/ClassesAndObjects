public class Person{
    // Attributes
    private String firstName;
    private String lastName;
    private int age;

    // Constructor
    public Person( String firstName, String lastName, int age ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Constructor overloaded
    public Person( String firstName, String lastName ){
        this.firstName = firstName;
        this.lastName = lastName;
    } 
    
    // Getters
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    // Setters
    public void setFirstName( String firstName ){
        this.firstName = firstName;
    }

    public void setLastName( String lastName ){
        this.lastName = lastName;
    }

    public void setAge( int age ){
        this.age = age;
    }

    public void print(){
        System.out.println( "FirstName: " + this.firstName );
        System.out.println( "LastName: " + this.lastName );
        System.out.println( "Age: " + this.age );
    }
}