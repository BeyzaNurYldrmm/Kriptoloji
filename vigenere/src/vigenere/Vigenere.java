package vigenere;

import java.util.Scanner;

public class Vigenere {
     
    public static void vigenerePas(String s, String a){
        char[] alf={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','y','z'};
        char[] key=a.toCharArray();
        int[] key_c= new int[key.length];
        char[] pas=s.toCharArray();
        int[] pas_c= new int[pas.length];
        char[] new_pas=new char[pas.length];
        int i=0;
        int y=0;
        for(;i<key.length;i++){
            y=0;
            for(;y<23;y++){
                if(key[i]==alf[y]){
                    key_c[i]=y;
                    break;
                }
               
            }
        }
        
        for(i=0;i<pas.length;i++){
            y=0;
            for(;y<23;y++){
                if(pas[i]==alf[y]){
                    pas_c[i]=y;
                    break;
                }              
            }
        }
        for( i=0;i< pas.length;){
            for(y=0;y< key.length;y++){                
                    pas_c[i]= pas_c[i] + key_c[y];
                    i++;
            }
        } 
        int b;
        System.out.print("oluşan şifre: ");
        for(i=0;i<pas_c.length;i++){
            b=pas_c[i]%23;
            new_pas[i]=alf[b];
            System.out.print(new_pas[i]);
        }   
        System.out.println("");
        
       
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Password: ");
        String pas=s.nextLine();
        System.out.print("a: ");
        String a=s.nextLine();
         pas=pas.toLowerCase();
         pas=pas.replace(" ","");
        System.out.println("--*--*--*--*--*--");
        vigenerePas(pas,a);
        System.out.println("--*--*--*--*--*--");
    }
    
}
