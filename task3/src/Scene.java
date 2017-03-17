import java.util.List;
import java.util.ArrayList;

public class Scene {
    public static void main ( String[] args ) { 
        Actors act = new Actors();
        List<Actors.Reason> reasons = new ArrayList<Actors.Reason>();
        List<Actors.Hitchhiker> hitchhikers = new ArrayList<Actors.Hitchhiker>();

        Actors.Hitchhiker Ford = act.new Hitchhiker("Ford");
        Actors.Hitchhiker Arthur = act.new Hitchhiker("Arthur");

        hitchhikers.add(Ford);
        hitchhikers.add(Arthur);

        Actors.ScaryFish scaryFish = act.new ScaryFish();
        Actors.Pipes pipes = act.new Pipes();
        Actors.JumpingDoughnuts donuts = act.new JumpingDoughnuts();

        reasons.add(scaryFish);
        reasons.add(pipes);
        reasons.add(donuts);

        //scaryFish.diveFrom(Actors.Situations.SKY);
        //donuts.jumpStraightOutOf(Actors.Situations.ROAD);
        donuts.setHot(true);
        //pipes.squealThrough(Actors.Situations.WINDS);

        for (Actors.Reason object : reasons) {
            System.out.println(object.toString());
            for (Actors.Hitchhiker hitch : hitchhikers) {
                hitch.addReasonToRun(object);
            }
        }

        for (Actors.Hitchhiker hitch : hitchhikers) {
            System.out.println(hitch.toString());
        }
    }
}
