//fun main(){
    //val animal: Animal = Dog()             //Upcasting assigns a subclass (Dog) to a superclass (Animal),
    //val dog = animal as Dog               // while down casting explicitly converts it back using the 'as' keyword,
    //dog.bark()                           // allowing access to subclass-specific methods like bark().
//}

//open class Animal                        //The 'open' keyword allows the 'Animal' class to be inherited,
//class Dog: Animal(){                    // enabling 'Dog' to subclass it and define a 'bark()' method that prints "Woof! Woof!"
    //fun bark(){                        // (By default, Kotlin classes are 'final' (cannot be inherited), so open is necessary)
        //println("Woof! Woof!")
    //}
//}


                            //*Potential Improvements


fun main(){                             //The main() function starts execution,
    val animal: Animal = Dog()         //where upcasting assigns a 'Dog' instance to an 'Animal' variable,
    animal.makeSound()                //and due to 'polymorphism', calling 'makeSound()' executes the overridden 'Dog' version.
}


open class Animal {                              //The 'Animal' class is declared open, allowing it to be inherited.
    open fun makeSound() {                      //It defines an 'open function makeSound()' that prints "Some generic animal sound".
        println("Some generic animal sound")   //The 'open' keyword allows subclasses to override this method.
    }
}

class Dog : Animal() {                       //'Dog' is a subclass of 'Animal'.
    override fun makeSound() {              //It overrides the 'makeSound()' method using the 'override' keyword
        println("Woof! Woof!")             //This ensures that when 'makeSound()' is called on an 'Animal' reference holding a 'Dog' object,
    }                                     // "Woof! Woof!" is printed instead of "Some generic animal sound"
}

//*This makes the design more scalable and maintainable.