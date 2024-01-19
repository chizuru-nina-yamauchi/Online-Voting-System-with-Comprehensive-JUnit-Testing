public class Candidate {
    private String candidateName;
    private int votes;

    public Candidate(String name, int votes) {
        this.candidateName = name;
        this.votes = votes;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    @Override
    public String toString() {
        return "Candidate: " + candidateName + "Votes: " + votes;
    }

}
