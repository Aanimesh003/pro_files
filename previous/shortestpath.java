public class shortestpath {
    public static float getshortestpath(String path)
    {
        // draw  the cartesian plane if you cannot visuallize for such type of questions 
        // for each direction u=you can only move for about 1 unit on the cartesian plane 
        /* N = Y+1; upward movemnet  
         * S = Y-1; downward movement 
         * E = X+1; right
         * W = X-1; left
         */
      int x=0,y=0;
      for(int i=0;i<path.length();i++)
      {
        char d = path.charAt(i);
        if(d=='N')
        y++;
        else if(d=='S')
        y--;
        else if(d=='E')
        x++;
        else
        x--;
      }
      int x2= x*x;
      int y2= y*y;
      return (float)Math.sqrt(x2+y2);
    }
    public static void main(String args[])
    {
      String str ="WNEENESEENNN";
      System.out.println(getshortestpath(str));

    }
}
