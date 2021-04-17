# Hanoi Tower Solution
## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)

### General Info
The program is made to solve the problem of the Tower of Hanoi with any amount of Discs.  
It takes two principal values by console.
The first one, the number of cases. Then, each number that precedes the first one is the number of discs of the specific case. For example.

```
3
4
2
3
```
In the example above, there are 3 test cases. The first one is the tower of Hanoi with 4 discs. The second one, 2 discs and, the last one, three discs.  
By this order of ideas, you could do the next thing...

```
6
9
4
5
2
1
8
```
In which you'd have 6 test cases of the Tower of Hanoi with 9, 4, 5, 2, 1 and 8 discs.  
The result is given in an illustration of the towers. Each tower has the value of the amount of discs in it. For example, at the beginning of the problem, the first tower will have value n, in which n is the number of discs selected in the test case. The other two towers will have value 0.  
Suppose your test case has 3 discs.

```
3 0 0
```
That would be the initial representation of the Tower of Hanoi. Then, for each test case, it would print every single representation of the towers until all discs are in the last tower. For example, suppose your test case has 3 discs.

```
3 0 0
2 0 1
1 1 1
1 2 0
0 2 1
1 1 1
1 0 2
0 0 3
```
Note that for n discs the amount of representations of the towers are 2^n.  
Also, note that the result is printed in the file ./data/result.txt
### Technologies
This program is created with:
* Java programming language.
* jdk1.8.0_281
* jre1.8.0_281
* Eclipse IDE

### Setup
To run this project, follow the next steps.
* Clone the repository.
* Import the project (If you are on Eclipse).
* Proceed with the next console commands:

```java
javac -cp src src/Main.java -d bin
java -cp bin Main
```
This way, even if the repo has a bin folder and it is already compiled, you can repeat it just in case.  
Note that the second command is to run the program

## Credits
This program was made by:
**Gabriel Delgado** // 2021-1 // Universidad Icesi // Ingeniería de Sistemas // Segundo Semestre
Sape, eh?
