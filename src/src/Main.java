//implementing Hi and Hello classes functionalities
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");


//        Runnable obj1 = ;
//
//        Runnable obj2 = ;

//        Thread t1 = new Thread(obj1);
//        Thread t2 = new Thread(obj2);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello "+Thread.currentThread().getPriority());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }


        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi "+Thread.currentThread().getPriority());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });

        //Getting the name of the Thread
        System.out.println("The name of Thread 1 is: " + t1.getName());

        //Setting a name for Thread
            t1.setName("First Thread");
        System.out.println("The name of Thread 1 is: " + t1.getName());

        System.out.println("The name of Thread 2 is: " + t2.getName());
            t2.setName("Second Thread");
        System.out.println("The name of Thread 2 is: " + t2.getName());


        //getting the priority of the Threads
        System.out.println("The priority for Thread 1 is: "+t1.getPriority());

        //Setting the priority of the Thread
//        t2.setPriority(1);
        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println("The priority for Thread 2 is: "+t2.getPriority());
        t1.start();
        t2.start();

        //checking if the thread 1 is alive or not
        System.out.println("Thread 1 is Alive: " + t1.isAlive());
        t1.join();
        t2.join();

        //checking if the thread 1 is alive or not
        System.out.println("Thread 1 is Alive: " + t1.isAlive());

        System.out.println("End of execution");
    }

}