import java.util.ArrayList;
import java.util.List;

public class Actors {

    enum Actions {
        RUN("run");

        private final String text;

        private Actions(final String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }

    enum Situations {
        ROAD("road"), WINDS("winds"), SKY("sky");

        private final String text;

        private Situations(final String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }

    public class Hitchhiker {
        private final String name;
        
        private List<Reason> reasonsToRun = new ArrayList<Reason>();

        private Boolean understoodWhatToDo = false;

        Hitchhiker (String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
        
        public Boolean getUnderstood() {
            return this.understoodWhatToDo;
        }

        public void setUnderstood(Boolean st) {
            this.understoodWhatToDo = st;
        }

        public void addReasonToRun(Reason reason) {
            if(reason.isValid == true) {
                reasonsToRun.add(reason);
            }
            if(reasonsToRun.size() >= 3) setUnderstood(true);
            else setUnderstood(false);
        } 

        public void calmDown() {
            reasonsToRun.clear();
        }
        
        private String doInCaseOfPanic(Actions action) {
            String panic = "it's time to " + action.text;
            calmDown();
            return panic;
        }

        @Override
        public String toString() {
            String result = name;
            if(getUnderstood()) result += " understood that " + doInCaseOfPanic(Actions.RUN);
            else result += " was calm";

            return result;
        }

    }

    public class Reason {
        private Boolean isValid = false;

        public void setValid(Boolean st) {
            this.isValid = st;
        }

        public Boolean getValid() {
            return this.isValid;
        }
    }

    public class ScaryFish extends Reason {

        private String name = "Scary fish";
        private String description;

        public void diveFrom(Situations situation) {
            setValid(true);
            description = name + " dived out of the " + situation.text;
        } 

        @Override
        public String toString() {
            String result = description;
            if(!getValid()) result = name + " was harmless";

            return result;
        }
    }

    public class JumpingDoughnuts extends Reason {
        private String name = "Jumping doughnuts";
        private String description;
        private Boolean areHot = false;
        
        public void setHot() {
            if(!(this.areHot)) description = "hot " + description;
            this.areHot = true;
        }

        public void jumpStraightOutOf(Situations situation) {
            setValid(true);
            description = name + " jumped straight out of " + situation.text;
        }

        @Override
        public String toString() {
            String result = description;
            if(!getValid()) result = name + " weren't really that jumpy actually";

            return result;
        }
    }

    public class Pipes extends Reason {
        private String name = "Pipes";
        private String description;

        public void squealThrough(Situations situation) {
            setValid(true);
            description = name + " squealed through the " + situation.text;
        }

        @Override
        public String toString() {
            String result = description;
            if(!getValid()) result = name + " were calm and quiet";

            return result;
        }
    }
}
