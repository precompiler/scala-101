package org.precompiler.scala101.ch14;

import scala.Function1;
import scala.Function2;
import scala.Tuple2;


/**
 * @author Richard Li
 */
public class UseScalaMethodInJava {
    public static void main(String[] args) {
        ScalaCalculator calc = new ScalaCalculator();
//      Scala lambda traits aren't compatible with Java lambda
//        long sum = calc.doCalc(1l, 2l, new Function2<Object, Object, Object>(){
//            @Override
//            public Object apply(Object v1, Object v2) {
//                return v1;
//            }
//
//            @Override
//            public Function1<Object, Function1<Object, Object>> curried() {
//                return null;
//            }
//
//            @Override
//            public Function1<Tuple2<Object, Object>, Object> tupled() {
//                return null;
//            }
//        });
//        System.out.println(sum);
    }
}
