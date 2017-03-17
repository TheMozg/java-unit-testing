import java.util.List;
import java.util.ArrayList;
import java.lang.Integer;

public class Scene {
    public static void main ( String[] args ) { 
        Actors act = new Actors();
        List<Actors.Reason> reasons = new ArrayList<Actors.Reason>();
        List<Actors.Hitchhiker> hitchhikers = new ArrayList<Actors.Hitchhiker>();

        Actors.Hitchhiker Ford = act.new Hitchhiker("Ford");

        Actors.ScaryFish scaryFish = act.new ScaryFish();
        Actors.Pipes pipes = act.new Pipes();
        Actors.JumpingDoughnuts donuts = act.new JumpingDoughnuts();

        if(Integer.parseInt(args[0]) == 1) donuts.jumpStraightOutOf(Actors.Situations.ROAD);
        if(Integer.parseInt(args[1]) == 1) scaryFish.diveFrom(Actors.Situations.SKY);
        if(Integer.parseInt(args[2]) == 1) pipes.squealThrough(Actors.Situations.WINDS);
        if(Integer.parseInt(args[3]) == 1) Ford.setUnderstood(true);

        reasons.add(scaryFish);
        reasons.add(pipes);
        reasons.add(donuts);

        /*scaryFish.diveFrom(Actors.Situations.SKY);
        scaryFish.diveFrom(Actors.Situations.ROAD);
        donuts.jumpStraightOutOf(Actors.Situations.ROAD);
        donuts.setHot();
        donuts.setHot();
        donuts.setHot();
        pipes.squealThrough(Actors.Situations.WINDS);*/

        for (Actors.Reason object : reasons) {
            Ford.addReasonToRun(object);
        }

        if(Ford.getUnderstood()) System.out.println(1);
        else System.out.println(0);
    }
}
