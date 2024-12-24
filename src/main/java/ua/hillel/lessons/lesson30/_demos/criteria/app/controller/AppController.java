package ua.hillel.lessons.lesson30._demos.criteria.app.controller;

import ua.hillel.lessons.lesson30._demos.criteria.app.service.AppService;
import ua.hillel.lessons.lesson30._demos.criteria.app.view.AppView;

public class AppController {

    AppView view;
    AppService service;

    public AppController(AppView view, AppService service) {
        this.view = view;
        this.service = service;
    }

    public void runApp() {
        service.filterChoice(view.chooseOption());
    }
}
