# Design-Patterns-In-Kotlin
### What is Design Patterns ?
<hr><p>
Design Patterns are a proven way to solve common programming problems. 
These issues or questions will usually arise during the software development period for programmers. 
Pattern design solutions are usually using object-oriented.
</p>

### Advantage of design pattern
<hr><p>
1. They are reusable in multiple projects. <br>
2. They provide the solutions that help to define the system architecture. <br>
3. They capture the software engineering experiences. <br>
4. They provide transparency to the design of an application. <br>
5. They are well-proved and testified solutions since they have been built upon the knowledge and experience of expert software developers.
</p>

### Type of design pattern 
<hr>

<h4><a href="#T1">&#9679; Creational Design Pattern</a></h4>
<P>

<a href="#C1">1. Factory Pattern </a><br>
<a href="#C2">2. Abstract Factory Pattern </a><br>
<a href="#C3">3. Singleton Pattern </a><br>
<a href="#C4">4. Prototype Pattern </a><br>
<a href="#C5">5. Builder Pattern</a>
</P>

<h4><a href="#T2">&#9679; Structural Design Pattern</a></h4>
<P>  
1. Adapter Pattern <br>
2. Bridge Pattern <br>
3. Composite Pattern <br>
4. Decorator Pattern <br>
5. Facade Pattern <br>
6. Flyweight Pattern <br>
7. Proxy Pattern <br>
</P>

<h4><a href="#T3">&#9679; Behavioral Design Pattern</a></h4>
<p>
&nbsp;&nbsp;1. Chain Of Responsibility Pattern <br>
&nbsp;&nbsp;2. Command Pattern <br>
&nbsp;&nbsp;3. Interpreter Pattern <br>
&nbsp;&nbsp;4. Iterator Pattern <br>
&nbsp;&nbsp;5. Mediator Pattern <br>
&nbsp;&nbsp;6. Memento Pattern <br>
&nbsp;&nbsp;7. Observer Pattern <br>
&nbsp;&nbsp;8. State Pattern <br> 
&nbsp;&nbsp;9. Strategy Pattern <br>
10. Template Pattern <br> 
11. Visitor Pattern
</p>

<h3 id="T1">Creational Design Pattern</h3>
<hr><p>
One of the sub-branches of Pattern Design is Creational Design Pattern. This pattern is a way to make things. 
This template is used when we want to create an object from a class in our program. 
But for many it may be very easy to build an object and just by new we create an object. 
But hard code is not a good solution Because we sometimes change the identity of a class in our code, and in such cases we have to use the Creational Design pattern.
</p>

<h4 id="C1"><a href="https://github.com/ghasem-79/Design-Patterns-In-Kotlin/blob/master/src/main/creational/FactoryPattern.kt">Factory Pattern</a></h4>
<hr><p>
The factory pattern is used to replace class constructors, 
abstracting the process of object generation so that the type of the object instantiated can be determined at run-time.
</p>

<img src="https://github.com/ghasem-79/Design-Patterns-In-Kotlin/blob/master/uml/FactoryPattern.png?raw=true" alt="factory"><br>

<p>
<b>Example</b><br>
</p>

    interface Shape {
        fun draw(): String
    }

    class Circle : Shape {
        override fun draw(): String {
            return "Shape : Circle"
        }
    }

    class Rectangle : Shape {
        override fun draw(): String {
            return "Shape : Rectangle"
        }
    }

    class Square : Shape {
        override fun draw(): String {
            return "Shape : Square"
        }
    }

    object ShapeFactory { // Factory create shapes
        enum class ShapeType {
            CIRCLE, RECTANGLE, SQUARE
        }
        
        fun createShape(type: ShapeType): Shape {
            return when (type) {
                ShapeType.CIRCLE -> Circle()
                ShapeType.RECTANGLE -> Rectangle()
                ShapeType.SQUARE -> Square()
            }
        }
    }

<p>
<b>Usage</b><br>
</p>

    val circle = ShapeFactory.createShape(ShapeFactory.ShapeType.CIRCLE)
    println(circle.draw())

    val rectangle = ShapeFactory.createShape(ShapeFactory.ShapeType.RECTANGLE)
    println(rectangle.draw())

    val square = ShapeFactory.createShape(ShapeFactory.ShapeType.SQUARE)
    println(square.draw())

<p>
<b>Output</b><br>
</p>

    Shape : Circle
    Shape : Rectangle
    Shape : Square
    
<h4 id="C2">Abstract Factory Pattern</h4>
<hr><p>

</p>

<h4 id="C3">Singleton Pattern</h4>
<hr><p>

</p>

<h4 id="C4">Prototype Pattern</h4>
<hr><p>

</p>

<h4 id="C5">Builder Pattern</h4>
<hr><p>

</p>

<h3 id="T2">Structural Design Pattern</h3>
<hr>

<h3 id="T3">Behavioral Design Pattern</h3>
<hr>
