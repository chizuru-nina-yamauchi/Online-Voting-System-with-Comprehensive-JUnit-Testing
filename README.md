# Online-Voting-System-with-Comprehensive-JUnit-Testing
My old assignment in December in 2023 for JUnit testing.
I copied my code from the private repository in the organization repository in my online course.

---

# Online Voting System

### Level of Difficulty: Intermediate
### Title: Online Voting System with Comprehensive JUnit Testing
### Overview:

In this assignment, you will be creating an online voting system. The system will allow users to register, login, and vote for their preferred candidate. The system will also display the total votes for each candidate. You will also be required to write comprehensive JUnit tests for your methods.

**Step Guidance:**
1. Create a `User` class with attributes `username`, `password`, and `voted`. The `voted` attribute will be a boolean to check if the user has already voted.
2. Create a `Candidate` class with attributes `name` and `votes`. The `votes` attribute will be an integer to store the total votes for the candidate.
3. Create a `VotingSystem` class. This class will have methods for user registration, user login, voting, and displaying the total votes for each candidate.
4. Use collections to store the users and candidates.
5. Use loops and conditional statements to check the user input and perform the necessary actions.
6. Create a `VotingSystemTest` class to write JUnit tests for your methods in the `VotingSystem` class. Make sure to test all possible scenarios and edge cases.

**Examples:**
*Input:*
Register user with username "John" and password "1234"
*Output:*
"User registered successfully"

*Input:*
Login with username "John" and password "1234"
*Output:*
"Login successful"

*Input:*
Vote for candidate "Jane"
*Output:*
"Vote cast successfully"

**Notes:**
- Make sure to check if the user has already voted before allowing them to vote.
- Use the DoubleStream.of().sum method to calculate the total votes for each candidate.
- Use the "::" method reference (lambda expression shorthand notation) in your code.

**JUnit Testing:**
- Write a test to check if a user is registered successfully. Use JUnit Assertions to check if the actual results match the expected results. This will ensure that your registration method is working correctly.
- Write a test to check if a user can login successfully. Use JUnit Assertions to check if the actual results match the expected results. This will ensure that your login method is working correctly.
- Write a test to check if a user can vote successfully. Use JUnit Assertions to check if the actual results match the expected results. This will ensure that your voting method is working correctly.
- Write a test to check if the total votes for each candidate are calculated correctly. Use the DoubleStream.of().sum method in your test. This will ensure that your method for calculating total votes is working correctly.
- Use JUnit5 Assumptions to skip tests based on certain conditions. For example, you can use `assumeTrue` to test that equal votes are only tested if the username is equal. This will prevent unnecessary tests from running when the condition is not met.
- Use DoubleStream.of().forEach in your tests to iterate over a collection of test data. This will allow you to test multiple data points in a single test.
- Use DoubleStream.of().reduce in your tests to perform a reduction operation on the test data. This can be used to calculate the total votes for a candidate in your tests.
- Use JUnit Annotations (@Test, @BeforeEach, @AfterEach, etc.) in your test class. These annotations provide a way to structure your tests and perform setup and cleanup operations.

**Bonus:**
- Implement a method to display the candidate with the most votes. Use the DoubleStream.of().reduce method to find the candidate with the most votes. This will ensure that your method for finding the candidate with the most votes is working correctly.
- Implement a logout feature for users. Write a JUnit test for this feature using JUnit Assertions to check if the actual results match the expected results.
- Use lambda expressions in your tests to create anonymous functions. This will allow you to write more concise and readable tests.
- Use the "::" method reference (lambda expression shorthand notation) in your tests. This will allow you to reference methods directly in your tests, making your tests more readable.

