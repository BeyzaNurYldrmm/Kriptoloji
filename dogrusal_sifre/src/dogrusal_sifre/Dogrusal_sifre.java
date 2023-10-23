package dogrusal_sifre;

import java.util.Scanner;

public class Dogrusal_sifre {
 static char[] alf={'a','b','c','d','e','f','g','h','l','m','n','p','o','r','s','i','j','k','u','v','y','z'};
     
    public static void newSifre(String s,int a, int b){
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            int y=0;
            while(true){
                if(c[i]== alf[y]){
                    if((a*y+b)>=21){
                    c[i]=alf[(a*y+b)%21];
                    }
                    else if((a*y+b)<=21){
                    c[i]=alf[a*y+b];
                    break;
                } 
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
        System.out.print("a: ");
        int a=s.nextInt();
        System.out.print("b: ");
        int b=s.nextInt();
        pas=pas.toLowerCase();
        System.out.println("--*--*--*--*--*--");
        newSifre(pas.replace(" ",""),a,b);
        System.out.println("--*--*--*--*--*--");
    }
    
}
