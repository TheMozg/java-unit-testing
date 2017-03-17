import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class ActorsTest {
    Actors act = new Actors();

    Actors.Hitchhiker Ford = act.new Hitchhiker("Ford");

    Actors.ScaryFish scaryFish = act.new ScaryFish();
    Actors.Pipes pipes = act.new Pipes();
    Actors.JumpingDoughnuts donuts = act.new JumpingDoughnuts();

    @Test
    public void checkOutputScaryFishCalm() {
        assertEquals("Scary fish was harmless", scaryFish.toString());
    }

    @Test
    public void checkOutputDonutsCalm() {
        assertEquals("Jumping doughnuts weren't really that jumpy actually", donuts.toString());
    }

    @Test
    public void checkOutputPipesCalm () {
        assertEquals("Pipes were calm and quiet", pipes.toString());
    }

    @Test
    public void checkCalmnessHitch1 () {
        scaryFish.diveFrom(Actors.Situations.SKY);
        Ford.addReasonToRun(scaryFish);
        assertFalse(Ford.getUnderstood());
    }

    @Test
    public void checkCalmnessHitch2 () {
        donuts.jumpStraightOutOf(Actors.Situations.ROAD);
        Ford.addReasonToRun(donuts);
        assertFalse(Ford.getUnderstood());
    }

    @Test
    public void checkCalmnessHitch3 () {
        pipes.squealThrough(Actors.Situations.WINDS);
        Ford.addReasonToRun(pipes);
        assertFalse(Ford.getUnderstood());
    }

    @Test
    public void checkCalmnessHitchr41 () {
        scaryFish.diveFrom(Actors.Situations.SKY);
        pipes.squealThrough(Actors.Situations.WINDS);
        donuts.jumpStraightOutOf(Actors.Situations.ROAD);
        Ford.addReasonToRun(pipes);
        Ford.addReasonToRun(donuts);
        Ford.addReasonToRun(scaryFish);
        assertFalse(!Ford.getUnderstood());
    }
}
