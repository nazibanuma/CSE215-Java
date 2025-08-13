package exception_throws;

public class Exception_throws{ 

    public static double area(int radius) throws MyException{
        if(radius < 0){
            throw new MyException();
        }
        double ar = Math.PI * radius * radius;
        return ar;
    }

    public static void main(String[] args) {
        
        try{
            System.out.println("area is :"+area(1));
            area(-1);
         
        }catch(MyException e){
            System.out.println("Exception: "+e);
            
        }
           
      

    }

}
