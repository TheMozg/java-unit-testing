import java.util.List;
import java.util.ArrayList;
import java.lang.Integer;

public class Scene {
    protected String result = "";
    Scene ( String[] args ) { 
        result = "";
        Boolean valid = true;
        
        for (String arg: args) {
          try {
            if(!arg.equals("1") && !arg.equals("0")) {
              valid = false; 
              result = "Error";
            }
          } 
          catch (Exception e) {
            result = "Error";
          }
        }
         
        if (args.length == 7 && valid == true) {
          Actors act = new Actors();

          List<Actors.Hitchhiker> hitchhikers = new ArrayList<Actors.Hitchhiker>();

          Actors.Hitchhiker Ford = act.new Hitchhiker("Ford");

          Actors.ScaryFish scaryFish = act.new ScaryFish();
          Actors.Pipes pipes = act.new Pipes();
          Actors.JumpingDoughnuts donuts = act.new JumpingDoughnuts();

          if(Integer.parseInt(args[0]) == 1) scaryFish.diveFrom(Actors.Situations.SKY);
          if(Integer.parseInt(args[1]) == 1) donuts.jumpStraightOutOf(Actors.Situations.ROAD);
          if(Integer.parseInt(args[2]) == 1) pipes.squealThrough(Actors.Situations.WINDS);
          if(Integer.parseInt(args[3]) == 1) donuts.setHot();

          Ford.addReasonToRun(scaryFish);
          Ford.addReasonToRun(pipes);
          Ford.addReasonToRun(donuts);

          result += scaryFish.toString() + "\n";
          result += donuts.toString() + "\n";
          result += pipes.toString() + "\n";
          result += Ford.toString() + "\n";
          result += "After:\n";

          if(Integer.parseInt(args[4]) == 0) scaryFish.setHarmless();
            else scaryFish.diveFrom(Actors.Situations.SKY);
          if(Integer.parseInt(args[5]) == 0) donuts.setHarmless();
            else donuts.jumpStraightOutOf(Actors.Situations.ROAD);
          if(Integer.parseInt(args[6]) == 0) pipes.setHarmless();
            else pipes.squealThrough(Actors.Situations.WINDS);

          Ford.addReasonToRun(scaryFish);
          Ford.addReasonToRun(pipes);
          Ford.addReasonToRun(donuts);

          result += scaryFish.toString() + "\n";
          result += donuts.toString() + "\n";
          result += pipes.toString() + "\n";
          result += Ford.toString();
        }
        else result = "Error";
    }
}
