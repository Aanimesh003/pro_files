public class Oops {

    public static void main(String args[])
    { 
      horse h = new horse();
      chicken c = new chicken();
      c.walk();
      c.eat();
      h.moves();
      
    }
    
}
abstract class animal{
    void eat()
    {
        System.out.println("the animal eats food ");
    }
    abstract void walk();
}
interface chessplayer{
    void moves();
}
class horse implements chessplayer{
 public void moves()
{
    System.out.println("diagonal by 2.5 upward or downward direcction");
}
}
class dog extends animal{
void walk(){
    System.out.println("walks on 4 legs");
}
}
class chicken extends animal{
    void walk()
    {
        System.out.println("walks on 2 legs");
    }
}


