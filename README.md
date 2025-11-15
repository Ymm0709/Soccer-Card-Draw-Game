# ⚽ 足球球员卡片抽卡游戏 (Football Player Card Draw Game)

一个基于 Java 的控制台足球球员卡片抽卡游戏，让你体验收集传奇和现役足球明星的乐趣！

## 📋 项目简介

这是一个简单的命令行交互式游戏，玩家可以通过输入命令随机抽取足球球员卡片。游戏包含 50 位世界级足球明星，包括传奇球员和现役球星，每位球员都有详细的位置、惯用脚、进攻和防守能力值等信息。

## ✨ 功能特点

- 🎲 **随机抽卡系统**：每次输入 `draw` 随机抽取一位球员
- 📊 **详细球员信息**：包含球员姓名、位置、惯用脚、进攻和防守能力值
- 📝 **阵容记录**：自动保存所有抽取的球员，游戏结束时显示完整阵容
- 🎮 **简单易用**：直观的命令行界面，操作简单

## 🎯 游戏规则

1. 运行程序后，输入 `draw` 来抽取随机球员卡片
2. 可以多次抽取，最多可抽取 100 张卡片
3. 输入 `end` 结束游戏并查看已收集的球员阵容

## 🚀 如何运行

### 前置要求

- Java JDK 8 或更高版本

### 运行步骤

1. **编译程序**
   ```bash
   javac FootballPlayerCard.java
   ```

2. **运行程序**
   ```bash
   java FootballPlayerCard
   ```

3. **开始游戏**
   - 输入 `draw` 抽取球员
   - 输入 `end` 结束游戏

## 📖 使用示例

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

## 👥 球员数据库

游戏包含 50 位世界级足球明星，涵盖：

- 🏆 **传奇球员**：Paul Scholes, Zinedine Zidane, Ronaldinho, Paolo Maldini 等
- ⭐ **现役球星**：Kylian Mbappé, Erling Haaland, Kevin De Bruyne, Virgil van Dijk 等
- 🥅 **各位置球员**：前锋、中场、后卫、门将等各个位置

每位球员的信息格式：
```
球员姓名 | 位置 | 惯用脚 | 进攻能力值 | 防守能力值
```

## 🛠️ 技术实现

- **编程语言**：Java
- **主要类库**：
  - `java.util.Random`：用于随机抽取球员
  - `java.util.Scanner`：用于接收用户输入
- **核心方法**：
  - `main()`：程序入口，初始化游戏
  - `playGame()`：游戏主循环，处理用户输入和抽卡逻辑
  - `displayPlayerCards()`：显示已抽取的球员阵容

## 📝 代码结构

```
FootballPlayerCard.java
├── players[]          # 球员数据库数组
├── main()             # 主方法
├── playGame()         # 游戏逻辑
└── displayPlayerCards() # 显示阵容
```

## 🤝 贡献

欢迎提交 Issue 和 Pull Request！

## 📄 许可证

本项目为教育用途，可自由使用和修改。

## 👨‍💻 作者

Ymm0709

---

**享受收集足球明星卡片的乐趣！** ⚽🎮

