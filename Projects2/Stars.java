public class Stars{
    public static void A(){
        int limiter = 10;
        System.out.print("\n"); 
        for(int a = 1;a<=limiter;a++) {
            System.out.print("*");
            if(a==limiter){
                System.out.print("\n"); 
                limiter--;
                a=0;
            }
        }
    }

    public static void B(){
        String star = "*";
        String newstar = "";
        for(int i=0;i<11;i++) {
            System.out.print(newstar);//silly - just use println
            System.out.print("\n");
            newstar = newstar + star;
        }
    }

    public static void C(){
        System.out.print("\n");
        String newstar = "**********";
        for(int i=0;i<11;i++) {
            System.out.print(newstar);
            System.out.print("\n");
            newstar = newstar.replaceFirst("[*]"," ");
        }
    }

    public static void D(){
        String start = "    ";
        String content = "*";  
        
        String start1 = "";
        String content1 = "*********"; 
        
        for(int i = 0;i<4;i++){
            System.out.println(start+content);
            start = start.substring(1);
            content = content + "**";   
        }
        System.out.println(content1);
        for(int i = 0;i<4;i++){
            System.out.println(start1+content1);
            content1 = content1.substring(2);
            start1 = start1 + " ";   
        }
        System.out.println("    *");
    }

    public static void main(){
        A();
        B();
        C();
        D();
    }
}