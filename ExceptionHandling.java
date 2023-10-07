import java.io.*;
import java.util.Scanner;

class myException extends Exception{
    myException(String msg){
        super(msg);
    }
    void fun(){
        System.out.println("Hello this is fun exception");
    }
}


public class ExceptionHandling {
    static int devide(int a,int b) throws myException{
        if(b==0){
            throw new myException("denominator must not be zero");
        }
        else{
            return a/b;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        try{
             //c=a/b;
             c=devide(a,b);
            //  int arr[]=new int[5];
            //  for(int i=0;i<=5;i++){
            //     arr[i]=i;
            //  }

        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(myException e){
            e.fun();
        }
        finally{
            System.out.println("finally");
        }

        System.out.println("Output : "+c);

        // try{
        //     FileInputStream fs=new FileInputStream("d:/DOCUMENTS/Oops in java/abc.txt");
        // }catch(Exception e){

        // }
        sc.close();
    }
}
