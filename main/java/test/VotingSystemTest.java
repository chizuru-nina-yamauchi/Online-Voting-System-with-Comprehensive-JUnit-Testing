import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VotingSystemTest {

    @Test
    void testUserRegistration() {
        System.out.println("-------Test method 'testUserRegistration' is executed------");
        // create VotingSystem instance
        var votingSystem = new VotingSystem(); // var is class 'VotingSystem'
        List<User> users = votingSystem.getUsers();

        // create a new test user
        User newTestUser = new User("newTestUser", "testTest123", false);

        // register the new test user
        votingSystem.userRegistration(newTestUser);

        assertAll(
                ()-> assertEquals(1, users.size()), // assume the size of the users is 1 because I just added one newTestUser
                ()->assertEquals(newTestUser, users.get(0)) // assume the user of index 0 is newTestUser
        );

    }

    @Test
    @DisplayName("Test Login result")
    void correctUserInfoShouldSucceedLogin() {
        System.out.println("-------Test method 'correctUserInfoShouldSucceedLogin' is executed------");
        var votingSystem = new VotingSystem();
        User testUser = new User("testUsername","testPassword", false );
        votingSystem.addUser(testUser);

        boolean logingResult = votingSystem.userLogin("testUsername", "testPassword");

        assertTrue(logingResult, "Testuser login successfully");
    }

    @Test
    @DisplayName("Test login result")
    void wrongUserInfoShouldFailLogin(){

        System.out.println("-------Test method 'wrongUserInfoShouldFailLogin' is executed------");
        var votingSystem = new VotingSystem();

        User testUser = new User("testUsername","testPassword", false );
        votingSystem.addUser(testUser);

        boolean logingResult = votingSystem.userLogin("testUsername", "WRONGPassword");

        assertFalse(logingResult, "Login failed");

    }



    @Test
    @DisplayName("Test voting result")
    void voteForCandidateSuccess() {
        System.out.println("-------Test method 'voteForCandidateSuccess' is executed------");
        var votingSystem = new VotingSystem();
        User testUser = new User("testUser", "password", false);
        Candidate testCandidate = new Candidate("testCandidate", 0);

        votingSystem.addUser(testUser);
        votingSystem.addCandidate(testCandidate);

        votingSystem.voteForCandidate(testUser, "testCandidate");

        assertTrue(testUser.hasVoted());
        assertEquals(1, testCandidate.getVotes());
    }

    @Test
    void displayTotalVotePerCandidate() {
    }
}