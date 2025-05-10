public class poy2{
    public static void main(String [] args){
        santhan k=new santhan();
        k.sound();
    }
}
Class animal(){
    public void sound(){
        System.out.println("animal sound");
    }
}
class santhan extends animal{
    @override
    public void sound(){
        System.out.println("machha")
    }
}