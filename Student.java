public class Student extends Person {
    private int id;
    private String instructor;

    public Student( String fN, String lN, int a, int id, String ins ){
        super( fN, lN, a );
        this.id = id;
        this.instructor = ins;
    }

    // Getters
    public int getID(){
        return this.id;
    }

    public String getInstructor(){
        return this.instructor;
    }

    // Setters
    public void setID( int id ){
        this.id = id;
    } 

    public void setInstructor( String instructor ){
        this.instructor = instructor;
    }

    // Overwriting inherited print() method 
    public void print(){
        //System.out.println( "FirstName: " + getFirstName() );
        //System.out.println( "LastName: " + getLastName() );
        //System.out.println( "Age: " + getAge() );
        super.print();
        System.out.println( "Instructor: " + this.instructor );
        System.out.println( "ID: " + this.id );

    }
}
