public class PersonApp {
    public static void main( String args[] ){
        Person alex = new Person( "Alex", "Miller", 25 );
        Person roger = new Person( "Roger", "Stuart" );
        Student maria = new Student( "Maria", "Robles", 28, 12345, "Marco" );
        String fullName;
  
        alex.print();
        fullName = alex.getFirstName() + " " + alex.getLastName();
        System.out.println( "Full name of Alex: " + fullName );
        roger.print();

        fullName = maria.getFirstName() + " " + maria.getLastName();
        System.out.println( "Full name of Maria: " + fullName );
        maria.print();
    }
}
