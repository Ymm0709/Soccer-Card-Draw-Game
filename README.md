# ⚽ Football Player Card Draw Game

A Java-based console football player card draw game that lets you experience the joy of collecting legendary and current football stars!

## 📋 Project Description

This is a simple command-line interactive game where players can randomly draw football player cards by entering commands. The game includes 50 world-class football stars, featuring both legendary players and current stars, with detailed information such as position, preferred foot, offensive and defensive ratings for each player.

## ✨ Features

- 🎲 **Random Draw System**: Enter `draw` to randomly draw a player each time
- 📊 **Detailed Player Information**: Includes player name, position, preferred foot, offensive and defensive ratings
- 📝 **Lineup Recording**: Automatically saves all drawn players and displays the complete lineup at the end of the game
- 🎮 **Easy to Use**: Intuitive command-line interface with simple operations

## 🎯 Game Rules

1. After running the program, enter `draw` to draw a random player card
2. You can draw multiple times, with a maximum of 100 cards
3. Enter `end` to finish the game and view your collected player lineup

## 🚀 How to Run

### Prerequisites

- Java JDK 8 or higher

### Running Steps

1. **Compile the program**
   ```bash
   javac FootballPlayerCard.java
   ```

2. **Run the program**
   ```bash
   java FootballPlayerCard
   ```

3. **Start playing**
   - Enter `draw` to draw a player
   - Enter `end` to end the game

## 📖 Usage Example

```
Welcome to the football card draw!
Game rule: Type 'draw' to draw a player or 'end' to finish.

Type 'draw' to get random players, or type 'end' to end game:
draw

Congratulations on obtaining: Lionel Messi | Right Wing Forward | Left Footed | Offense: 97 | Defense: 50

Type 'draw' to get random players, or type 'end' to end game:
draw

Congratulations on obtaining: Cristiano Ronaldo | Left Wing Forward | Right Footed | Offense: 98 | Defense: 65

Type 'draw' to get random players, or type 'end' to end game:
end

Game over.

Here is your current lineup:
Lionel Messi | Right Wing Forward | Left Footed | Offense: 97 | Defense: 50
Cristiano Ronaldo | Left Wing Forward | Right Footed | Offense: 98 | Defense: 65

Thanks for playing!
```

## 👥 Player Database

The game includes 50 world-class football stars, covering:

- 🏆 **Legendary Players**: Paul Scholes, Zinedine Zidane, Ronaldinho, Paolo Maldini, and more
- ⭐ **Current Stars**: Kylian Mbappé, Erling Haaland, Kevin De Bruyne, Virgil van Dijk, and more
- 🥅 **All Positions**: Forwards, midfielders, defenders, goalkeepers, and all positions

Player information format:
```
Player Name | Position | Preferred Foot | Offense Rating | Defense Rating
```

## 🛠️ Technical Implementation

- **Programming Language**: Java
- **Main Libraries**:
  - `java.util.Random`: Used for random player drawing
  - `java.util.Scanner`: Used for receiving user input
- **Core Methods**:
  - `main()`: Program entry point, initializes the game
  - `playGame()`: Main game loop, handles user input and drawing logic
  - `displayPlayerCards()`: Displays the drawn player lineup

## 📝 Code Structure

```
FootballPlayerCard.java
├── players[]          # Player database array
├── main()             # Main method
├── playGame()         # Game logic
└── displayPlayerCards() # Display lineup
```

## 🤝 Contributing

Issues and Pull Requests are welcome!

## 📄 License

This project is for educational purposes and can be freely used and modified.

## 👨‍💻 Author

Ymm0709

---

**Enjoy collecting football star cards!** ⚽🎮
