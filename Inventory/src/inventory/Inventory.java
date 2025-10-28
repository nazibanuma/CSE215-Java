package inventory;
class Customer implements Runnable {

    int itemsToBuy;
    Store store;

    public Customer(int itemsToBuy, Store store) {
        this.itemsToBuy = itemsToBuy;
        this.store = store;
    }

    public void run() {
        store.purchase(itemsToBuy);
    }
}

class Store {

    private int stock;

    public Store(int initialStock) {
        this.stock = initialStock;
    }

    public synchronized void purchase(int items) {
        if (stock >= items) {
            stock -= items;
            System.out.println("Purchased " + items + " items. Stock: " + stock);

            // Simulate processing time
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }

            // Return items (restock)
            stock += items;
            System.out.println("Restocked " + items + " items. Total: " + stock);
        } else {
            System.out.println("Cannot purchase " + items + " items. Only " + stock + " available.");

            // Wait for restock
            try {
                wait();

                // Try again after being notified
                if (stock >= items) {
                    stock -= items;
                    System.out.println("Purchased " + items + " items. Stock: " + stock);

                    // Simulate processing
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                    }

                    stock += items;
                    System.out.println("Restocked " + items + " items. Total: " + stock);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Notify waiting threads when items are returned
        notifyAll();
    }
}

class Inventory {

    public static void main(String args[]) {
        Store store = new Store(25);
        Customer c1 = new Customer(10, store);
        Customer c2 = new Customer(15, store);
        Customer c3 = new Customer(8, store);
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        t1.start();
        t2.start();
        t3.start();
    }
}

// Expected output:
// Purchased 10 items. Stock: 15
// Purchased 15 items. Stock: 0
// Cannot purchase 8 items. Only 0 available.
// Restocked 10 items. Total: 10
// Purchased 8 items. Stock: 2
