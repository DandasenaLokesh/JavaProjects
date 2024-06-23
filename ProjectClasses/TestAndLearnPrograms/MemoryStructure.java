package JavaProjects.ProjectClasses.TestAndLearnPrograms;

public class MemoryStructure {// Class MemoryStructure and its details in Method Area

    public static int staticVar = 10; // Static variable in Method Area
    public int instanceVar;           // Instance variable in Heap Memory

    public MemoryStructure(int instanceVar) {
        this.instanceVar = instanceVar; // Assigning value to instance variable
    }

    public static void staticMethod() {
        System.out.println("Static Method");
    }

    public void instanceMethod() {
        int localVar = 20;  // Local variable in Stack Memory
        System.out.println("Instance Method");
    }

//        public static void main(String[] args) {
//            MemoryStructure obj = new MemoryStructure(30); // Object in Heap Memory
//            obj.instanceMethod();          // Method call, affecting Stack Memory
//        }

     /*         +-----------------------------+
            |         Method Area         |
            +-----------------------------+
            | Class: MemoryStructure              |
            | - staticVar = 10            |
            | - staticMethod()            |
            +-----------------------------+

            +-----------------------------+
            |          Heap Memory        |
            +-----------------------------+
            | MemoryStructure Object              |
            | - instanceVar = 30          |
            +-----------------------------+

            +-----------------------------+
            |         Stack Memory        |
            +-----------------------------+
            | main()                      |
            | - obj (reference to Heap)   |
            |                             |
            | instanceMethod()            |
            | - localVar = 20             |
            +-----------------------------+

            1.Class Loading:
                MemoryStructure class is loaded into the Method Area.
                staticVar and staticMethod are stored in the Method Area.
            2.Main Method Execution:
                main method frame is created in the Stack Memory of the main thread.
            3.Object Creation:
                MemoryStructure obj = new MemoryStructure(30);
                A new MemoryStructure object is created in the Heap Memory.
                instanceVar of the object is set to 30.
            4.Method Call:
                obj.instanceMethod();
                instanceMethod frame is created in the Stack Memory.
                localVar is stored in the Stack Memory.
                Method executes and completes, and its frame is removed from the Stack.


            Summary of Memory Areas
                Method Area: Stores class-level information, static variables, method data.
                Heap Memory: Stores objects and instance variables.
                Stack Memory: Manages method invocations, local variables, and references.
                Program Counter Register: Keeps track of the next instruction for each thread.
                Native Method Stack: Manages native method invocations and references.

*/

}
