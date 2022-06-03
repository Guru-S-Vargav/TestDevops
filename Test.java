import java.util.*;
import java.io.*;
class Test{
	public static void main(String[] args) {
		
		System.out.println("hello woeld");	
	}
	
}
// class Test{
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
// 		String s=sc.nextLine();
// 		String str[]=s.split(" ");
// 		int sum=0,rev=0;
// 		for(int i=0;i<str.length;i++)
// 		{
// 			try
// 			{
// 				int d=Integer.parseInt(str[i]);
// 				int lastd=d%10;
// 				sum=sum+lastd;
// 			}
// 			catch(Exception e)
// 			{
// 				continue;
// 			}

// 		}
// 		if(sum==0)
// 			System.out.println("-1");
// 		else if(!checkPrime(sum))
// 		{
// 			while(sum != 0)   
// 			{  
// 				int d = sum % 10;  
// 				rev = rev * 10 + d;  
// 				sum/= 10;  
// 			} 
// 			if(!checkPrime(rev))
// 			{
// 				int nof=0;
// 				for(int i = 2; i< rev; i++) {
//         		 	while(rev%i == 0) {
//            				nof++;
//             				rev/=i;
//         			 }
//       			}
//      		 if(rev >2) {
//          			nof++;
//       			}
//       			System.out.println(nof);
// 			}
// 			else
// 			{
// 				System.out.println(rev);	
// 			}
// 		}
// 		else
// 			System.out.println(sum);
	
// 	}
// 	public static boolean checkPrime(int sum){
// 		for (int i = 2; i <= Math.sqrt(sum); ++i) {
//       		if (sum % i == 0) {
//         	return false;
//       }
      
// 	}
// 	return true;
// }
// }
// class Test{
// 	public static void main(String[] args) {
// 			Scanner sc = new Scanner(System.in);
// 				int m = sc.nextInt();
// 				String str[][]=new String[m][];
// 				for(int i=0;i<m;i++)
// 				{
// 					String s=sc.next();
// 					str[i]=s.split(",");
// 				}
// 				int arr[][]=new int[m][str[0].length];
// 				for(int i=0;i<m;i++)
// 				{
// 					for(int j=0;j<str[0].length;j++)
// 					{
// 						arr[i][j]=Integer.parseInt(str[i][j]);
// 					}
// 				}

// 				int curSum=0;
// 				ArrayList<Integer> arrSum=new ArrayList<>();
// 				for (int i = 0; i < m; i++)
//         		{
// 	            if (i % 2 == 0)
// 	            {
// 	                for (int j = 0; j < arr[0].length; j++)
// 	                {
// 	                	curSum+=arr[i][j];
// 	                	double check=Math.sqrt(curSum);
// 	                	if(check-Math.floor(check)==0)
// 	                	{
// 	                		arrSum.add(curSum);
// 	                		curSum=0;
// 	                	}

// 	                }
	                   
	  
	  
// 	            // If current row is odd, print from
// 	            // right to left
// 	            }
// 	            else
// 	            {
// 	                for (int j = arr[0].length - 1; j >= 0; j--)
// 	                    {
// 	                    	curSum+=arr[i][j];
// 	                	double check=Math.sqrt(curSum);
// 	                	if(check-Math.floor(check)==0)
// 	                	{
// 	                		arrSum.add(curSum);
// 	                		curSum=0;
// 	                	}
// 	                    }
// 	            }

// 			}
// 			if(arrSum.size()==0)
// 				System.out.println("-1");
// 			else
// 			{
// 				System.out.println(Collections.max(arrSum));
// 			}	
// }
// }

// class A
// {
// 	void a1()
// 	{
// 		System.out.println("a1 method of A");
// 	}
// 	void a2()
// 	{
// 		System.out.println("a2 method of A");
	
// 	}void a3()
// 	{
// 		System.out.println("a3 method of A");
// 	}

// }
// class B extends A
// {
// 	void a1()
// 	{
// 		System.out.println("a1 method of B");
// 	}
// 	void a2()
// 	{
// 		System.out.println("a2 method of B");
	
// 	}
// 	void a5()
// 	{
// 		System.out.println("asdasdasd");
// 	}
// }

// class C
// {
// 	public static void main(String[] args) {
// 		A a=new B();
// 		B b=new B();

// 		a.a1();
// 		b.a1();
// 		//a.a5();
// 		b.a5();

// 	}
// }

// class Solution {

	
// 	static boolean checkEquality(String s)
// 	{
// 		return (s.charAt(0) == s.charAt(s.length() - 1));
// 	}
	
