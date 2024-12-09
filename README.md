<h1 align="center">Yearup Util</h1>

## Overview
`yearup-utils` is a collection of utility classes designed to assist with common tasks in Java programming, made for students of YearUp Pluralsight Java bootcamp. This library provides functionalities for console input handling and color-coded console output.

## Table of Contents
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
  - [Console Input](#console-input)
  - [Color Codes](#color-codes)
    - [Valid Color Codes](#valid-color-codes)
    - [Examples](#examples)
- [Contributing](#contributing)
- [License](#license)

## Features
- Prompt for user input with various data types.
- Color-coded console output for better visibility and user experience.

## Installation
To include `yearup-utils` in your Maven project, add the following dependency to your `pom.xml`:


```xml
<dependency>
    <groupId>com.abdurraheem</groupId>
    <artifactId>yearup-utils</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Usage

### Console Input
You can use the `Console` class to prompt users for input. Here are some examples:

```java
import com.abdurraheem.utils.Console;

public class Main {
    public static void main(String[] args) {
        String name = Console.PromptForString("Enter your name: ");
        System.out.println("Hello, " + name + "!");
        boolean isConfirmed = Console.PromptForYesNo("Do you want to continue?");
        System.out.println("User confirmed: " + isConfirmed);
    }
}
```

### Color Codes

#### Valid Color Codes

Text Colors:
- `RESET` - Resets the color to default.
- `BLACK` - Sets the text color to black.
- `RED` - Sets the text color to red.
- `GREEN` - Sets the text color to green.
- `YELLOW` - Sets the text color to yellow.
- `BLUE` - Sets the text color to blue.
- `PURPLE` - Sets the text color to purple.
- `CYAN` - Sets the text color to cyan.
- `WHITE` - Sets the text color to white.
- `GRAY` - Sets the text color to gray.
- `SILVER` - Sets the text color to silver.

Background Colors:
- `BLACK_BACKGROUND` - Sets the background color to black.
- `RED_BACKGROUND` - Sets the background color to red.
- `GREEN_BACKGROUND` - Sets the background color to green.
- `YELLOW_BACKGROUND` - Sets the background color to yellow.
- `BLUE_BACKGROUND` - Sets the background color to blue.
- `PURPLE_BACKGROUND` - Sets the background color to purple.
- `CYAN_BACKGROUND` - Sets the background color to cyan.
- `WHITE_BACKGROUND` - Sets the background color to white.

#### Examples:


```java
import com.abdurraheem.utils.ColorCodes.Color;

System.out.println(Color.RED + "This text is red!" + Color.RESET);
```

```java
System.out.println(Color.RED + Color.BLUE_BACKGROUND + "This text is red on BLUE!" + Color.RESET);
```

```java
import com.abdurraheem.utils.ColorCodes;

System.out.println(applyColor(Color.RED, "This text is red!"));
```

```java
System.out.println(applyColor(Color.RED, Color.BLUE_BACKGROUND, "This text is red on BLUE!"));
```



## Contributing
Contributions are welcome! If you have suggestions or improvements, feel free to open an issue or submit a pull request.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.