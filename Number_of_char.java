public class Main{

public static void main(String args[]){
    
      String s="abcdabc";
      int a=0,b=0,c=0;

      for(int i =0;i<s.length() ;i++){
    
          if(s.charAt(i) == 'a'){
               a+=1;
       }

if(s.charAt(i) == 'b'){
b+=1;
}

if(s.charAt(i) == 'c'){
    c+=1;
}

}
System.out.println (a+" - "+b+" - " +c ) ;
}

}