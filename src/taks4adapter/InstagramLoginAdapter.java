package taks4adapter;

public class InstagramLoginAdapter extends Instagram {

    private final SocialNetwork socialNetwork;
    public InstagramLoginAdapter(SocialNetwork socialNetwork) {
        this.socialNetwork = socialNetwork;
    }
    @Override
    public void login() {
        socialNetwork.login();
        System.out.println("the login to instagram was made with the help of an " + socialNetwork.getClass().getSimpleName() + " social network");
    }
}
