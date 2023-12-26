public class Module1 {

    public static void printString(String hello){
        System.out.println(hello);
    }
    public static void main(String[] args) throws Exception {
        //Bai1
        /*System.out.println("Hello World!");
        */

        //Bai2
        /*String helloWorld = "Hello World!";
        System.out.println(helloWorld);
        */

        //Bai3 
        String hello = "Hello";
        String world = "World";
        String helloWorld = hello + " " + world;
        System.out.println(helloWorld);
        
        //Bai4
        printString(helloWorld);


    }
}
