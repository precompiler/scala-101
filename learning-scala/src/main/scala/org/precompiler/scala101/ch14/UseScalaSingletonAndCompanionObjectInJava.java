package org.precompiler.scala101.ch14;


import org.precompiler.scala101.ch141.Dummy;
import org.precompiler.scala101.ch141.Dummy$;

/**
 * @author Richard Li
 */
public class UseScalaSingletonAndCompanionObjectInJava {
    public static void main(String[] args) {
        ScalaObject.hello();
        Dummy d = new Dummy("abc");
        d.foo();
        Dummy$.MODULE$.print();
    }
}
