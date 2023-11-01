package task6templatemethod;

import java.util.Arrays;
import java.util.List;

public class Test6 {

    public static void main(String[] args) {
        PlannedEvent newYear = new Event("Новый год, подготовиться");

        PlannedEvent courseProj = new Project("Подготовить курсовой проект");

        PlannedEvent todayTask = new Task("Убраться в квартире");

        List<PlannedEvent> events = Arrays.asList(newYear, courseProj, todayTask);

         events.forEach(PlannedEvent::buildEvent);

         events.forEach(plannedEvent -> System.out.println(plannedEvent.getEventCaption() + " | "
                 + plannedEvent.getCaption() + " " + plannedEvent.getDate()));
    }
}
