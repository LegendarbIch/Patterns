package task6templatemethod;

import java.util.Date;

public class Event extends PlannedEvent{
    public Event(String caption) {
        super(caption);
    }

    @Override
    public String setEventCaption() {
        return "Это событие";
    }
}
