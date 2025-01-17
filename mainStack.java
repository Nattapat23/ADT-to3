

public class mainStack {
    public static void main(String[] args) {
        StackClass st = new StackClass();

        System.out.println();
        st.push("Natthapat", 3.65, "01");
        st.push("metavee",3.89, "02");//push 7 obj
        st.push("Phu", 3.64, "03");
        st.push("Namo", 3.22, "04");
        st.push("Fha", 3.55, "05");
        st.push("Guy", 3.65, "06");
        st.push("Jo", 3.54, "07");
        System.out.println();
        st.printStack();
        System.out.println();
        System.out.println("Peek : "+st.peek());
        System.out.println("Pop is : "+st.poop());
        System.out.println("Pop is : "+st.poop());
        System.out.println("Pop is : "+st.poop());
        System.out.println("element left in stack is : "+ st.getSiza());


    }
}
