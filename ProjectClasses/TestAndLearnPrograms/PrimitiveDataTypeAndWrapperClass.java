package JavaProjects.ProjectClasses.TestAndLearnPrograms;

public class PrimitiveDataTypeAndWrapperClass {
    // Using primitive int
    int primitiveInt = 10;

//    System.out.println("Primitive int: " + primitiveInt); as directly useng this is invalid using fun1() just to describe
    void fun1(){
        System.out.println("Primitive int: " + primitiveInt);
    }

    // Using Integer wrapper class
    // Integer wrapperInt = new Integer(10); //already deprecated after java 9, Not recommended, use Integer.valueOf(10)
    // System.out.println("Wrapper Integer: " + wrapperInt);
    Integer wrapperInt = Integer.valueOf(10);// value of contains value from -128 to 127 in the cache memory

    // Autoboxing
    Integer autoBoxedInt = 10; // int to Integer

    // Unboxing
    int unboxedInt = wrapperInt; // Integer to int

    // Using methods of Integer class
    {
        System.out.println("Integer toString: " + wrapperInt.toString());
        System.out.println("Integer hashCode: " + wrapperInt.hashCode());
        System.out.println("Integer intValue: " + wrapperInt.intValue());
    }//alternative to fun1() we can use this also, we can make it static or instance initializer block
}
