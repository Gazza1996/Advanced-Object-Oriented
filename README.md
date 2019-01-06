| Project Details   |     |
| --- | --- |
| **Course** | BSc (Hons) in Software Development  |
| **Module** |  Advanced-Object-Oriented-Programming |
| **Student** | Gary Mannion |
| **Lecture** | John Healy |

## Introduction
The game is a simple isometric format game where it is the objective of the player to manouevre through the map and reach the chest and collect it to win the game. 

## Features of the game

- Player is blocked by objects on the map
- Won't walk off the map
- chests can be collected as a game objective
- can only walk on parts of the map that are ground
- cannot walk on water area of map

## Game Design

### Builder
I have a spriteBuilder, GroundBuilder and itemBuilder which are my 3 builder classes for creating the tiles in the game. I used this so i did not have to use constructors for each and use the builder to build when needed. It reduces the need to use a hole pile of constructors to build tiles for each class and makes the code more robust.

### Factory
Is used to create my player sprite of the game. There is an option in my resources of 4 characters but i only am choosing to give the option of one. The factory design is best used for this instance as the program can say it wants a sprite and be fed it an object returned from a parameter type.

### singleton
I used the singleton method in my GameWindow class in order to display the window, but only to display it once and if a second one is displayed by mistake it will be removed or closed by default by this pattern. 

### Iterator
Is used for image loading and returning images to the tiles using the iterator pattern. I use an enum to store the state of the images so they only need to be loaded once. It is used so that the images can be loaded from the resource folder to be displayed in the game on the tiles.
