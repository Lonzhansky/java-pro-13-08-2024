package ua.hillel.lessons.lesson5.good;

import ua.hillel.lessons.lesson5.good.obstacle.Obstacle;
import ua.hillel.lessons.lesson5.good.obstacle.impl.ObstaclePool;
import ua.hillel.lessons.lesson5.good.obstacle.impl.ObstacleWall;
import ua.hillel.lessons.lesson5.good.participant.Participant;
import ua.hillel.lessons.lesson5.good.participant.impl.ParticipantCat;
import ua.hillel.lessons.lesson5.good.participant.impl.ParticipantDog;
import ua.hillel.lessons.lesson5.good.participant.impl.ParticipantRat;

public class Main {
    public static void main(String[] args) {

//        ObstacleWall obstacleWall = new ObstacleWall();
//        ObstaclePool obstaclePool = new ObstaclePool();
//
////        ParticipantCat cat = new ParticipantCat("Tom");
//        ParticipantDog dog = new ParticipantDog("Barsik");
//        ParticipantRat rat = new ParticipantRat("Rat");

////        obstaclePool.start(cat);
//        obstaclePool.start(dog);
//        obstaclePool.start(rat);
//
////        obstacleWall.start(cat);
//        obstacleWall.start(dog);
//        obstacleWall.start(rat);


        Obstacle[] obstacles = {
                new ObstaclePool(),
                new ObstacleWall()
        };

        Participant[] participants = {
                new ParticipantDog("Barsik"),
                new ParticipantRat("Rat"),
                new ParticipantCat("Tom")
        };

        for (Obstacle obstacle : obstacles) {
            for (Participant participant : participants) {
                obstacle.start(participant);
            }
        }



    }
}
