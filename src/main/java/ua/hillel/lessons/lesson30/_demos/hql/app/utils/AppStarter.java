package ua.hillel.lessons.lesson30._demos.hql.app.utils;

import ua.hillel.lessons.lesson30._demos.hql.app.controller.AppController;
import ua.hillel.lessons.lesson30._demos.hql.app.service.AppService;
import ua.hillel.lessons.lesson30._demos.hql.app.view.AppView;

public class AppStarter {

    public static void startApp() {
        AppService service = new AppService();
        AppView view = new AppView();
        AppController controller = new AppController(view, service);
        controller.runApp();
    }
}
