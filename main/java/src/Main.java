import java.util.*;

public class Main {

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        List<User> users = new ArrayList<>();
        User nicoRobin = new User("NicoRobin", "nicorobin123", true);
        users.add(nicoRobin);
        User roronoaZoro = new User("RoronoaZoro", "roronoazoro123", false);
        users.add(roronoaZoro);
        User boaHancock = new User("boaHancock", "luffyLove",false);
        users.add(boaHancock);

        // add users into VotingSystem
        votingSystem.addUser(nicoRobin);
        votingSystem.addUser(roronoaZoro);
        votingSystem.addUser(boaHancock);

        Map<String, Candidate> candidates = new HashMap<>();
        Candidate tonyTonyChopper = new Candidate("TonyTonyChopper", 10);
        candidates.put(tonyTonyChopper.getCandidateName(),tonyTonyChopper);
        Candidate vinsmokeSanji = new Candidate("VinsmokeSanji", 8);
        candidates.put(vinsmokeSanji.getCandidateName(),vinsmokeSanji);
        Candidate portgasD_Ace = new Candidate("Portgas-D-Ace",15);
        candidates.put(portgasD_Ace.getCandidateName(), portgasD_Ace);

        // add candidates into VotingSystem
        votingSystem.addCandidate(tonyTonyChopper);
        votingSystem.addCandidate(vinsmokeSanji);
        votingSystem.addCandidate(portgasD_Ace);

        while(true) {

            Scanner input = new Scanner(System.in);
            System.out.println("-------------------------------------");
            System.out.println("Option");
            System.out.println("1. Register the new user.");
            System.out.println("2. Login and vote for candidate/check the total votes per candidate.");
            System.out.println("3. Exit the system.");
            System.out.println("-------------------------------------");

            try {

                String optionInput = input.nextLine();
                int option = Integer.parseInt(optionInput);

                switch (option) {

                    case 1:
                        System.out.println("Enter the username to register.");
                        String username = input.nextLine();
                        if(!votingSystem.hasUserName(username)) {
                            System.out.println("Enter the password to register.");
                            String password = input.nextLine();
                            User newUser = new User(username, password, false); // new users hasn't voted yet
                            votingSystem.userRegistration(newUser);
                        }else {
                            System.out.println("The user is already registered.");
                        }

                        break;

                    case 2:
                        System.out.println("Enter your username to login");
                        String usernameToLogin = input.nextLine();
                        if(votingSystem.hasUserName(usernameToLogin)){
                            System.out.println("Enter your password to login");
                            String passwordToLogIn = input.nextLine();
                            if(votingSystem.userLogin(usernameToLogin, passwordToLogIn)){
                                boolean stayLoggedIn = true;
                                while(stayLoggedIn){
                                    System.out.println("You're now logged in the system. Choose your option.");
                                    System.out.println("1.Vote for candidate");
                                    System.out.println("2.Check the total votes per candidate");
                                    System.out.println("3.Log out.");
                                    try {
                                        String optionAfterLoginInput = input.nextLine();
                                        int optionAfterLogin = Integer.parseInt(optionAfterLoginInput);

                                        switch (optionAfterLogin) {

                                            case 1:
                                                User currentUser = votingSystem.getUserByUsername(usernameToLogin);
                                                if(currentUser.hasVoted()){
                                                    System.out.println("You have already voted.");
                                                }else {
                                                    System.out.println("Enter the candidate name to vote:");
                                                    String candidateNameToVote = input.nextLine();

                                                    votingSystem.voteForCandidate(currentUser, candidateNameToVote);
                                                    //System.out.println("You have voted for : " + candidateNameToVote);
                                                }

                                                break;

                                            case 2:
                                                System.out.println("Enter the candidate you want to check the total votes for");
                                                String candidateNameForTotalVote = input.nextLine();
                                                votingSystem.displayTotalVotePerCandidate(candidateNameForTotalVote);

                                                break;

                                            case 3: stayLoggedIn = false; // Log Out

                                            default:
                                                System.out.println("Invalid option. Try from 1-3.");
                                                break;


                                        }
                                    }catch (NumberFormatException exception) {
                                        System.out.println("Invalid format. Try with a valid NUMBER");
                                    }
                                }

                            }else {
                                System.out.println("Login failed. Try again.");
                            }



                        }else {
                            System.out.println("The username not found.");
                        }


                        break;

                    case 3:
                        System.out.println("Exiting the system.");
                        System.exit(0);

                    default:
                        System.out.println("Enter the valid Number(1-5).");


                }

            }catch (NumberFormatException exception){
                System.out.println("Enter the valid 'NUMBER'. Please try again.");
            }

        }


    }
}

