package com.annotation
import java.lang.reflect.Method
object AnnotationParser {

  def parser(cls:Class[_]): Unit ={
    val methods:Array[Method]=cls.getMethods();

    for(method<- methods if (method.isAnnotationPresent(classOf[CopyRight]))){
    val obj :CopyRight=method.getAnnotation(classOf[CopyRight])
      val name:String=obj.info()
      println("this function is created by " + name)

      //Invoke of method
      method.invoke(classOf[Methods].newInstance())

    }
  }
}
