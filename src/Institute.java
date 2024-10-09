public class Institute {

    String  name;  // Instance variable

    Institute (){
        // Constructor assigns a default value to 'name'
        name="IDET";
    }

    public static void main(String[] args) {
        Institute i =new Institute();// Object creation

        System.out.println("Hello World"); //outputs - Hello World
        System.out.println("Institute name is:"+i.name);
        //outputs -Institute name is:IDET

    }
}
