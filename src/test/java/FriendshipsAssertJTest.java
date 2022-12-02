import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


public class FriendshipsAssertJTest {

    Friendships friendship = new Friendships();

    @Test
    public void shouldBeSizeZero(){
        friendship.createSomeFriends();
        assertThat(friendship.getFriendsList("Luca")).hasSize(0);
    }

    @Test
    public void shouldContainSomeOne(){
        friendship.createSomeFriends();
        assertThat(friendship.getFriendsList("Michael").contains("Sonny")).isTrue();
    }

    @Test
    public void shouldReturnTrue(){
        friendship.createSomeFriends();
        assertThat(friendship.areFriends("Michael", "Sonny")).isTrue();
    }

    @Test
    public void shouldReturnFalse(){
        friendship.createSomeFriends();
        assertThat(friendship.areFriends("Michael", "Luca")).isFalse();
    }

    @Test
    public void shouldContainSomeOneByContainMatcher(){
        friendship.createSomeFriends();
        assertThat(friendship.getFriendsList("Michael")).contains("Sonny");
    }


}
