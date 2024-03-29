import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;

public class VotingSystem {

    private List<User> users;
    private Map<String, Candidate> candidates;

    public VotingSystem(List<User> users, Map<String, Candidate> candidates) {
        this.users = users;
        this.candidates = candidates;
    }

    public VotingSystem(){
        users = new ArrayList<>();
        candidates = new HashMap<>();
    }

    public List<User> getUsers() {
        return this.users;
    }


    public void addUser( User user) {
        this.users.add(user);
    }

    public void addCandidate(Candidate candidate){
        this.candidates.put(candidate.getCandidateName(), candidate);
    }


    public boolean hasUserName(String username) {
        for(User user : users){
            if(user.getUsername().equalsIgnoreCase(username)){
                return true;
            }
        }return false;
    }

    public void userRegistration(User newUser){
        users.add(newUser);
        System.out.println("User registered successfully.");
        System.out.println(newUser);
    }


    public User getUserByUsername(String username){
        for(User user : users){
            if(user.getUsername().equalsIgnoreCase(username)){
                return user;
            }
        }
        return  null;
    }

    public boolean userLogin(String username, String password){
        User user = getUserByUsername(username);
        if(user != null && user.getPassword().equals(password)){
            return true;
        }else {
            System.out.println("Incorrect username or password. \nLogin failed. Try again.");
            return false;
        }
    }



    public void voteForCandidate(User user, String candidateName){
        //check if the candidate exists
        if(candidates.containsKey(candidateName)){
            Candidate selectedCandidate = candidates.get(candidateName);
            // update the candidate's votes and mark the user as voted
            selectedCandidate.setVotes(selectedCandidate.getVotes() + 1);
            user.setVoted(true);
            System.out.println("You have voted successfully for : " + candidateName);
        } else {
            System.out.println("Invalid candidate. Please enter a valid candidate.");
        }

    }




    public String displayTotalVotePerCandidate(String candidateName){
        if(candidates.containsKey(candidateName)){
            Candidate selectedCandidate = candidates.get(candidateName);
            return "Total vote for " + candidateName + ": " + selectedCandidate.getVotes();
        }else{
            return "Candidate not found: " + candidateName;
        }

    }


}
