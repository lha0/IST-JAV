# IST-4-JAV project "Mon Pokemon"
### Jiun Gwak, Haneul Kim, Hayeong Lee
---------------
## Description
This project is writing a mini game in Java. The game we made is raising a character, while encountering enemy and buying item, etc.

## Environment
We used Java language.
We used java.util package and Scanner class.
You can find it at the beginning of playGame.java.
``` 
import java.util.Scanner;
```   

To compile the code, in Game folder,
```
$ javac playGame.java
```

To run the class file, 
```
$ java playGame
```  

---------------------
## Files 
There are 7 files in our project.
1. playGame.java file has main method and other methods for operating the game.
2. myCharater.java file is an abstract class for introducing charater's basic stats and technics. 
3. Training.java file is an interface that contains 3 skills.
4. Squirtle.java, Charmander.java and Bulbasaur.java files are classes that are inherited from myCharacter and Training. 
  These 3 files has basic stats and skills for each characters. Plus, these files has implemented functions in interface Training.
5. enemy.java file has stats for enemy.

---------------------
## Usage
1. Choose the character that the player wants.
2. Player will have options for actions, such as Training, Show Character stat, ect.
  + For Training, player has 3 choice of training that increases their stat.
  + For Show Character Stat, it shows the current stat of the character that player has chosen.
  + For Buy items, player can buy Hp potion and Runaway Card. If player doesn't have enough money, the transaction will be refused.
  + For Enemy stat, it shows the current stat of the enemy. Enemy's stat will increase everytime the player encounters them.
  + By selecting Exit, Player can end the game and exit.

This game is a Turn-Based Strategy game. For every 3 choices that player makes, enemy will appear and try to attact the player.

