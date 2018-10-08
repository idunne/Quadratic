public class Quadratic{
   public static double quadY(double x, double a, double b, double c){
      return x*x*a+x*b+c;
   }
   public static double discriminant(double a, double b, double c){
      if(b*b-4*a*c >=0)return b*b-4*a*c;
      else return -1;
   }
   public static int numRoots(double a, double b, double c){
      if(b*b-4*a*c > 0) return 2;
      else if(b*b-4*a*c == 0) return 1;
      else return 0;
   }
   public static double plusRoot(double a, double b, double c){
      if (b*b-4*a*c<0) return (1/0);
      else return ((-b+Math.sqrt(b*b-4*a*c))/(2*a));
   }
   public static double minusRoot(double a, double b, double c){
      if (b*b-4*a*c<0) return (1/0);
      else return ((-b-Math.sqrt(b*b-4*a*c))/(2*a));
   }
   public static String findRoots(double a, double b, double c){
      if(b*b-4*a*c > 0) return Double.toString(((-b+Math.sqrt(b*b-4*a*c))/(2*a)))+",0 and "+ Double.toString(((-b-Math.sqrt(b*b-4*a*c))/(2*a))) + ",0";
      else if(b*b-4*a*c == 0) return Double.toString(-b/(2*a)) + ",0";
      else return "";
   }
   public static double xSym(double a, double b, double c){
      return (-b/(2*a));
   }
   public static double yVertex(double a, double b, double c){
      return c;
   }
}