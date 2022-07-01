package baobao.LIANxi.DuoXianCheng;

/**
 * -*- coding = utf-8 -*-
 *
 * @Time:2021/10/13 16:21
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：ProduceTest.java
 * @Software：IntelliJ IDEA
 */

    class  Clerk{
    public int productCount = 0;
    public synchronized void  produceProduct() {
        if (productCount < 20) {
            productCount++;
            notify();
            System.out.println(Thread.currentThread().getName()+"开始生产第"+productCount);
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



    public synchronized void consumeProduct() {
        if (productCount > 0) {

            System.out.println(Thread.currentThread().getName()+"开始消费第"+productCount);
            productCount--;
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
    class Producer extends Thread{
        private Clerk clerk;

        public Producer(Clerk clerk) {
            this.clerk = clerk;
        }

        @Override
        public void run() {
            System.out.println(getName()+"生产中");

            while (true) {
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                clerk.produceProduct();
            }
        }
    }
    class Consumer extends Thread{
        private Clerk clerk;

        public Consumer(Clerk clerk) {
            this.clerk = clerk;
        }

        @Override
        public void run() {
            System.out.println(getName()+"消费中");
            while (true) {
                try {
                    sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                clerk.consumeProduct();
            }
        }
    }
public  class ProduceTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer p1 = new Producer(clerk);
        Consumer c1 = new Consumer(clerk);
        p1.setName("生产者1");
        c1.setName("消费者1");
        p1.start();
        c1.start();
    }
}
