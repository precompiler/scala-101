package org.precompiler.scala101.ch01

import scala.io.Source


/**
  *
  * @author Richard Li
  */
object TopStock extends App {
  val symbols = List("AMD", "AAPL", "AMZN", "IBM", "ORCL", "MSFT")
  val year = 2014
  val (topStock, topPrice) =
    symbols.map(ticker => (ticker, getYearEndClosingPrice(ticker, year))).maxBy(stockPrice => stockPrice._2)
  printf(s"Top stock of ${year} is ${topStock} closing at price $$${topPrice}")

  def getYearEndClosingPrice(symbol: String, year: Int): Double = {
    // from date: a=month b=day c=year  to date: d=month e=day f=year
    val url = s"https://ichart.finance.yahoo.com/table.csv?s=${symbol}&a=11&b=01&c=${year}&d=11&e=31&f=${year}&g=m"
    val data = Source.fromURL(url).mkString
    println(data)
    val price = data.split("\n")(1).split(",")(4).toDouble
    price
  }
}
