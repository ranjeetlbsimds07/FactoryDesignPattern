package example.design.factory.com.factorydesignpattern.factoryclass;

import example.design.factory.com.factorydesignpattern.abstracts.ILoginAuthorization;
import example.design.factory.com.factorydesignpattern.abstracts.ILoginCallBack;
import example.design.factory.com.factorydesignpattern.abstracts.Shape;
import example.design.factory.com.factorydesignpattern.implementation.Circle;
import example.design.factory.com.factorydesignpattern.implementation.LoginImp;
import example.design.factory.com.factorydesignpattern.implementation.Rectangle;
import example.design.factory.com.factorydesignpattern.implementation.Square;

/**
 * Created by Guest User on 10/16/2017.
 */

public class ShapeFactory {

    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;

    }

    public ILoginAuthorization getLogin(String getLogin){
        if(getLogin == null){
            return null;
        }
        if(getLogin.equalsIgnoreCase("Login")){
            return new LoginImp();
        }


        return null;

    }
}
