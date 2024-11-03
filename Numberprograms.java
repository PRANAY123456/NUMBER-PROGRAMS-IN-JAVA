import java.util.Scanner;
class Numberprograms
{
	public String palindrome(int n)
	{
		int rem=0,rev=0,temp=n;                          
		while(n>0)                                       
		{                                                
			rem=n%10;                                    
			rev=(rev*10)+rem;                            
			n=n/10;                                      
		}                                                
		if(temp==rev)                                    
		{                                                
		return"palindromenumber";          
		}                                                
		else                                             
		{                                                
			return "not a palindromenumber";
		} 
	}
	public String primenumber(int n)
	{ 
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
		  return "primrnumber";
		}
		else
		{
			return "not a primrnumber"; 
		}
	}
	public int lcm(int a,int b)
	{
		int temp=0;               
		for (int i=1; i>0;i++)    
		{                         
			if (i%a==0 && i%b==0) 
			{                     
				temp=i;           
				break;            
			}                     
		}                         
		return temp;
	}
	public String strongnumber(int n)
	{
		int sum=0,fact,rem=0,temp=n;         
			while (n>0)                      
			{                                
				fact=1;                      
				rem=n%10; 
			for(int i=rem;i>=1;i--)
		{
				fact=fact*i;
		}
				sum=sum+fact;                
				n=n/10;                      
			}                                
			if (temp==sum)                   
			{                                
				return "Strong number";      
			}                                
			else                             
		{                                    
				return "Not a strong number";
		} 
	}
	public String happynumber(int n)
	{
		int sum,rem=0,temp=0;                         
		while(n>9)                                    
		{                                             
			sum=0;                                    
			while(n>0)                                
			{                                         
				rem=n%10;                             
				temp=rem*rem;                         
			    n=n/10;                               
				sum=sum+temp;                         
			}                                         
			n=sum;                                    
		}                                             
		if(n==1||n==7)                                
		{                                             
		  return "happynumber";           
		}                                             
		else                                          
		{                                             
			return "not a happynumber";  
		} 
	}
	public int factorial(int n)
	{
		int fact=1;
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	public void fibonacci(int n)
	{
			int sum=0,n1=1,n2=1;                
			for(int i=1;i<=n;i++)             
			{                                 
				sum=n1+n2; 
				System.out.println(n1); 
				n1=n2;                        
				n2=sum;                             
			} 
	}
	public String neonnumber(int n)
	{
		int sum=0,rem=0,temp;                         
		temp=n*n;                                     
		 while(temp>0)                                
		 {                                            
			rem=temp%10;                              
			temp=temp/10;                             
			sum=sum+rem;                              
		 }                                            
		 if(sum==n)                                   
		{                                             
			 return "neon number";       
		}                                             
		else                                          
		{                                             
			return "not a neon number";  
		} 
	}
	public String perfectsquare(int n)
	{
			int count=0;                                 
			for(int i=1;i<=n;i++)                        
			{                                            
				if(n==i*i)                               
				{                                        
					count++;                             
					break;                               
				}                                        
			}                                            
			if(count==1)                                 
			{                                            
				return "perfectsquare";     
			}                                            
			else                                         
			{                                            
				return "not aperfectsquare";
			} 
	}
	public String spynumber(int n)
	{
		 int sum=0,rem=0,product=1;              
		while(n>0)                              
		{                                       
			rem=n%10;                           
			n=n/10;                             
			sum=sum+rem;                        
			product=product*rem;                
		}                                       
		if(sum==product)                        
		{                                       
		 return "spynumber";       
		}                                       
		else                                    
		{                                       
		 return "not a spynumber"; 
		}
	}
	public void fizzbuzz(int n)
	{
		if(n%3==0 && n%5==0)
		{
			 System.out.println("fizzbuzz");
		}
		else if(n%5==0)
		{
			System.out.println("buzz");
		}
		else if(n%3==0)
		{
				System.out.println("fizz");
		}
		else
		{
				System.out.println(n);
		}
	}
	public String sunnynumber(int n)
	{
		boolean flag=false;
		for(int i=1;i<=n;i++)
		{
			if(n==(i*i)-1)
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			return "sunnynumber";
		}
		else
		{
			return " not a sunnynumber";
		}
	}
	public void swap(int a,int b)
	{
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a:"+a+" " +"b:"+b);
	}
    public String perfectnumber(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)                           
		{                                              		
			if(n%i==0)                                 
			{                                          
				sum=sum+i;                             
			}                                          
		}                                              
		if(sum==n)                                     
		{                                              
			return "perfectnumber";       
		}                                              
		else                                           
		{                                              
			return "not a perfectnumber"; 
		}
	}
	public void multiplication(int n)
	{
       for(int i=1;i>0;i++)
		{
		   System.out.println(n*i);
		if(i==10)
			{
			break;
			}
		}
	}
	public static void main(String[] args)
	{
		Numberprograms a1=new Numberprograms();
		Scanner sc=new Scanner(System.in);
		System.out.println("1:palindrome\n 2:primenumber\n 3:lcm\n 4:strongnumber\n5:happynumber\n 6:factoraial\n 7:fibonacci\n 8:neonnumber\n 9:perfectsquare\n 10:spynumber\n 11:fizzbuzz\n 12:sunnynumber\n 13:swap\n 14:perfectnumber\n 15:multiplication");
		System.out.println("select the program");
		int program=sc.nextInt();
		
		switch(program)
		{
			case 1:System.out.println("palindrome");
			System.out.println("enter the number");
			System.out.println(a1.palindrome(sc.nextInt()));
			break;
			case 2:System.out.println("primenumber");        
			System.out.println("enter the number");         
			System.out.println(a1.primenumber(sc.nextInt()));
			break;
			case 3:System.out.println("lcm");                                                 
			System.out.println("enter the numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(a1.lcm(a,b));
			break;
			case 4:System.out.println("strongnumber");                                                  
			System.out.println("enter the number");         
		    System.out.println(a1.strongnumber(sc.nextInt()));
			break; 
			case 5:System.out.println("happynumber");        
			System.out.println("enter the number");         
			System.out.println(a1.happynumber(sc.nextInt()));
			break; 
			case 6:System.out.println("factorial");        
			System.out.println("enter the number");         
			System.out.println(a1.factorial(sc.nextInt()));
			break; 
			case 7:System.out.println("fibonacci");        
			System.out.println("enter the number");         
			a1.fibonacci(sc.nextInt());
			break; 
			case 8:System.out.println("neonnumber");        
			System.out.println("enter the number");         
			System.out.println(a1.neonnumber(sc.nextInt()));
			break; 
			case 9:System.out.println("perfectsquare");        
			System.out.println("enter the number");         
			System.out.println(a1.perfectsquare(sc.nextInt()));
			break; 
			case 10:System.out.println("spynumber");        
			System.out.println("enter the number");         
			System.out.println(a1.spynumber(sc.nextInt()));
			break; 
			case 11:System.out.println("fizzbuzz");        
			System.out.println("enter the number");         
			a1.fizzbuzz(sc.nextInt());
			break; 
			case 12:System.out.println("sunnynumber");        
			System.out.println("enter the number");         
			System.out.println(a1.sunnynumber(sc.nextInt()));
			break; 
			case 13:System.out.println("swap");        
			System.out.println("enter the numbers");         
			a1.swap(sc.nextInt(),sc.nextInt());
			break; 
			case 14:System.out.println("perfectnumber");        
			System.out.println("enter the number");         
			System.out.println(a1.perfectnumber(sc.nextInt()));
			break; 
			case 15:System.out.println("multiplication");        
			System.out.println("enter the number");         
			a1.multiplication(sc.nextInt());
			break; 
			
			default:System.out.println("program doesnot exist");
		}
	}
}