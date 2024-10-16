# Text Analysis Project - Milestone 1

### Created by Michael Muscara
- **Major**: Computer Science
- **Year**: Sophomore at Fairfield University
- **Team Members**:
  - Michael Muscara
  - Kristopher Marte
  - Philip Casey-Leonard

## Project Overview
This project is a Java-based text analysis tool designed to preprocess and analyze articles on a given topic. The application allows users to select a topic (Baseball, Basketball, or Football) and processes multiple articles in the corresponding directory. It removes stop words, calculates basic text statistics, and ranks words by frequency.

### Features:
1. **Stop Words Removal**: The tool removes common stop words such as "and," "the," "is," etc.
2. **Basic Text Statistics**: The program calculates the total number of words and word frequencies.
3. **Word Frequency Ranking**: The tool ranks and sorts words by their frequency, displaying the results in descending order.

## How to Run the Program

### Prerequisites:
- Java Development Kit (JDK) version 8 or higher installed.
- A text editor or IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code).
- Basic knowledge of running Java programs in the command line or IDE.

### Running the Program:
1. **Download the Code**:
   - Clone or download the GitHub repository containing the project files.
     ```bash
     git clone https://github.com/your-username/TextAnalysisProject.git
     ```
     
2. **Open the Project**:
   - Open the project in your preferred Java IDE (e.g., IntelliJ IDEA or Eclipse) or in a text editor.
     
3. **Run the Program**:
   - Compile and run the Main class
     
4. **Select a Topic**:
   - Upon running the program, you will be prompted to select a topic (Baseball, Basketball, or Football) 
   - The program will then process all articles in the selected category and display statistics, filtered words, and word frequencies.


## Class Descriptions

### 1. **Article**:
   - This class handles filePaths to make File objects and retrieve data and basic statistics from each article.

### 2. **Frequency Sort**:
   - This class sorts elements of an ArrayList using bubble sorting.
   - This class is used to assist in the getWordFrequency() method in the Article class.

### 3. **Main**:
   - This is the entry point for the program. It allows the user to select a topic (Baseball, Basketball, or Football) using a `Scanner`.
   - Based on the user's selection, it processes all `.txt` files in the corresponding topic by utilizing the `Article` and `Frequency Sort` classes.

## UML Diagram
![UML Diagram]("C:\Users\mpack\Downloads\umldiagram.png")

The UML diagram illustrates the relationships between the main classes in this project: `Article`, `FrequencySort`, and `Main`. Each class is responsible for a specific task in the article preprocessing workflow.

## Conclusion
This project successfully implements a basic text analysis tool, hitting the Milestone 1 requirements by:
- Preprocessing articles from different topics.
- Removing stop words.
- Calculating basic statistics and ranking word frequencies.

For any questions or issues with running the program, please reach out to Michael Muscara.
