class defVal {
    // Class name should follow CamelCase

    int x; // Default value is 0
    boolean y; // Default value is false

    // The JVM provides a default constructor: defVal() {}

    public static void main(String[] args) {

        defVal dv =new defVal();

        System.out.println("Default Value is : " + dv.x);  // Outputs: 0
        System.out.println("Default Value is : " + dv.y);  // Outputs false



    }
}