// 	static int MaxSplit(String s)
// 	{
// 		int result = 0;
// 		int k = s.length();
// 		int i;
// 		int j,n;
// 		for(j=0;j<k;j++)
// 		{
// 			i=j;
// 			n=k;
// 		for (int len = 2; len <= n; len++)
// 		{
// 				// System.out.println(s.substring(i, i + len));
// 				// System.out.println(i+" -> "+(i+len));
// 				if((i+len)<= k)
// 				if (checkEquality(s.substring(i, i + len)))
// 				{
// 					// System.out.println(s.substring(i, i + len));
// 					i=i+len;
// 					n=n-len;
// 					len=1;
// 					result++;
// 				}
// 			}
// 			if(n==0)
// 				break;
// 		}
	
// 		return result;
// 	}
// 	public static void main(String args[])
// 	{
// 		Scanner scan = new Scanner(System.in);
// 		String S=scan.nextLine();
// 		int result=MaxSplit(S);
// 		System.out.println(result);
// 	}
// }




// class LongestRepeatingSequence {  
// 	static int count=0;
//     //Checks for the largest common prefix  
//     public static String lcp(String s, String t){  
//         int n = Math.min(s.length(),t.length());  
//         for(int i = 0; i < n; i++){  
//             if(s.charAt(i) != t.charAt(i)){  
//                 return s.substring(0,i);  
//             }  
//         }  
//         count++;
//         return s.substring(0,n);  
//     }  
      
//     public static void main(String[] args) {  
//     	Scanner sc=new Scanner(System.in);

//         String str = sc.nextLine();  
//         String lrs="";  
//         int n = str.length();  
//         for(int i = 0; i < n; i++){  
//             for(int j = i+1; j < n; j++){  
                 
//                 String x = lcp(str.substring(i,n),str.substring(j,n));  
                
//                 if(x.length() > lrs.length()) lrs=x;    
//             }  
//         }  
//         System.out.println("Longest repeating sequence: "+lrs+count);  
//     }  
// }  

// class Test
// {
// 	public static void main(String[] args) throws IOException{
// 		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer token= new StringTokenizer(br.readLine());
// 		int r=Integer.parseInt(token.nextToken());
// 		int c=Integer.parseInt(token.nextToken());
// 		List<Integer> li=new ArrayList<>();
// 		for(int i=0;i<r;i++)
// 		{
// 			StringTokenizer ntoken= new StringTokenizer(br.readLine());
// 			li.add(Integer.parseInt(ntoken.nextToken(),2));
// 		}
// 		int output= li.indexOf(Collections.max(li)) + 1;
// 		System.out.println(output);

// 	}
// }

// class Test
// {
// 	static String findOcuurances(String s)
// 	{
// 		long countN = s.chars().filter(ch -> ch == 'N').count();
// 		long countS = s.chars().filter(ch -> ch == 'S').count();
// 		long countE = s.chars().filter(ch -> ch == 'E').count();
// 		long countW = s.chars().filter(ch -> ch == 'W').count();

// 		if( countN-countS==0 && countE-countW==0)
// 			return "Returned Successfully";
// 		else
// 			return "Not Returned Successfully";
// 	}
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
// 		String s=sc.next();
// 		System.out.println(findOcuurances(s)); 
// 	}
// }

// class Test
// {
// 	static int digSum(int n)
//     {
//         if (n == 0)
//         return 0;
//         return (n % 9 == 0) ? 9 : (n % 9);
//     }
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
// 		int N=sc.nextInt();
// 		int output=digSum(N);
// 		if(output==1)
// 			System.out.println("UNO");
// 		else
// 			System.out.println("NOT UNO");
// 	}
// }
// class SolutionClass
// {
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
// 		String n=sc.next();
// 		System.out.println(aritmetic(n)); 
// 	}
// 	static int aritmetic(String s)
// 	{
// 		int plus=s.indexOf('+');
// 		int x=s.indexOf('X');
// 		int equal=s.indexOf('=');
// 		int len=s.length();
// 		int output=0;
		
// 		if(x==len-1)
// 		{
			
// 			output=Integer.parseInt(s.substring(0,plus))+Integer.parseInt(s.substring(plus+1,equal));
// 		}
// 		else if(x>plus)
// 		{
// 			output=Integer.parseInt(s.substring(equal+1,len))-Integer.parseInt(s.substring(0,plus));
// 		}
// 		else
// 		{
// 			output=Integer.parseInt(s.substring(equal+1,len))-Integer.parseInt(s.substring(plus+1,equal));
// 		}
// 		return output;
// 	}
// }
// 	static int findSum(int n,int k)
// 	{
// 		int l=n/k;
// 		int res=(n*(n+1))/2;
// 		int lastVal=res-(k*(l*(l+1))/2);
// 		return lastVal;
// 	}
// }
// class TestClass
// {
// 	private int a=10;
// 	protected void display()
// 	{
// 		System.out.println(a);
// 	}
// 		public static void main(String[] args) {

// 			new TestClass().display();
// 		}
// }
