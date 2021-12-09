package org.academiadecodigo.loopeytunes.sqlinhas;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        App app = new App();
        app.bootStrap();
    }

    private void bootStrap() {

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.getEnvironment().setActiveProfiles(getProfile());
        ctx.load(Config.SPRING_CONFIG);
        ctx.refresh();

    }

    private String getProfile() {

        String target = System.getenv(Config.SPRING_PROFILE_ENV_VAR);
        return target == null ? Config.SPRING_DEFAULT_PROFILE : target;
    }
}
