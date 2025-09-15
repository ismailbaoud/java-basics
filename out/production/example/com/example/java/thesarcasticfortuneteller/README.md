````md
# The Sarcastic Fortune Teller

A humorous Java console application that delivers sarcastic fortunes and allows you to add your own jokes. Perfect for a quick laugh or to brighten someone's day.

## Features

- **Display a Random Joke**: Get a random joke from the list.
- **Add a New Joke**: Contribute your own joke to the collection.
- **Persistent Storage**: Jokes are saved in a `jokes.txt` file for future use.

## Requirements

- Java 8 or higher
- A terminal or command prompt
- A text editor or IDE (e.g., IntelliJ IDEA, Eclipse, VS Code)

## Installation

1. **Clone the repository:**
```bash
git clone https://github.com/ismailbaoud/The-Sarcastic-Fortune-Teller.git
cd The-Sarcastic-Fortune-Teller
````

2. **Compile the Java files:**

```bash
javac com/example/java/thesarcasticfortuneteller/*.java
```

3. **Run the application:**

```bash
java com.example.java.thesarcasticfortuneteller.SarcasticFortune
```

## Usage

1. **Show a Joke**: Type `1` and press Enter.
2. **Add a New Joke**: Type `2` and press Enter, then input the joke type (e.g., sarcastic, normal) and the joke itself.
3. **Exit**: Type `3` and press Enter.

## File Location

The `jokes.txt` file will be created automatically in the folder `com/example/java/thesarcasticfortuneteller` alongside your compiled Java files. You can change this location by modifying the `fileName` variable in `SarcasticFortune.java`.

## Contributing

Feel free to fork the repository, add your own jokes, and submit pull requests. Keep the humor alive!
