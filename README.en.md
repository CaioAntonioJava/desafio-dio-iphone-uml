[PORTUGUÊS - pt-BR ](https://github.com/CaioAntonioJava/desafio-dio-iphone-uml/blob/main/README.md)
# POO Challenge - iPhone UML and Java implementation 📱

A challenge developed in collaboration between [Digital Innovation One](https://www.dio.me/) and the bank [Santander](https://www.santander.com.br/), it proposes exploring the functions of the iPhone through modeling in UML and implementation in Java, inspired by Steve Jobs' iconic 2007 conference. This project demonstrates how design, programming and innovation work together to create a revolutionary product.

## **Main Objectives**

- To highlight the revolutionary design of the iPhone;
- Provide a clear visual and technical representation of Apple's vision for the iPhone;
- Apply the fundamentals of Object-Oriented Programming (OOP) and Unified Modeling Language (UML).

## **Concepts Used in Development**

- Object-Oriented Programming (OOP);
- Classes and packages;
- Pillars of OOP (encapsulation, inheritance, etc.);
- Interfaces;
- Unified Modeling (UML).

With this background, we're going to model the functions of the iPhone as :
**Music Player 
**Telephone Device**,
and Internet Browser**.

**NOTE: We will include the Java implementations of the main components, demonstrating how the iPhone integrates these functionalities into a single device.

![GitHub](https://img.shields.io/badge/GitHub-000?style=for-the-badge&logo=github&logoColor=30A3DC)
![Git](https://img.shields.io/badge/Git-000?style=for-the-badge&logo=git&logoColor=E94D5F)
![Java](https://img.shields.io/badge/Java-000?style=for-the-badge&logo=openjdk&logoColor=ED8B00)
 
## UML diagram
Developed using [Mermaid](https://mermaid.js.org/) syntax, a JavaScript-based diagramming and graphics tool that processes Markdown-inspired text definitions to dynamically create and modify diagrams.
```mermaid
classDiagram
 class MusicPlayer {
        +playMusic()
        +pauseMusic()
        +selectMusic()
 }

    class phoneHandset {
        +call(String number)
        +acceptCall()
        +startVoicemail()
 }

    class Browser {
        +displayPage(url: String)
        +addNewTab()
        +updatePage()
 }

    class iPhone {
        +String model
        +Integer capacityStorage
        +BigDecimal price
 }


iPhone --> Music Player
iPhone --> Handset
iPhone --> Web Browser
```
