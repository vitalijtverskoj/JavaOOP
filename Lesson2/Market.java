package Lesson2;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour{
    private List<Actor> queue = new ArrayList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " попал в магазин");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
        System.out.println(actor.getName() + " встал в очередь");
    }

    @Override
    public void takeOrders() {
        // принятие заказа
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()){
                actor.isMakeOrder = true;
                System.out.println(actor.getName() + " сделал заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        // передача заказа
        for (Actor actor : queue) {
            if (actor.isMakeOrder()){
                actor.isTakeOrder = true;
                System.out.println(actor.getName() + " получил заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseQueue = new ArrayList<>();
        for (Actor actor : queue) {
            if(actor.isTakeOrder()){
                System.out.println(actor.getName() + " вышел из очереди");
                releaseQueue.add(actor);
            }
        }
        releaseFromMarket(releaseQueue);
    }



    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " вышел из магазина");
            queue.remove(actor);
        };
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }
}
