package myapp;

public class Todo {
    
    public static void main(String[] args) {

        // Create an array of 3 String element
        String[] task = new String[3];

        task[0] = "running";
        task[1] = "eating";
        task[2] = "sleeping";

        int index = 0;

        while (index < task.length) {
            System.out.printf("%d: %s\n", index, task[index]);
            index++;
        }
        
    }

}
