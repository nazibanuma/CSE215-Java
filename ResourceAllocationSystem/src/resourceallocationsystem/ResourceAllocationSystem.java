
package resourceallocationsystem;

// Given code:
class ResourceUser implements Runnable {
    int resourceNeeded;
    ResourcePool pool;
    
    public ResourceUser(int resourceNeeded, ResourcePool pool) {
        this.resourceNeeded = resourceNeeded;
        this.pool = pool;
    }
    
    public void run() {
        pool.allocate(resourceNeeded);
    }
}

class ResourcePool {

    int pool;

    public ResourcePool(int pool) {
        this.pool = pool;
    }

    public synchronized void allocate(int resourceNeed) {
        while (pool < resourceNeed) { // wait until enough resources
            System.out.println("Cannot allocate " + resourceNeed + " resources. Only " + pool + " available.");
            try {
                wait(); // wait for resources to be released
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Allocate resources
        pool -= resourceNeed;
        System.out.println("Allocated " + resourceNeed + " resources. Remaining: " + pool);

        // Simulate release immediately for next thread
        pool += resourceNeed;
        System.out.println("Released " + resourceNeed + " resources. Total: " + pool);

        notifyAll(); // wake up waiting threads
    }
}

class ResourceAllocationSystem {
    public static void main(String args[]) {
        ResourcePool pool = new ResourcePool(15);
        ResourceUser u1 = new ResourceUser(8, pool);
        ResourceUser u2 = new ResourceUser(10, pool);
        Thread t1 = new Thread(u1);
        Thread t2 = new Thread(u2);
        t1.start();
        t2.start();
    }
}

// Expected output:
// Allocated 8 resources. Remaining: 7
// Cannot allocate 10 resources. Only 7 available.
// Released 8 resources. Total: 15
// Allocated 10 resources. Remaining: 5
