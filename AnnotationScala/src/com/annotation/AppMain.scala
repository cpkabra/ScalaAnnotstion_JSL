package com.annotation
import com.annotation.Methods
object AppMain {

  def main(args:Array[String]): Unit ={
        AnnotationParser.parser(classOf[Methods])
  }
}
