
/**
 * Write a description of class Probablity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Probability implements ProbabilityCalc, Comparable<Probability>
{
    private int favorable;
    private int sample;
    private double prob;
    
    /**
     * Constructor for objects of class Probablity
     */
    public Probability(int fav, int sam)
    {
       
       this.favorable = fav;
       this.sample = sam;
       prob = ((double)favorable)/sam;
    }
    
    public double probabilityAND(Probability p2){
        return this.prob * p2.prob;
    }
    


    public double probabilityOR(Probability p2, double overlap){
        return this.prob + p2.prob - overlap;
    }
    
    public double getProb() {
        return this.prob;
    }
   
    public int compareTo(Probability p2) {
     if (this.prob == p2.prob) {
         return 0;
        }
        else if(this.prob > p2.prob) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
