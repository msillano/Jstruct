/*
 * 1) import  test05.java in JStruct
 * 2) export from JStruct in test05_a.java
 * 3) compare test05.java and test05_a.java
 */


@FunctionalInterface
 interface WorkerInterface {
//defines a functional interface
    void doSomeWork();
}

 class Test05 {
    public static void execute(WorkerInterface worker) {
        worker.doSomeWork();
    }

    public static void main(String [] args) {

        //invoke doSomeWork using Annonymous class
        execute(new WorkerInterface() {
            @Override
            public void doSomeWork() {
                System.out.println("Worker invoked using Anonymous class");
            }
        });

        //invoke doSomeWork using Lambda expression
        execute( () -> System.out.println("Worker invoked using Lambda expression") );
    }

}
