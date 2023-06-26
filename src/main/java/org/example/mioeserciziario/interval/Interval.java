package org.example.mioeserciziario.interval;

public class Interval {
    private double leftValue;
    private double rightValue;
    private boolean openLeft;
    private boolean openRight;

    private Interval(double leftValue, double rightValue, boolean openLeft, boolean openRight) {
        this.leftValue = leftValue;
        this.rightValue = rightValue;
        this.openLeft = openLeft;
        this.openRight = openRight;
    }

    public static Interval open (double l, double r){
        return new Interval (l,r,true,true);
    }


    public static Interval closed (double l, double r){
        return new Interval(l,r,false,false);
    }

    public boolean contains(double value){
        if(leftValue<value && value<rightValue){
            return true;
        }
        return false;
    }

    public Interval join (Interval newInterval){
        double newLeft,newRight;
        boolean newOpenLeft,newOpenRight;
        if (leftValue<=newInterval.leftValue){
            newLeft=leftValue;
            newOpenLeft=openLeft;
        }else{
            newLeft= newInterval.leftValue;
            newOpenLeft=newInterval.openLeft;
        }

        if(rightValue>=newInterval.rightValue){
            newRight=rightValue;
            newOpenRight=openRight;
        }else{
            newRight=newInterval.rightValue;
            newOpenRight=newInterval.openRight;
        }

        return new Interval(newLeft,newRight,newOpenLeft,newOpenRight);
    }

    public String toString (){
        String retString="";
        if (openLeft)
            retString+="(";
        else
            retString+="[";
        retString+=leftValue+", "+rightValue;
        if(openRight)
            retString+=")";
        else
            retString+="]";

        return retString;
    }
}
