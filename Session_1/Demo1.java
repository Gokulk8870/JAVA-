public class Demo1 {  // Class name changed to 'Demo1' (PascalCase)
    public int value() {  
        int a = 10;  
        System.out.println("inside of value");  
        return a;  
    }

    public static void main(String[] args) {  
        Demo1 b = new Demo1();  // Object creation
        System.out.println(b.value());  // Calling method and printing the returned value
    }
}
