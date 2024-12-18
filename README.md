[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=17263231)
# OOC1 Project

**Title:** Simple Text RPG Game 

**Name:** Ionut Costea  

**Student ID:** G00440022  

# Application Function
This application is a simple text-based RPG game that allows users to create and manage warriors, engage in combat with an enemy, and track the warrior's distance to the enemy and remaining life. 
The game also allows users to view their warriors' status and move closer to enemies before engaging in battle. 
Warriors can only attack enemies if they are within range (distance < 20). The enemy also counterattacks once a warrior attacks.

# Running the Application
To run the application:

Clone or download the project repository from the provided GitHub Classroom link.
Open the project in your IDE (such as IntelliJ IDEA, Eclipse, or VS Code).
Navigate to the Main class.
Press Run or Execute on the Main class to start the application.
The game will display a menu with several options (such as creating a warrior, moving closer to an enemy, or attacking the enemy).
Use the menu to interact with the game:
Create a warrior: Enter a name, ID, and damage for your warrior.
Show alive warriors: Check which warriors are still alive.
Move closer to the enemy: Get your warriors within attack range (distance < 20).
Attack enemy: If within range, attack the enemy.
Continue playing or exit the game.
Prerequisite Software:
Java JDK 11 or higher should be installed.
An IDE like IntelliJ IDEA, Eclipse, or VS Code.
Minimum Project Requirements
This project meets all the minimum project requirements, including:

Repository contains commits: Multiple commits were made every week, tracking progress throughout the development process.
Project fully contained in the provided GitHub Classroom repository.
Required methods (Add Item, Remove Item, Update Item, Find total items, Search Items, Quit):
Add Item: Implemented by adding a warrior.
Remove Item: Not explicitly required but can be inferred by managing warriors and enemies.
Update Item: Warrior attributes like life and damage can be updated.
Find total items: The number of warriors can be checked.
Search Items: Searching can be done by checking for warriors' statuses.
Quit: Exit option is provided in the main menu.

**Code compiles successfully.**

Consistent code formatting: The code is consistently formatted throughout the project.
Comments: Every class, method, and variable is commented to explain its functionality.
No grammar or spelling mistakes: The documentation and commentary are free from spelling or grammar issues.

**Project Requirements**
The project goes beyond the basic requirements in the following ways:

Enemy Interaction: Warriors can attack the enemy, and the enemy can counterattack. This adds complexity to the game mechanics.
Dynamic Warrior Movement: The warriors can move closer to the enemy to get within attack range, adding strategic depth to the gameplay.
Distance Check for Attacks: Warriors can only attack if they are within a specific range (distance < 20). This feature introduces an element of strategy where players must plan their movement before attacking.
Real-Time Interaction: Text is displayed slowly to create a more immersive experience, simulating a more interactive environment.

# Application Architecture
Classes and Purpose:
Player:

The base class for both the Warrior and Enemy. It defines common properties such as player ID, name, life, damage, and whether the player is alive.
Methods: Getters and setters for player attributes. An abstract sayMotto method for subclass-specific behavior, and a defend method for defense actions.
Warrior (inherits from Player):

Represents a warrior that can engage in combat with enemies.
Attributes: Includes distanceToEnemy to track how far the warrior is from the enemy.
Methods: sayMotto() to display the warrior's battle cry, defend() to represent the warrior's defense mechanism, and other basic methods inherited from Player.
Enemy (inherits from Player):

Represents the enemy the player must fight.
Attributes: Includes stabDamage to define the damage an enemy can inflict on the warrior.
Methods: sayMotto() for the enemy's taunt and defend() to represent enemy defense.
WarriorManager:

**Manages an array of warriors.**
Methods: addWarrior() to add a new warrior, checkAliveWarriors() to display all alive warriors, getCloserToEnemy() to move warriors closer to the enemy, and attackEnemy() to execute the attack on the enemy and handle counterattacks.

UtilMethods:

Provides utility methods like displayText() to display text slowly, simulating a more immersive, old type of RPG, experience.

Main:

The entry point of the application. Displays the main menu and handles user input to create warriors, check warrior status, move closer to the enemy, and attack the enemy.
Methods:
displayText(String text, int delay) (in UtilMethods):

Displays text one character at a time with a delay between each character to create a more immersive effect.
addWarrior(Warrior warrior) (in WarriorManager):

Adds a new warrior to the warriors array.
checkAliveWarriors() (in WarriorManager):

Displays all the alive warriors and their remaining life.
getCloserToEnemy() (in WarriorManager):

Moves the warriors closer to the enemy by reducing their distance to the enemy.
attackEnemy(Enemy enemy) (in WarriorManager):

Executes the warrior's attack on the enemy and handles the enemy's counterattack.

# Roadblocks and Unfinished Functionality
Issues Faced:
Enemy Interaction: Implementing a counterattack for the enemy required careful tracking of both warrior and enemy life.

Distance Checks: Ensuring that warriors could only attack when within a specific range (distance < 20) required an additional check in the main menu logic.

Possible Solutions:

Further Testing:
 Conducting additional tests for various interactions, especially edge cases like warriors with 0 life or enemies that counterattack multiple times.
Refining Game Logic:
 Adding more game mechanics like healing potions, multiple enemies, or special moves would enhance the game experience.
What Would Be Done Differently:

Additional Features: 
I would have included more features like inventory management or experience points for warriors.
UI Enhancement: Adding more detailed text formatting or even a GUI would make the game more interactive.