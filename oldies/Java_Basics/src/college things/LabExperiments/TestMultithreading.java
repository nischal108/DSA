package LabExperiments;

// SharedResource.java
class SharedResource {
    private int count;

    // Constructor
    public SharedResource() {
        this.count = 0;
    }

    // Method to increment count with synchronization
    public synchronized void increment() {
        count++;
    }

    // Method to retrieve count value
    public int getCount() {
        return count;
    }
}

// IncrementThread.java
class IncrementThread extends Thread {
    private SharedResource resource;

    // Constructor
    public IncrementThread(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            resource.increment();
        }
    }
}

// RunnableIncrementThread.java
class RunnableIncrementThread implements Runnable {
    private SharedResource resource;

    // Constructor
    public RunnableIncrementThread(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            resource.increment();
        }
    }
}

// TestMultithreading.java
public class TestMultithreading {
    public static void main(String[] args) {
        // Create a shared resource
        SharedResource resource = new SharedResource();

        // Create threads using Thread class
        IncrementThread thread1 = new IncrementThread(resource);
        IncrementThread thread2 = new IncrementThread(resource);

        // Create threads using Runnable interface
        Thread runnableThread1 = new Thread(new RunnableIncrementThread(resource));
        Thread runnableThread2 = new Thread(new RunnableIncrementThread(resource));

        // Start all threads
        thread1.start();
        thread2.start();
        runnableThread1.start();
        runnableThread2.start();

        // Wait for all threads to complete
        try {
            thread1.join();
            thread2.join();
            runnableThread1.join();
            runnableThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print final count value
        System.out.println("Final count (Thread class): " + resource.getCount());
    }
}

