package task5oberver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NetworkDevice implements Observable{
    private static final int ERROR_CODE = 400;
    private final List<Observer> observers = new ArrayList<>();
    public void work() {
        int i = 0;
        while (i < 1000) {
            int status = request();
            if (status == ERROR_CODE) {
                notifyObservers();
            }
            i++;
        }
    }

    private int request() {
        Random random = new Random();
        return random.nextInt(450)+350;
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update("Произошла ошибка при отправке запроса");
        }
    }
}
