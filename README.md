# JAVA project "My Pocketmon"
## Description
This project is writing a mini game in Java. The game we made is raising a character, while encountering enemy and buying item, etc.


## Environment
We used Java language.
To compile the code, in game folder, write javac playGame.java.
To run the class file, write java playGame.


## Files 
There are 7 files in our project.
Firstly, playGame.java file has main method and other methods for operating the game.
Secondly, myCharater.java file is an abstract class for introducing charater's basic stats and technics. 
Thirdly, Training.java file is an interface that contains 3 skills.
Squirtle.java, Charmander.java and Bulbasaur.java files are classes that are inherited from myCharacter and Training. 
These 3 files has basic stats and skills for each characters. Plus, these files has implemented functions in interface Training.
Lastly, enemy.java file has stats for enemy.


## Usage
First, choose the character that the player wants.
Then, player will have options for actions, such as Training, Show Character stat, ect.
For Training, player has 3 choice of training that increases their stat.
For Show Character Stat, it shows the current stat of the character that player has chosen.
For Buy items, player can buy Hp potion and Runaway Card. If player doesn't have enough money, the transaction will be refused.
For Enemy stat, it shows the current stat of the enemy. Enemy's stat will increase everytime the player encounters them.
By selecting Exit, Player can end the game and exit.

This game is a Turn-Based Strategy game. For every 3 choices that player makes, enemy will appear and try to attact the player.

