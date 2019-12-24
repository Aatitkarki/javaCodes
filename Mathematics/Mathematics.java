
public class Mathematics{
	public float average(int a,int b){
		int sum = a+b;
		float average = sum/2;
		return average;
	}

	public float average(int array[]){
		int sum =0;
		float value=0;
		for(int i=0;i<array.length;i++){
			sum +=array[i];
			value = sum/array.length;
		}
		return value;
	}

	public int power(int a,int b){
		int power=1;
		for(;b!=0;b--){
			power *=a; 
		}
		return power;
	}
	public boolean Prime(int n){
		boolean isPrime=true;
		if(n==0 || n==1){
			isPrime=false;
		}
		for(int i=2;i<n;i++){
			if(n%i == 0){
				isPrime= false;
			}
		}
		if(isPrime==true){
				isPrime= true;
			}
			
		return isPrime;
	}
}