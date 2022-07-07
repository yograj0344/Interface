interface  Animal{  // interface is the achieveto the 100% abstraction 
                    // interface declared to  the "interface" keyword
                    // interface can not constructors    
    void walk();
  
}
interface Herbivore{
    

}
class Horse implements Animal ,Herbivore{  // achieve to multiple inheritance to help of interface
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