public class Quadratic{
   public static double quadY(double x, double a, double b, double c){
      return x*x*a+x*b+c;
   }
   public static boolean quadYTest(double x, double a, double b, double c, double expected){
      if(quadY(x,a,b,c) == expected) return true;
      else return false;
      }
   public static double discriminant(double a, double b, double c){
      if(b*b-4*a*c >=0)return b*b-4*a*c;
      else return -1;
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
      if (b*b-4*a*c<0) return (1/0);
      else return ((-b+Math.sqrt(b*b-4*a*c))/(2*a));
   }
   public static boolean plusRootTest(double a, double b, double c, double expected){
      if(plusRoot(a,b,c)==expected) return true;
      else return false;
   }
   public static double minusRoot(double a, double b, double c){
      if (b*b-4*a*c<0) return (1/0);
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
      return c-b/(2*a)*b/2;
   }
   public static boolean yVertexTest(double a, double b, double c, double expected){
      if(yVertex(a,b,c)==expected) return true;
      else return false;
   }
}