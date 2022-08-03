
package datastruct03delosreyes;

import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author Lowil Ray C. Delos Reyes
 */
public class QueueProcess extends Main{
    private Queue q1 = new LinkedList(); //2nd Queue Variable
    private Queue q2 = new LinkedList(); //2nd Queue Variable
    private int t; //Toggle q1 and q2 Simulation
    
    //Store the Input to q1
    @Override
    public void get_Input(String val){
        try{
            q1.add(val);
        }
        catch (Exception e){ 
        
        }
    }
    
    //Clear all Queues
    public void ClearAll(){
        q1.clear();
        q2.clear();
    }
    
    //Simulate the Queue(q1 and q2) vice versa
    public void QueueSimulate(){
        if (q1.isEmpty()){
            t = 0;
        }else if (q2.isEmpty()){
            t = 1; 
        }else {
            
        }

        if (t == 0){
            q1.add(q2.remove());
        }else if (t == 1){
            q2.add(q1.remove());
        }else{
                
        }  
    }
    
    //Display the q1
    public Queue ShowQueue01(){
        return q1;
    }
    
    //Display the q2
    public Queue ShowQueue02(){
        return q2;
    }
    
    //Display Size of Overall Queue
    public int InitialQueueCount(){
        return q1.size();
    }
    
}
