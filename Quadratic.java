public class Quadratic{
    public static void main(String [] args) {
        Poly1Test();
        Poly2Test();
        Poly3Test();
    }


    public static void Poly1Test(){
        System.out.println("Tests for polynomial 1\n");
        if(quadYTest(2,-1,1,-1,-3)){
            System.out.println("Quad Y test passed");
        } else System.out.println("Quad Y test failed");

        if(discriminantTest(-1,1,-1,-3)){
            System.out.println("Discriminant test passed");
        } else System.out.println("Discriminant test failed");

        if(numRootsTest(-1,1,-1,0)){
            System.out.println("numRoots test passed");
        } else System.out.println("numRoots test failed");

        if(Double.isNaN(plusRoot(-1,1,-1))){
            System.out.println("plusRoot test passed");
        } else System.out.println("plusRoot test failed");

        if (Double.isNaN(minusRoot(-1,1,-1))){
            System.out.println("minusRoot test passed");
        } else System.out.println("minusRoot test failed");

        if(findRootsTest(-1,1,-1,(""))){
            System.out.println("findRoots test passed");
        } else System.out.println("findRoots test failed");

        if(xSymTest(-1,1,-1,0.5)){
            System.out.println("X Sym test passed");
        } else System.out.println("X Sym test failed");

        if(yVertexTest(-1,1,-1,-0.75)){
            System.out.println("Y Vertex test passed");
        } else System.out.println("Y Vertex test failed");
    }

    public static void Poly2Test(){
        System.out.println("\n\nTests for polynomial 2\n");
        if(quadYTest(2,-2,-12,-18,-50)){
            System.out.println("Quad Y test passed");
        } else System.out.println("Quad Y test failed");

        if(discriminantTest(-2,-12,-18,0)){
            System.out.println("Discriminant test passed");
        } else System.out.println("Discriminant test failed");

        if(numRootsTest(-2,-12,-18,1)){
            System.out.println("numRoots test passed");
        } else System.out.println("numRoots test failed");

        if(plusRootTest(-2,-12,-18,-3)){
            System.out.println("plusRoot test passed");
        } else System.out.println("plusRoot test failed");

        if(minusRootTest(-2,-12,-18,-3)){
            System.out.println("minusRoot test passed");
        } else System.out.println("minusRoot test failed");

        if(findRootsTest(-2,-12,-18,("-3.0,0"))){
            System.out.println("findRoots test passed");
        } else System.out.println("findRoots test failed");

        if(xSymTest(-2,-12,-18,-3)){
            System.out.println("X Sym test passed");
        } else System.out.println("X Sym test failed");

        if(yVertexTest(-2,-12,-18,0)){
            System.out.println("Y Vertex test passed");
        } else System.out.println("Y Vertex test failed");
    }

    public static void Poly3Test(){
        System.out.println("\n\nTests for polynomial 3\n");
        if(quadYTest(2,1,0,-2,2)){
            System.out.println("Quad Y test passed");
        } else System.out.println("Quad Y test failed");

        if(discriminantTest(1,0,-2,8)){
            System.out.println("Discriminant test passed");
        } else System.out.println("Discriminant test failed");

        if(numRootsTest(1,0,-2,2)){
            System.out.println("numRoots test passed");
        } else System.out.println("numRoots test failed");

        if(plusRootTest(1,0,-2,1.4142135623730951)){
            System.out.println("plusRoot test passed");
        } else System.out.println("plusRoot test failed");

        if(minusRootTest(1,0,-2,-1.4142135623730951)){
            System.out.println("minusRoot test passed");
        } else System.out.println("minusRoot test failed");

        if(findRootsTest(1,0,-2,((plusRoot(1,0,-2))+",0 and "+minusRoot(1,0,-2)+",0"))){
            System.out.println("findRoots test passed");
        } else System.out.println("findRoots test failed");

        if(xSymTest(1,0,-2,0)){
            System.out.println("X Sym test passed");
        } else System.out.println("X Sym test failed");

        if(yVertexTest(1,0,-2,-2)){
            System.out.println("Y Vertex test passed");
        } else System.out.println("Y Vertex test failed\n\n");
    }


   public static double quadY(double x, double a, double b, double c){
      return x*x*a+x*b+c;
   }
   public static boolean quadYTest(double x, double a, double b, double c, double expected){
      if(quadY(x,a,b,c) == expected) return true;
      else return false;
      }
   public static double discriminant(double a, double b, double c){
      return b*b-4*a*c;
   }
   public static boolean discriminantTest(double a, double b, double c, double expected){
      if(discriminant(a,b,c) == expected) return true;
      else return false;
   }
   public static int numRoots(double a, double b, double c){
      if(b*b-4*a*c > 0) return 2;
      else if(b*b-4*a*c == 0) return 1;
      else return 0;
   }
   public static boolean numRootsTest(double a, double b, double c, double expected){
      if(numRoots(a,b,c)==expected) return true;
      else return false;
   }
   public static double plusRoot(double a, double b, double c){
      if (b*b-4*a*c<0) return (Double.NaN);
      else return ((-b+Math.sqrt(b*b-4*a*c))/(2*a));
   }
   public static boolean plusRootTest(double a, double b, double c, double expected){
      if(plusRoot(a,b,c)==expected) return true;
      else return false;
   }
   public static double minusRoot(double a, double b, double c){
      if (b*b-4*a*c<0) return (Double.NaN);
      else return ((-b-Math.sqrt(b*b-4*a*c))/(2*a));
   }
   public static boolean minusRootTest(double a, double b, double c, double expected){
      if(minusRoot(a,b,c)==expected) return true;
      else return false;
   }
   public static String findRoots(double a, double b, double c){
      if(b*b-4*a*c > 0) return Double.toString(((-b+Math.sqrt(b*b-4*a*c))/(2*a)))+",0 and "+ Double.toString(((-b-Math.sqrt(b*b-4*a*c))/(2*a))) + ",0";
      else if(b*b-4*a*c == 0) return Double.toString(-b/(2*a)) + ",0";
      else return "";
   }
   public static boolean findRootsTest(double a, double b, double c, String expected){
      if(findRoots(a,b,c).equals(expected)) return true;
      else return false;
   }
   public static double xSym(double a, double b, double c){
      return (-b/(2*a));
   }
   public static boolean xSymTest(double a, double b, double c, double expected){
      if(xSym(a,b,c)==expected) return true;
      else return false;
   }
   public static double yVertex(double a, double b, double c){
    double x = xSym(a,b,c);  
    return a*x*x+b*x+c;
   }
   public static boolean yVertexTest(double a, double b, double c, double expected){
      if(yVertex(a,b,c)==expected) return true;
      else return false;
   }
}