/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel Francis Estanol
 */
public class Timer {
    private ClockHand hundredthsSecond;
    private ClockHand second;
    
    public Timer(){
        hundredthsSecond = new ClockHand(100);
        second = new ClockHand(60);
    }
    
    public void advance(){
        this.hundredthsSecond.advance();
        
        if(this.hundredthsSecond.value()==0){
            this.second.advance();
        }
    }
    
    public String toString(){
        return second + ":" + hundredthsSecond;
    }
}
