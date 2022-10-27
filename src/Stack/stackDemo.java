package Stack;

public class stackDemo {
    public static void main(String[] args) {
        stack_class<String> stack = new stack_class<String>(5);
        stack.push("mohammed");
        stack.push("masa");
        stack.push("zahraa");
        System.out.println(stack.top);
        stack.push("alaa");
        stack.push("hasam");
        System.out.println(stack.top);
        stack.push("ameen");
    }
}
