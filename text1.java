import java.util.Scanner;




class NumberBeginningEnding{
    public static void main(String[] args) {
        int i=1;
        if(i<=100){
            for(int j=100;j>1;j--){
                System.out.print(i+","+j+",");
                i=i+1;
            }
        }
    }
}



class sumupto10{
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=10;i++){
            System.out.println(i*i);
            int num=i*i;
            sum=sum+num;
        }
        System.out.print(sum);
    }
}

class game{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        int age = sc.nextInt();
            if(age<5){
                System.out.println("babby");
                break;
            }
            else if(age>=5 && age<=10){
                System.out.println("toddler");
                
            }
            else if(age>10 && age<=18){
                System.out.println("tenantes");
            
            }
            else if(age>18 && age<=25){
                System.out.println("adult");
            
            
            }
            else{
                System.out.println("Grown old");
            
            }
        
        }
        sc.close();
    }
}

class Last3digit{
    public static void main(String[] args) {
        int num=1557890;
        //System.out.println(num%1000);
        int newnum=0;
        for(int i=1;i<=3;i++){
            newnum=num%10;
            num=num/10;
            System.out.print(newnum);
            
        }
    }
}

class PrimeNumber {  
  
    public static void main(String[] args) {  
        Scanner s = new Scanner(System.in);  
        System.out.print("Enter a number : ");  
        int n = s.nextInt();  
        if (isPrime(n)) {  
            System.out.println(n + " is a prime number");  
        } else {  
            System.out.println(n + " is not a prime number");  
        }  
        s.close();
    }  
   
    public static boolean isPrime(int n) {  
        if (n <= 1) {  
            return false;  
        }  
        for (int i = 2; i < n/2; i++) {  
            if (n % i == 0) {  
                return false;  
            }  
        }  
        return true;  
    }  
 }  
