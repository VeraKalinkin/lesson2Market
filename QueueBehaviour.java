public interface QueueBehaviour {
    void takenQueue(Actor actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}
