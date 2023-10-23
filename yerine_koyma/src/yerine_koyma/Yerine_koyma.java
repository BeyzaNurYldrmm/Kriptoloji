package yerine_koyma;

import java.util.Scanner;

public class Yerine_koyma {
   static char[] alf={'a','b','c','d','e','f','g','h','l','m','n','p','o','r','s','i','j','k','u','v','y','z'};
   static char[] nalf={ 'p','o','r','s','i','z','l','m','n','a','b','j','k','u','v','y','c','d','e','f','g','h'};
    
    public static void newSifre(String s){
        char[] c=s.toCharArray();
        
        for(int i=0;i<c.length;i++){
            int y=0;
            while(true){
                if(c[i]== alf[y]){
                    c[i]=nalf[y];
                    break;
                } 
                else{
                    y++;
                    if(y==21){y=0;}
                }
                
            }
           
        }
        System.out.print("oluşan şifre: ");
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]);
        }
        System.out.println("");
        
    }
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Password: ");
        String pas=s.nextLine();
        pas=pas.toLowerCase();
        System.out.println("--*--*--*--*--*--");
        newSifre(pas.replace(" ",""));
        System.out.println("--*--*--*--*--*--");
    }
    
}
