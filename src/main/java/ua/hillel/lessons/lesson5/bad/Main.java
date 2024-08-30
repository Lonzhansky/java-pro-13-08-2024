package ua.hillel.lessons.lesson5.bad;

public class Main {

    public static void main(String[] args) {

        ObstaclePool obstaclePool = new ObstaclePool();
        ObstacleWall obstacleWall = new ObstacleWall();

//        ParticipantCat cat = new ParticipantCat("Tom");
        ParticipantDog dog = new ParticipantDog("Barsik");
        ParticipantRat rat = new ParticipantRat("Rat");

//        obstaclePool.start(cat);
        obstaclePool.start(dog);
        obstaclePool.start(rat);

//        obstacleWall.start(cat);
        obstacleWall.start(dog);
        obstacleWall.start(rat);

    }

}
