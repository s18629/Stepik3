public class main {
    public static void main(String[] args) {
        Friendships friendships = new Friendships();
        friendships.createSomeFriends();

        friendships.getFriendsList("Michael");
        friendships.getFriendsList("James");
        friendships.getFriendsList("Sonny");
        friendships.getFriendsList("Frederico");
        friendships.getFriendsList("Luca");

        System.out.println(friendships.areFriends("Michael", "Sonny"));

        friendships.makeFriends("Frederico", "Luca");

        friendships.getFriendsList("Frederico");
        friendships.getFriendsList("Luca");

        System.out.println(friendships.getFriendsList("Frederico"));
        System.out.println(friendships.getFriendsList("Michael"));

        System.out.println(friendships.areFriends("Luca", "Don"));




    }
}
