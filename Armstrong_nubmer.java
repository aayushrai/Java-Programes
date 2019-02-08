public class Main
{
	public static void main(String[] args) {
	    int a,b,sum,count =0;
	    for(int i=0;i<999;i++){
	        sum = 0;
	   a = i;
	   for(int j=0;j<3;j++){
	    b = a%10;
	    a = a/10;
	    sum += (b*b*b);
	
	   }
	   	if(sum == i){
	   	    System.out.println("armstrong"+sum);
	   	    count += 1;
	   	}
	}
	    System.out.println("armstrong count:"+ count);
	}
}



