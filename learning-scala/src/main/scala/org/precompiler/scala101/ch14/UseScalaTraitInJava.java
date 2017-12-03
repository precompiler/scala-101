package org.precompiler.scala101.ch14;

/**
 * @author Richard Li
 */
public class UseScalaTraitInJava {
    public static void main(String[] args) {
        ScalaTrait s = new ScalaTrait() {
            @Override
            public void foo() {
                System.out.println("foo in java");
            }

            @Override
            public void bar() {
                ScalaTrait$class.bar(this);
                System.out.println("bar in java");
            }
        };
        s.bar();
        s.foo();

    }

}
