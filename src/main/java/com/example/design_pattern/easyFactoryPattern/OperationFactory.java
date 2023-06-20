package com.example.design_pattern.easyFactoryPattern;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/13 19:54
 */
public class OperationFactory {

    public static Operation createOperation(String calSign){
        // 父类
        Operation opr = null;
        switch (calSign){
            case "+":
                opr =  new AddOperation();
                break;
            case "-":
                opr = new SubOperation();
                break;
            default:
                System.out.println("暂未涉及该类运算");
                break;
        }
        return opr;
    }

}
