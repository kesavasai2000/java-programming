public class inherit{
    public static void main(String[] args){
        senthanK k= new senthanK();
        k.setAge(18);
        k.setName("santhanam");
        System.out.println(k.setName());
        System.out.println(k.setAge());

    }
}

class senthanK{
    private int age;
    private String name;
    private int id;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

}








