import java.math.*;
import java.util.*;
public class Test1{  
		private Test1() {  
		}  
       public static double add(double v1, double v2) {  
		   BigDecimal b1 = new BigDecimal(Double.toString(v1));  
		   BigDecimal b2 = new BigDecimal(Double.toString(v2));  
		   return (b1.add(b2)).doubleValue();  
		}  
		public static double sub(double v1, double v2) {  
		   BigDecimal b1 = new BigDecimal(Double.toString(v1));  
		   BigDecimal b2 = new BigDecimal(Double.toString(v2));  
		   return (b1.subtract(b2)).doubleValue();  
		}  
		public static double mul(double v1, double v2) {  
		   BigDecimal b1 = new BigDecimal(Double.toString(v1));  
		   BigDecimal b2 = new BigDecimal(Double.toString(v2));  
		   return (b1.multiply(b2)).doubleValue();  
		}  
		public static double p(double v1, double v2) {
			   BigDecimal b1 = new BigDecimal(Double.toString(v1));
			   BigDecimal b2 = new BigDecimal(Double.toString(v2));
			   return (b1.divide(b2, BigDecimal.ROUND_HALF_UP)).doubleValue();
			}
	    public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			 double i=input.nextDouble();
			 double j=input.nextDouble();
			 input.close();
		   System.out.println("x+y="+String.format("%.8f",add(i,j)));
		   System.out.println("x-y="+String.format("%.8f",sub(i,j)));
		   System.out.println("x*y="+String.format("%.8f",mul(i,j)));
		   System.out.println("x/y="+String.format("%.8f",p(i,j)));
		    
		   }  
	}