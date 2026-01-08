package aprendendo.poo.intializerBlock.ex02;

public class Counter {

    static int totalObjects;
    int id;

    static{
        System.out.println("Static block executed");
        totalObjects = 0;
    }
    {
        id = totalObjects;
        totalObjects ++;
    }
    public Counter(){
        System.out.println("Constructor excuted ID: " + id);
    }

    public int displayInfo(){
        System.out.println("ID: " + id + " Total Objects created " + totalObjects);
        return totalObjects;
    }
}
