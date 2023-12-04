public class TaskManager {

    class Task{
        String taskDescription;
        String taskStatus;
        String taskTitle;

        public Task(String title, String description, String status) {
            taskTitle = title;
            taskDescription = description;
            taskStatus = status;
        }
    }

    Task arrayTask[];
    int size;
    int capacity;

    TaskManager(int size){
        arrayTask= new Task[size];
       this.size=0;
        capacity=size;}


    public void add(String title, String description, String status){
        if(size>=capacity){
            System.out.println("You cannot add more tasks first complete the previous task");
        }
        else{
            arrayTask[size++]=new Task(title, description, status);
        }
    }

    public void displayTasks(){
        for(int i=0; i<arrayTask.length; i++){

            if(arrayTask[i].taskTitle!=null){
            System.out.println("********************* Task Number : "+ (i+1)+"  ********************* ");
            System.out.println("Task Title is : " + arrayTask[i].taskTitle);
            System.out.println("Task Description  is : " + arrayTask[i].taskDescription);
            System.out.println("Task Status is : " + arrayTask[i].taskStatus);
            }
        }
    }

    public void updateTaskStatus(String status, String title){

        for(int i = 0; i <arrayTask.length; i++) {
            if(arrayTask[i].taskTitle.equals(title)){
                arrayTask[i].taskStatus = status;
                System.out.println("Task Updated");
                return;
            }
        }
        System.out.println(" Task "+title+" not Found. Try Another one: ");

    }

    public void deleteTask(String taskTitle) {

        for(int i = 0; i < arrayTask.length; i++){
            if(arrayTask[i].taskTitle.equals(taskTitle)){
                arrayTask[i]=new Task(null,null,null);
                System.out.println("Task is removed from TaskManager");
                return;
            }
        }
        System.out.println("Task not found");
    }

    public static void main(String[] args) {
        var taskManager =new TaskManager(4);

        taskManager.add("ChargeMobile","By charger of Mine","To DO");
        taskManager.add("Sell Laptop","Try to sell it to the person who has some knowledge of the device","TO DO");
        taskManager.add("Exam Preparation","By studing in the home and university ","To DO");
        taskManager.add("Attend Class","by van for multivariate class","To DO");

        System.out.println("**************************Displaying the Task*************************");
        taskManager.displayTasks();

        System.out.println("*************************Update Task Status **************************");
        taskManager.updateTaskStatus("InProgress","Exam Preparation");
        taskManager.updateTaskStatus("Done","ChargeMobile");

        System.out.println("**************************Displaying the Task*************************");
        taskManager.displayTasks();

        System.out.println("**************************Deleting the Task*************************");
        taskManager.deleteTask("ChargeMobile");

        System.out.println("**************************Displaying the Task*************************");
        taskManager.displayTasks();

    }
}
