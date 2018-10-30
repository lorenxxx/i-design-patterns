package com.us.improve.designpatterns.decorate;

import com.us.improve.designpatterns.decorate.component.Beverage;
import com.us.improve.designpatterns.decorate.component.Coco;
import com.us.improve.designpatterns.decorate.component.MilkTea;
import com.us.improve.designpatterns.decorate.decorator.CoconutDecorator;
import com.us.improve.designpatterns.decorate.decorator.PearlDecorator;

/**
 * 当使用装饰模式时
 *
 * Created by Loren on 2018/10/30.
 */
public class MainTest {

    public static void main(String[] args) {
        // 一个顾客A来了，要一杯原味奶茶
        Beverage milkTea = new MilkTea();
        System.out.println(milkTea.getDescription() + ": " + milkTea.getCost() + "元");

        // 一个顾客B来了，要一杯奶茶，加珍珠
        Beverage milkTeaWithPearl = new MilkTea();
        milkTeaWithPearl = new PearlDecorator(milkTeaWithPearl);
        System.out.println(milkTeaWithPearl.getDescription() + ": " + milkTeaWithPearl.getCost() + "元");

        // 一个顾客C来了，要一杯奶茶，加椰果
        Beverage milkTeaWithCoconut = new MilkTea();
        milkTeaWithCoconut = new CoconutDecorator(milkTeaWithCoconut);
        System.out.println(milkTeaWithCoconut.getDescription() + ": " + milkTeaWithCoconut.getCost() + "元");

        // 一个顾客D来了，要一杯可可，双倍椰果
        Beverage cocoWithDoubleCoconut = new Coco();
        cocoWithDoubleCoconut = new CoconutDecorator(cocoWithDoubleCoconut);
        cocoWithDoubleCoconut = new CoconutDecorator(cocoWithDoubleCoconut);
        System.out.println(cocoWithDoubleCoconut.getDescription() + ": " + cocoWithDoubleCoconut.getCost() + "元");

        // 一个顾客E来了，要一杯可可，加珍珠，加椰果
        Beverage cocoWithPearlAndCoconut = new Coco();
        cocoWithPearlAndCoconut = new PearlDecorator(cocoWithPearlAndCoconut);
        cocoWithPearlAndCoconut = new CoconutDecorator(cocoWithPearlAndCoconut);
        System.out.println(cocoWithPearlAndCoconut.getDescription() + ": " + cocoWithPearlAndCoconut.getCost() + "元");
    }

}
