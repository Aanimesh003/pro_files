
public class practise
{

  static int GetBit(int n,int pos)
  {
    // int bitmask = 1 << pos;
    // if((bitmask&n)==0)
    // return 0;
    // else  
    // return 1;

    // either of the two methods are correct for getting the ith bit 
    int bitmask = 1<<pos;
    if((bitmask&n)== bitmask)
    return 1;
    else     
    return 0;
     
  }

  static int  SetBit(int n,int pos)
  {
     int bitmask = 1<<pos;
     return (bitmask | n);
        
     }

  static int  ClearBit(int n,int pos ){
    int bitmask = 1 << pos;
    return (~(bitmask) & n);
  } 
  static int updatbit(int n,int pos ){
    int bitmask = 1 << pos;

    if((bitmask&n)== bitmask)
    return ClearBit(n,pos);

    else 
     return SetBit(n, pos);


  }

  public static void main(String [] args)
  {
    //System.out.println(GetBit(8,2));
    //System.out.println(SetBit(5,2));
    //System.out.println(ClearBit(15,2));
    System.out.println(updatbit(11,2));


  }
}

