package task6templatemethod;

import java.util.Date;

public class Task extends PlannedEvent{
    public Task(String caption) {
        super(caption);
    }

    @Override
    public String setEventCaption() {
        return "Это задание";
    }
}
