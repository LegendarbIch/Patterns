package task5oberver;

public class Admin implements Observer{
    private String id;
    public Admin(String id, Observable observer){
        this.id = id;
        observer.registerObserver(this);
    }
    @Override
    public void update(String news) {
        System.out.println("Админ " + id + " узнал новость: " + news);
    }
}
