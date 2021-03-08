# ConnectFour game

This README.md consists of Connect4 game implementation for two players.
1. Implementation
2. How to run the program
3. Testing strategy

1. Implementation:
 Technology used : Java (10.0.1), Maven ,JUnit,log4j,Eclipse ID
 File architecture:
 ![image](https://user-images.githubusercontent.com/45708734/110267457-cb0b5080-7ffa-11eb-8f91-4d6829d97b7c.png)
 
Logic : 
i) Connect4.java, which is having main method & calls desired methods from Board1.java
ii)Creating board of 6*7 char[][] grid = new char[6][7] to Establishing a playing board with Red & Yellow inputs at a time
iii)Creating board of 6*7 by implementing method "public static void display(char[][] grid)"
iv) Verifying coloum is full or not by implementing method "public static boolean validate(int column, char[][] grid)"
v) Checking Winner conditions as per below points by implementing "public static boolean isWinner(char player, char[][] grid)"
  a) check for consecutive 4 red/yellow pieces across grid
  b) check for 4 up and down consecutive same pieces
  c) check upward diagonal 4 consecutive same pieces 
  d) check downward diagonal 4 consecutive same pieces
  e) If any of condition matches, is the Winner, Game over!!

 2. How to run the program
 i) click on connect4Game.jar runnable executable present at root & enter desired input
 ii) Or Run Connect4.java & enter desired input
 
 3. Testing strategy
 i) Positive Happy path scenarios -> We can test this code with inputs as mentioned in above #1.v 
 ii) Negative scenarios --> Enter special chars /digits, Enter null or blank spaces etc, Enter as many as inputs to check arrayoutofbound execption scenario
 
4. Require dependencies added in POM.xml.
5. Used log4j libraries has been used to read the inputs from connectFourInput.properties & pass it to runnable jar.
  ConfigFileReader.java : consists of Utils methods of log4j, which read inputs from connectFourInput.properties
  ReadInput.jave : Created to run the executable jar & pass the inputs from connectFourInput.properties
  
 Note : Successfully created executable jar & read the inputs from connectFourInput.properties file. However, running executable via program & passing inputs at run time from connectFourInput.properties is not completed as I tried but could not finish it.
