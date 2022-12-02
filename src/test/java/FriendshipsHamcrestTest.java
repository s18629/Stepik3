
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertTrue;



class FriendshipsHamcrestTests {
    Friendships friendship = new Friendships();

    @Test
    public void returnSizeOfFriendsList(){
        friendship.createSomeFriends();
        assertThat(friendship.getFriendsList("Luca").size(), is(equalTo(0)));
    }

    @Test
    public void shouldBeNotNull(){
        friendship.createSomeFriends();
        assertThat(friendship.getFriendsList("Luca").size(), is(notNullValue()));
    }

    @Test
    public void shouldContainsAFriend(){
        friendship.createSomeFriends();
        assertThat(friendship.getFriendsList("James"), is(hasItem("Sonny")));
    }

    @Test
    public void shouldDontContainAFriend(){
        friendship.createSomeFriends();
        assertThat(friendship.getFriendsList("James"), is(not(hasItem("Luca"))));
    }

    @Test
    public void shouldReturnTrue(){
        friendship.createSomeFriends();
        assertThat(friendship.areFriends("James","Sonny"), is(true));
    }

    @Test
    public void shouldReturnFalse(){
        friendship.createSomeFriends();
        assertThat(friendship.areFriends("Luca","Sonny"), is(false));
    }

}