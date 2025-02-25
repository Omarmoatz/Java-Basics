// Polymorphism : Poly means many and morphism means forms. Polymorphism is a feature of OOPs that allows us to perform a single action in different ways.
// In other words, polymorphism allows you to define one interface and have multiple implementations.
// There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism.
// Compile-time polymorphism is method overloading and runtime polymorphism is method overriding.

// Method Overloading: Method overloading is a feature that allows a class to have more than one method having the same name, if their argument lists are different.
// final == constant

import array.*; 

class Polymorphism {
    public static void main(String a[]){
        A obj = new A();
        obj.display();

        obj = new B();
        obj.display();

        obj = new C();
        obj.display();
    }
}

class A{
    final void owner(){
        System.out.println("omar is the owner");
    }

    void display(){
        System.out.println("in Class A");
    }
}

class B extends A{

    void display(){
        System.out.println("in Class B");
    }
}

class C extends A{
    void display(){
        System.out.println("in Class C");
    }
}

