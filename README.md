# Campus Course & Records Manager (CCRM)

**Author:** Dhruv Ghongade  
**Registration Number:** 24BAS10009  
**Version:** 1.0.0  
**GitHub Repository:** [https://github.com/dhruv-956/Java-vityarthy.git](https://github.com/dhruv-956/Java-vityarthy.git)

---

## 1. Project Overview

The **Campus Course & Records Manager (CCRM)** is a console-based Java application designed to handle core administrative tasks for educational institutions. It provides a robust command-line interface (CLI) for managing students, courses, and enrollments with a focus on clean code architecture and Java best practices.

### Technology Stack
- **Language:** Java SE 17+ (compatible with Java 8+)
- **Architecture:** Three-tier architecture (CLI, Service, Domain)
- **Design Patterns:** Service Layer Pattern, Data Transfer Objects
- **Build System:** Standard javac compilation

### Key Objectives
- Demonstrate core Java SE capabilities
- Apply object-oriented programming principles
- Implement clean code architecture
- Showcase proper exception handling and resource management



## 2. How to Run

### Prerequisites
- **Java Development Kit (JDK):** Version 8 or higher (JDK 17 recommended)
- **IDE:** Eclipse, IntelliJ IDEA, or VS Code (optional)
- **Operating System:** Windows, Linux, or macOS

### Quick Start

#### Method 1: Command Line (Windows)
```bash
# Navigate to project directory
cd path\to\CCRM

# Create bin directory if it doesn't exist
mkdir bin

# Compile all Java files
javac -d bin src\edu\ccrm\cli\*.java src\edu\ccrm\domain\*.java src\edu\ccrm\service\*.java

# Run the application
java -cp bin edu.ccrm.cli.Main
```

#### Method 3: Eclipse IDE
1. **Import Project:**
   - File → Open Projects from File System
   - Select the CCRM directory
   - Click Finish

2. **Run Application:**
   - Navigate to `src/edu/ccrm/cli/Main.java`
   - Right-click → Run As → Java Application

3. **Alternative:**
   - Press `Ctrl + F11` (Windows/Linux) or `Cmd + F11` (Mac)

#### Method 4: IntelliJ IDEA
1. Open the CCRM project folder
2. Right-click on `Main.java`
3. Select "Run 'Main.main()'"

---

## 3. Java Platform Explained

### Evolution of Java

| Version | Year | Key Features |
|---------|------|--------------|
| **JDK 1.0** | 1996 | Initial release |
| **J2SE 1.2** | 1998 | Swing, Collections Framework |
| **J2SE 5.0** | 2004 | Generics, Enums, Annotations, Autoboxing |
| **Java SE 7** | 2011 | NIO.2, try-with-resources, diamond operator |
| **Java SE 8** | 2014 | Lambda Expressions, Stream API, Date/Time API |
| **Java SE 9** | 2017 | Java Platform Module System |
| **Java SE 11** | 2018 | LTS release, HTTP Client API |
| **Java SE 17** | 2021 | Latest LTS, Sealed Classes, Pattern Matching |
| **Java SE 21** | 2023 | Current LTS, Virtual Threads, Pattern Matching |

### Java Editions Comparison

| Edition | Full Name | Target Platform | Use Case |
|---------|-----------|----------------|----------|
| **Java ME** | Micro Edition | Mobile devices, IoT, embedded systems | Small footprint applications |
| **Java SE** | Standard Edition | Desktops, servers, general-purpose | Core applications (This Project) |
| **Java EE** | Enterprise Edition | Enterprise servers | Large-scale web applications |

### JDK vs. JRE vs. JVM

```
┌─────────────────────────────────────┐
│           JDK (Development)         │
│  ┌───────────────────────────────┐  │
│  │      JRE (Runtime)            │  │
│  │  ┌─────────────────────────┐  │  │
│  │  │   JVM (Execution)       │  │  │
│  │  │  - Class Loader         │  │  │
│  │  │  - Bytecode Verifier    │  │  │
│  │  │  - Interpreter/JIT      │  │  │
│  │  └─────────────────────────┘  │  │
│  │  + Standard Libraries         │  │
│  └───────────────────────────────┘  │
│  + Development Tools (javac, etc.)  │
└─────────────────────────────────────┘
```

- **JVM (Java Virtual Machine):** Executes Java bytecode, platform-dependent
- **JRE (Java Runtime Environment):** JVM + libraries to run applications
- **JDK (Java Development Kit):** JRE + development tools (compiler, debugger)

**Workflow:**  
Developer writes `.java` → JDK compiles to `.class` → JRE/JVM executes bytecode

---

## 4. Setup & Installation

### Step 1: Download and Install JDK

1. Visit [Oracle JDK Downloads](https://www.oracle.com/java/technologies/downloads/) or [Adoptium](https://adoptium.net/)
2. Download the appropriate installer for Windows
3. Run the installer and follow prompts
4. Note the installation directory (e.g., `C:\Program Files\Java\jdk-17`)

### Step 2: Configure Environment Variables

1. **Set JAVA_HOME:**
   - Right-click "This PC" → Properties
   - Advanced system settings → Environment Variables
   - Under System Variables, click "New"
   - Variable name: `JAVA_HOME`
   - Variable value: `C:\Program Files\Java\jdk-17` (your JDK path)

2. **Update PATH:**
   - Find "Path" in System Variables
   - Click "Edit" → "New"
   - Add: `%JAVA_HOME%\bin`
   - Click OK to save

### Step 3: Verify Installation

Open Command Prompt and run:
```bash
java -version
javac -version
```

**Expected output:**
```
java version "17.0.x" 20xx-xx-xx
Java(TM) SE Runtime Environment (build 17.0.x+xx-xxx)
Java HotSpot(TM) 64-Bit Server VM (build 17.0.x+xx-xxx, mixed mode)
```

### Step 4: Clone and Run Project

```bash
# Clone the repository
git clone https://github.com/dhruv-956/Java-vityarthy.git

# Navigate to project
cd Java-vityarthy\CCRM

# Compile
javac -d bin src\edu\ccrm\cli\*.java src\edu\ccrm\domain\*.java src\edu\ccrm\service\*.java

# Run
java -cp bin edu.ccrm.cli.Main
```

---

## 5. Project Structure

```
CCRM/
│
├── src/
│   └── edu/
│       └── ccrm/
│           ├── cli/
│           │   └── Main.java              # Main entry point with menu
│           │
│           ├── domain/                     # Domain/Entity classes
│           │   ├── Student.java           # Student entity
│           │   └── Course.java            # Course entity
│           │
│           └── service/                    # Business logic layer
│               ├── StudentService.java    # Student operations
│               └── CourseService.java     # Course operations
│
├── bin/                                    # Compiled .class files (generated)
│
└── README.md                               # This file
```

### Architecture Layers

1. **CLI Layer (`edu.ccrm.cli`)**: User interface and menu handling
2. **Service Layer (`edu.ccrm.service`)**: Business logic and data management
3. **Domain Layer (`edu.ccrm.domain`)**: Entity classes representing data models

---

## 6. Syllabus to Code Mapping

| Syllabus Topic | Implementation Location | Description |
|----------------|------------------------|-------------|
| **Packages** | All files | `edu.ccrm.cli`, `edu.ccrm.domain`, `edu.ccrm.service` |
| **Primitive Variables & Operators** | `Student.java` (line 7-13) | `int id`, `boolean active`, arithmetic in ID generation |
| **Decision Structures (if/switch)** | `Main.java` (line 23-68) | Switch statement for menu navigation |
| **Loops (for, while, etc.)** | `Main.java` (line 16-70) | do-while for menu loop |
| | `StudentService.java` (line 25-28) | for-each loop for listing students |
| | `CourseService.java` (line 15-18) | for-each loop for listing courses |
| **Strings & Methods** | `Student.java` (line 64-67) | String concatenation, `equals()` method |
| | `Course.java` (line 24-26) | String manipulation in `toString()` |
| **Collections (ArrayList)** | `Student.java` (line 13) | `List<Course> enrolledCourses` |
| | `StudentService.java` (line 7) | `List<Student> students` |
| | `CourseService.java` (line 7) | `List<Course> courses` |
| **OOP - Encapsulation** | `Student.java` (line 7-13) | Private fields with public getters/setters |
| | `Course.java` (line 4-6) | Private fields: `code`, `title`, `credits` |
| **OOP - Abstraction** | Service classes | Abstract business logic from presentation |
| **OOP - Polymorphism** | `Student.java` (line 64) | `toString()` method override |
| | `Course.java` (line 24, 29, 37) | Override `toString()`, `equals()`, `hashCode()` |
| **Immutability** | `Student.java` (line 7, 12, 13) | Final fields: `id`, `createdOn`, `enrolledCourses` |
| | All Service classes | Final collection fields |
| **Date/Time API** | `Student.java` (line 12, 21) | `LocalDate` for `createdOn` field |
| **Exception Handling** | `Main.java` (line 17, 71-73) | try-with-resources, catch block |
| **Resource Management** | `Main.java` (line 17) | try-with-resources for Scanner |
| **Auto-boxing/Unboxing** | `StudentService.java` (line 10) | `int` to `Integer` conversion |
| **Generics** | `Student.java` (line 13) | `List<Course>` generic collection |
| | All Service classes | `List<Student>`, `List<Course>` |
| **Method Overloading** | `StudentService.java` (line 31, 39) | `findStudentByRegNo()` vs `findStudentById()` |
| **this Keyword** | `Student.java` (line 16-22) | Constructor parameter disambiguation |
| **Static vs Instance** | `StudentService.java` (line 8) | Instance variable `nextId` |
| **Access Modifiers** | All classes | private, public modifiers |

---

## 7. Usage Examples

### Example Session

```
=== CCRM MENU ===
1. Add Student
2. List Students
3. Add Course
4. List Courses
5. Enroll Student in Course
0. Exit
Enter choice: 1

RegNo: 24BAS10009
Name: Dhruv Ghongade
Email: dhruv@example.com
Student added: Student{id=1, regNo='24BAS10009', fullName='Dhruv Ghongade', email='dhruv@example.com'}

=== CCRM MENU ===
Enter choice: 3

Code: CS101
Title: Introduction to Programming
Credits: 4
Course added: CS101 - Introduction to Programming (4 credits)

=== CCRM MENU ===
Enter choice: 5

Student RegNo: 24BAS10009
Course Code: CS101
Student enrolled successfully!

=== CCRM MENU ===
Enter choice: 2

Student: Dhruv Ghongade (24BAS10009)
Email: dhruv@example.com
Active: true
Enrolled Courses:
 - Introduction to Programming
------

=== CCRM MENU ===
Enter choice: 0
Exiting...
```

## Author

**Dhruv Ghongade**  
Registration Number: 24BAS10009  
GitHub: [@dhruv-956](https://github.com/dhruv-956)


## Quick Reference Commands

```bash
# Compile
javac -d bin src\edu\ccrm\cli\*.java src\edu\ccrm\domain\*.java src\edu\ccrm\service\*.java

# Run
java -cp bin edu.ccrm.cli.Main

# Clean (Windows)
rmdir /s /q bin && mkdir bin

# Clean (Linux/Mac)
rm -rf bin && mkdir bin
```

---

