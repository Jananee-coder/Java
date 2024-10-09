class School {

    private int studentCount;// Variable to store the number of students

    // Constructor initializes studentCount
    School(){
        System.out.println("Constructor called 1 st");// This message indicates the constructor runs first
        studentCount=5468;//Assigns 5468 to studentCount

        // =  (Assignment Operator): Used to assign a value to a variable.
        // == (Equality Operator): Used to compare two values to check if they are equal.
    }

    public static void main(String[] args) {
        School s=new School(); // Creates a new School object, invoking the constructor
        System.out.println("Student count is:"+s.studentCount);// Prints the student count
    }
}

