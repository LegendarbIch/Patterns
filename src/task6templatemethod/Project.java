package task6templatemethod;

import java.util.Date;

public class Project extends PlannedEvent{
    public Project(String caption) {
        super(caption);
    }

    @Override
    public String setEventCaption() {
        return "Это проект";
    }


}
