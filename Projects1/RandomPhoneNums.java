import java.text.DecimalFormat;
import java.util.Random;

public class RandomPhoneNums {
    public static void main() {
        Random r = new Random();
        DecimalFormat d1 = new DecimalFormat("000");
        DecimalFormat d2 = new DecimalFormat("0000");
     
        int sec1 = (r.nextInt(7) + 1) * 100 + (r.nextInt(8) * 10) + r.nextInt(8);
        int sec2 = r.nextInt(743);
        int sec3 = r.nextInt(10000);
       
        int sec4 = (r.nextInt(7) + 1) * 100 + (r.nextInt(8) * 10) + r.nextInt(8);
        int sec5 = r.nextInt(743);
        int sec6 = r.nextInt(10000);
        
        int sec7 = (r.nextInt(7) + 1) * 100 + (r.nextInt(8) * 10) + r.nextInt(8);
        int sec8 = r.nextInt(743);
        int sec9 = r.nextInt(10000);
        
        int sec10 = (r.nextInt(7) + 1) * 100 + (r.nextInt(8) * 10) + r.nextInt(8);
        int sec11 = r.nextInt(743);
        int sec12 = r.nextInt(10000);
        
        int sec13 = (r.nextInt(7) + 1) * 100 + (r.nextInt(8) * 10) + r.nextInt(8);
        int sec14 = r.nextInt(743);
        int sec15 = r.nextInt(10000);
       
        int sec16 = (r.nextInt(7) + 1) * 100 + (r.nextInt(8) * 10) + r.nextInt(8);
        int sec17 = r.nextInt(743);
        int sec18 = r.nextInt(10000);
        
        int sec19 = (r.nextInt(7) + 1) * 100 + (r.nextInt(8) * 10) + r.nextInt(8);
        int sec20 = r.nextInt(743);
        int sec21 = r.nextInt(10000);
        
        int sec22 = (r.nextInt(7) + 1) * 100 + (r.nextInt(8) * 10) + r.nextInt(8);
        int sec23 = r.nextInt(743);
        int sec24 = r.nextInt(10000);
       
        int sec25 = (r.nextInt(7) + 1) * 100 + (r.nextInt(8) * 10) + r.nextInt(8);
        int sec26 = r.nextInt(743);
        int sec27 = r.nextInt(10000);
        
        int sec28 = (r.nextInt(7) + 1) * 100 + (r.nextInt(8) * 10) + r.nextInt(8);
        int sec29 = r.nextInt(743);
        int sec30 = r.nextInt(10000);
        
        System.out.println(d1.format(sec1) + "-" + d1.format(sec2) + "-" + d2.format(sec3));
        System.out.println(d1.format(sec4) + "-" + d1.format(sec5) + "-" + d2.format(sec6));
        System.out.println(d1.format(sec7) + "-" + d1.format(sec8) + "-" + d2.format(sec9));
        System.out.println(d1.format(sec10) + "-" + d1.format(sec11) + "-" + d2.format(sec12));
        System.out.println(d1.format(sec13) + "-" + d1.format(sec14) + "-" + d2.format(sec15));
        System.out.println(d1.format(sec16) + "-" + d1.format(sec17) + "-" + d2.format(sec18));
        System.out.println(d1.format(sec19) + "-" + d1.format(sec20) + "-" + d2.format(sec21));
        System.out.println(d1.format(sec22) + "-" + d1.format(sec23) + "-" + d2.format(sec24));
        System.out.println(d1.format(sec25) + "-" + d1.format(sec26) + "-" + d2.format(sec27));
        System.out.println(d1.format(sec28) + "-" + d1.format(sec29) + "-" + d2.format(sec30));  
    }
}