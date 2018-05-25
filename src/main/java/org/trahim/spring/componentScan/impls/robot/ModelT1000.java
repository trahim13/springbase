package org.trahim.spring.componentScan.impls.robot;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.trahim.spring.componentScan.interfaces.Hand;
import org.trahim.spring.componentScan.interfaces.Head;
import org.trahim.spring.componentScan.interfaces.Leg;
import org.trahim.spring.componentScan.interfaces.Robot;
@Component
public class ModelT1000 implements Robot, InitializingBean, DisposableBean {

    @Autowired
    private Hand hand;

    @Autowired
    private Leg leg;

    @Autowired
    private Head head;


    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ModelT1000 model1() {
        return new ModelT1000();
    }


    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ModelT1000 model2() {
        return new ModelT1000("WHITE", 2018, true);
    }
    private String color;
    private int year;
    private boolean soundEnabled;

    public ModelT1000() {
    }

    public ModelT1000(Hand hand, Leg leg, Head head) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public ModelT1000(Hand hand, Leg leg, Head head, String color, int year, boolean soundEnabled) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public ModelT1000(String color, int year, boolean soundEnabled) {
        super();
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    @Override
    public void action() {
        head.calc();
        hand.catchSomething();
        leg.go();
        System.out.println("color: " + color);
        System.out.println("year: " + year);
        System.out.println("can play sound: " + soundEnabled);
    }


    public void initMethod() {
        System.out.println("Init method");

    }

    public void destroyMethod() {

        System.out.println("Destriy method");
    }


    public void defaultInitMethod() {
        System.out.println("default init method");

    }

    public void defaultDestroyMethod() {

        System.out.println("Defaul destriy method");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this + " InitializingBean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(this + " destroy");
    }

    @Override
    public void dance() {
        System.out.println("T1000 is dancing!");
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }

}
