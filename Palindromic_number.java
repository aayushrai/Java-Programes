
public class Main
{
	public static void main(String[] args) {
	    int n,p,rev,count=0;
	    for(int i=10;i<1000;i++){
	        rev=0;
	        n = i;
	    while(n !=0){
	         p = n%10;
	         rev = rev*10+p;
	         n = n/10;
	       }
	        if(i == rev){
	            System.out.println(i);
	            count +=1;
	        }
	    }
	    System.out.println("count:"+count);
	}
}