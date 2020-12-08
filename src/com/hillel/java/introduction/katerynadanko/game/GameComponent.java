package com.hillel.java.introduction.katerynadanko.game;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface GameComponent {
String massage() default "This class belongs to game";

}
