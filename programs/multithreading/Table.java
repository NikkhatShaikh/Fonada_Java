package programs.multithreading;

public class Table {
    synchronized void printTable(int n){   // for thread2
        System.out.println("Table of "+n);

        for (int i=1;i<=10;i++) {
            System.out.println(i * n);
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class ThreadTable1 extends Thread {
    Table table = new Table();

    ThreadTable1(Table table){
        this.table=table;
    }

    @Override
    public void run() {
      table.printTable(10);
    }
}

class ThreadTable2 extends Thread{
    Table table;
    ThreadTable2(Table table){
        this.table=table;

    }
    @Override
    public void run() {
        table.printTable(15);
    }
}

 class SynchronisationDemoImp{
     public static void main(String[] args) {
         Table table = new Table();
         ThreadTable1 threadTable1= new ThreadTable1(table);
         ThreadTable2 threadTable2 = new ThreadTable2(table);
         threadTable1.start();
         threadTable2.start();
     }

}