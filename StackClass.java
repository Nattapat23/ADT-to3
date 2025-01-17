
import java.util.Vector;

public class StackClass {
    private Vector<Students> MyStack = new Vector<>();
    /**
     * in this code not have StackisFull because I use Vector it not full
     */
    
    

    public StackClass(){

    }

    public void push(String firstName , double GPA, String SID) {
        System.out.println("Push : " + "[" + firstName +", GPA : "+GPA+", SID : "+SID+"]");
       MyStack.addElement(new Students(firstName, GPA, SID));
           
    }
    
    public Students poop(){
        Students temp ;
        if (!StackEmpty()) {
            temp = MyStack.elementAt(MyStack.size()-1);
            MyStack.removeElementAt(MyStack.size()-1);
            return temp ;
        }else{
            System.out.println( "Stack is Empty ");
            return null ;
        }
         
    }

    public Students peek(){

        return MyStack.elementAt(MyStack.size()-1);
    }

    public boolean StackEmpty(){
        return MyStack.isEmpty();
    }
    public int getSiza(){
        return MyStack.size() ;
    }

    public void printStack(){
        System.out.println("Element in Stack ");
       for(Students d : MyStack){
            System.out.println(d);
        };
    }





}
