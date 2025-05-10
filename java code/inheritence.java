public class inheritence{

    public static void main(String[] args){
        Driver d=new Driver();
        d.id=1;
        d.name="senthan";
        User u = new User();
        u.name="hari";
        u.welcome(u.name);

        
    }
}

class wooberuser{
    int id;
    String name;
    int age;
    String address;
    String phoneno;

    public static void welcome(String name){
        System.out.println("welcome"+name);
        
    }
}
class User extends wooberuser{
    String Petname;

}
class Driver extends wooberuser{
    String Vehiclename;
    String Vehicleno;

    public void acceptBooking(String name){
        System.out.println(name+"accept booking");
    }
}