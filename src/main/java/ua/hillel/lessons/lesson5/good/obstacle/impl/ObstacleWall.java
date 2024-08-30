package ua.hillel.lessons.lesson5.good.obstacle.impl;

import ua.hillel.lessons.lesson5.good.obstacle.Obstacle;
import ua.hillel.lessons.lesson5.good.participant.Participant;

public class ObstacleWall implements Obstacle {
    @Override
    public void start(Participant participant) {
        System.out.println(participant.getName() + " start jump!!!");
    }
}
