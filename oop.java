interface  Animal{
    void walk();
  
}
interface Herbivore{
    vod eat();

}
class Horse implements Animal ,Herbivore{
     public void walk(){
         System.out.println("walks on 4 legs");
     }
} 
public class oop{
    public static void main(String[] args)
    {
        Horse o=new Horse();
        o.walk();
    }
}