package sezar_sifreleme;
import java.util.Scanner;
public class Sezar_sifreleme {
  
  public static void sezarSifrele(String s){
      char[] alfabe= {'a','b','c','d','e','f','g','h','k','l','m','n','o','i','u','j','p','r','s','t','v','y','z'};      
      char[] sifre=s.toCharArray();     
          for(int y=0;y<s.length();y++){ 
              int i=0;
              while(true){                 
                if(sifre[y] == alfabe[i]){ 
                    if(i==21){
                    sifre[y]='a';        
                    break; 
                    }   
                    else if(i==22){
                    sifre[y]='b';        
                    break; 
                    } 
                    else{
                    sifre[y]=alfabe[i+2];        
                    break;  
                    }
                }
                else{i++; if(i==23){i=0;}    }
              }
              
          }
        for(int a=0;a<sifre.length;a++){
            System.out.print(sifre[a]);
        }        
  }
    
    public static void main(String[] args) { 
      
      Scanner s=new Scanner(System.in);
      System.out.println("Sifre: ");
      String sifre= s.nextLine();
      sezarSifrele(sifre.replace(" ",""));
      
    }
    
}
