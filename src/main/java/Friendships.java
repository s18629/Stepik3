import java.util.*;

    public class Friendships {
        Map<String, List<String>> friendships = new HashMap<>();

        public void createSomeFriends(){
            friendships.put("Michael", Arrays.asList("Vito", "Tom", "Sonny"));
            friendships.put("James", Arrays.asList("Sonny", "Peter"));
            friendships.put("Sonny", Arrays.asList("Michael"));
            friendships.put("Frederico", Arrays.asList());
            friendships.put("Luca", Arrays.asList());
        }


        public List<String> newFriendsList() {
            return new ArrayList<String>();
        }


        //Dodanie przyjaciół - wykorzystuje funkcje addFriend!
        public void makeFriends(String person1, String person2) {
            addFriend(person1, person2);
            addFriend(person2, person1);
        }

        //Pobranie listy przyjaciol
        public List<String> getFriendsList(String person) {
           return friendships.get(person);

        }

        //Sprawdzenie czy przyjaciele
        public boolean areFriends(String person1, String person2) {
            List<String> person1FriendList = getFriendsList(person1);
            return person1FriendList.contains(person2);

        }
        //Dodanie do listy przyjaciol do danej osoby
        private void addFriend(String person, String friend) {
        }


    }

