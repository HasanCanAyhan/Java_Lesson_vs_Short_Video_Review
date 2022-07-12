package java_short_video.OOPAbstraction.Interface.Extends_vs_ImplementsKeyword;

/*
One class can extend only one class, but one class can implement multiple interfaces .It gives "Multi Inheritance"
 */

interface C{

}


interface B{

}


interface A extends B , C{ // interface extends  multiple interfaces

}


abstract class X{


}

class Y  extends X { // one class extends one class only

}

class Z implements C,B,A{ // class implements multiple interfaces

}



public class Extends_vs_ImplementsKeyword  extends X implements C,B{

}
