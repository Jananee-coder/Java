class Language {

    String lName;// Variable to store the language name

    // Constructor takes a language name as a parameter and prints a message
    Language(String   language){

        lName=language;

        System.out.println(lName +" is a Language!");
    }

    public static void main(String[] args) {

        // Creates objects of the Language class, passing different language names
        Language l=new Language("Sinhala");
        Language l1=new Language("English");
        Language l2=new Language("Tamil");
        Language l3=new Language("Java");
    }
}