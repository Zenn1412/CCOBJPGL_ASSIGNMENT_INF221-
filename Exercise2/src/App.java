import Explorers.*;
import Planets.*;

public class App {

    public static void main(String[] args) {

        
        Planet venus = new Venus();
        Planet mercury = new Mercury();
        Planet earth = new Earth();
        Planet saturn = new Saturn();
        Planet neptune = new Neptune();
        Planet mars = new Mars();
        Planet jupiter = new Jupiter();
        Planet uranus = new Uranus();
        Planet pluto = new Pluto();



        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();

        mercury.accept(astronaut);
        venus.accept(astronaut);
        earth.accept(astronaut);
        mars.accept(astronaut);
        jupiter.accept(astronaut);
        saturn.accept(astronaut);
        uranus.accept(astronaut);
        neptune.accept(astronaut);
        pluto.accept(astronaut);




        mercury.accept(rover);
        venus.accept(rover);
        earth.accept(rover);
        mars.accept(rover);
        jupiter.accept(rover);
        saturn.accept(rover);
        uranus.accept(rover);
        neptune.accept(rover);
        pluto.accept(rover);


    }
}