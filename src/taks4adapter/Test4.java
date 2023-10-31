package taks4adapter;

public class Test4 {
    public static void main(String[] args) {
        Instagram instagram = new InstagramLoginAdapter(new Facebook());

        instagram.login();
    }
}
