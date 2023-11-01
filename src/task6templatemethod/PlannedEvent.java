package task6templatemethod;

import java.util.Date;

public abstract class PlannedEvent {

    public PlannedEvent(String caption) {
        this.caption = caption;
    }

    final PlannedEvent buildEvent() {
        setDate(new Date(System.currentTimeMillis()));
        this.eventCaption = setEventCaption();
        setHasCompleted(false);
        return this;
    }


    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isHasCompleted() {
        return hasCompleted;
    }

    public void setHasCompleted(boolean hasCompleted) {
        this.hasCompleted = hasCompleted;
    }

    private String caption;

    public String getEventCaption() {
        return eventCaption;
    }

    public abstract String setEventCaption();

    private String eventCaption;
    private Date date;

    private Boolean hasCompleted;
}
