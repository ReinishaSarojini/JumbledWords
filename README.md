# Jumbled Words

Jumbled Word project displays the misplaced letters and the player has to find the correct word. In this project, scores can be updated using a database and view their profile once registered. There are three levels and each level with five questions and each with mark 10. The user can create their own quiz using this Jumbled Words. The user can visualize the score of other users.

## Objective

The main objective are:

1. To establish database connectivity with GUI interface.
2. To outline the basic structure of GUIs.
3. To show how to add components to the container.
4. To understand the basic graphics processing under the SWING

## Features

1. Possible to view the score of the other users
2. Able to reach the next level even if the present level is not completed
3. Users can create their own quiz
4. There is no reduction of scores for the incorrect answers
5. Players can easily register with their name without mail id

## Database Design

### Table 1: Displaying details of the users

| Name   | Password | Id  | Score |
| ------ | -------- | --- | ----- |
| User 1 | 1234     | 100 | 100   |
| User 2 | 12345    | 102 | 40    |
| User 3 | 54321    | 103 | 50    |

### Table 2: Displaying the details of own Quiz created by user

| Quiz Code | Password | Id  |
| --------- | -------- | --- |
| 1234567   | 45677    | 100 |
| 0987654   | 87654    | 102 |

### Table 3: Questions created by the user

| Question | Answer |
| -------- | ------ |
| mean     | name   |
| koly     | yolk   |

## Requirements

1. Any Text Editor
2. Wampserver
3. Mysql
