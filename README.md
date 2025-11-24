# Campus Course & Records Manager (CCRM)

**Author:** [Dhruv Ghongade]
**Registration Number:** [24BAS10009]
**Version:** 1.0.0

---

## 1. Project Overview

The Campus Course & Records Manager (CCRM) is a console-based Java application built to handle the core administrative tasks of an educational institution. It provides a command-line interface (CLI) for managing students, courses, enrollments, and grades. The application also features utilities for data persistence through file import/export and a system for creating backups.

This project serves as a practical demonstration of Java SE capabilities, from fundamental syntax and object-oriented principles to advanced topics like the NIO.2 File API, Streams, functional interfaces, and design patterns.

### Key Features:
* **Student Management:** Add, list, update, and deactivate student records. Enroll and unenroll students from courses.
* **Course Management:** Create, list, update, and search for courses. Assign instructors to courses.
* **Grading & Transcripts:** Record student marks, compute GPA, and print formatted student transcripts.
* **Data Operations:** Import and export student and course data from/to CSV-like text files.
* **Backup Utility:** Create timestamped backups of all application data.
* **Reporting:** Generate simple reports, such as GPA distribution, using the Stream API.

---

## 2. How to Run

### Prerequisites
* Java Development Kit (JDK) Version: **[Enter Your JDK Version, e.g., JDK 17]**
* An IDE like Eclipse or IntelliJ IDEA (the project was developed using Eclipse).

### Steps
1.  Clone the repository to your local machine:
    ```bash
    git clone [Your Git Repository URL]
    ```
2.  Open the project in your IDE (e.g., Eclipse).
3.  Locate the main class at `edu.ccrm.cli.Main` and run it.
4.  The application's command-line menu will appear in the console.

---

## 3. Java Platform Explained

### Evolution of Java
* **JDK 1.0 (1996):** The initial release.
* **J2SE 1.2 (1998):** Introduced Swing, Collections Framework.
* **J2SE 5.0 (2004):** Added Generics, Enums, Annotations, Autoboxing.
* **Java SE 7 (2011):** Included NIO.2, try-with-resources, the diamond operator.
* **Java SE 8 (2014):** A major release introducing Lambda Expressions, the Stream API, and a new Date/Time API.
* **Java SE 9 (2017):** Introduced the Java Platform Module System.
* **Java SE 11 (2018):** The second Long-Term Support (LTS) release after Java 8.
* **Java SE 17 (2021):** The latest LTS release, bringing Sealed Classes and Pattern Matching for instanceof.

### Java ME vs. SE vs. EE
| Edition               | Full Name                          | Target Platform                                       | Key Features                                       |
| --------------------- | ---------------------------------- | ----------------------------------------------------- | -------------------------------------------------- |
| **Java ME** | Micro Edition                      | Resource-constrained devices (mobile, IoT, embedded)  | Small footprint, specialized APIs for mobile.      |
| **Java SE (This Project)** | Standard Edition               | Desktops, servers, general-purpose computing          | Core Java language, JVM, Collections, I/O, JDBC.   |
| **Java EE** | Enterprise Edition                 | Large-scale, multi-tiered enterprise applications     | Built on SE. Adds APIs for web services, servlets. |

### JDK vs. JRE vs. JVM
* **JVM (Java Virtual Machine):** An abstract machine that provides the runtime environment in which Java bytecode can be executed. It is platform-dependent.
* **JRE (Java Runtime Environment):** A software package that contains the JVM, standard libraries, and other components needed to *run* Java applications.
* **JDK (Java Development Kit):** A superset of the JRE. It contains everything in the JRE, plus development tools like the compiler (`javac`) and debugger, required to *create* Java applications.

**Interaction:** Developers write code and use the **JDK** to compile it. The compiled bytecode is then run on any machine that has a **JRE** installed. The **JRE** uses its **JVM** to execute that code.

---

## 4. Setup & Installation (Windows)

1.  **Download and Install JDK:** Download the appropriate JDK installer for Windows from the official Oracle website or an alternative like Adoptium. Run the installer and follow the on-screen instructions.
2.  **Configure Environment Variables:** Set the `JAVA_HOME` system variable to the JDK installation directory (e.g., `C:\Program Files\Java\jdk-17`). Add the `bin` folder of the JDK to the `Path` variable (e.g., `%JAVA_HOME%\bin`).
3.  **Verify Installation:** Open Command Prompt and run `java -version`. You should see your installed JDK version.

    **[Your screenshot of the `java -version` command output here]**

4.  **Eclipse IDE Setup:**
    * Create a new Java Project in Eclipse.
    * Set up a Run Configuration for the `main` class.

    **[Your screenshot of the Eclipse project setup here]**

---

## 5. Syllabus to Code Mapping Table

This table maps the project's technical requirements to the specific parts of the source code where they are demonstrated.

| Syllabus Topic | File / Class / Method Where Demonstrated |
| :--- | :--- |
| **Packages** | `edu.ccrm.cli`, `edu.ccrm.domain`, `edu.ccrm.service`, etc. |
| **Primitive Variables & Operators** | **[You fill this in, e.g., `Grade.java` constructor, `TranscriptService.java` for GPA calculation]** |
| **Decision Structures (if/switch)**| **[You fill this in, e.g., `Menu.java` for the main switch menu]** |
| **Loops (for, while, etc.)** | **[You fill this in, e.g., `Menu.java` for the main loop, `CourseService.java` for iterating courses]** |
| **Arrays and `Arrays` Class** | **[You fill this in, e.g., For sorting/searching student IDs]** |
| **Strings & Methods** | **[You fill this in, e.g., `ImportExportService.java` for parsing CSV lines with `split()`]** |
| **OOP - Encapsulation** | **[You fill this in, e.g., `Student.java` with private fields and public getters/setters]** |
| **OOP - Inheritance** | **[You fill this in, e.g., `Student` and `Instructor` classes extending an abstract `Person` class]** |
| **OOP - Abstraction** | **[You fill this in, e.g., `Person.java` as an abstract class with abstract methods]** |
| **OOP - Polymorphism** | **[You fill this in, e.g., `Transcript.java` using a `List<Person>` to print different details]** |
| **Immutability** | **[You fill this in, e.g., An immutable `CourseCode.java` value class]** |
| **Nested & Inner Classes** | **[You fill this in, e.g., The Builder pattern in `Course.java` as a static nested class]** |
| **Interfaces** | **[You fill this in, e.g., A `Searchable<T>` interface implemented by services]** |
| **Lambdas & Functional Interfaces**|
