
/**
 * Write a description of class ds here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProbDriver
{
    public static void main(String[] args) {
        Probability p1= new Probability(6,10);
        Probability p2= new Probability(4,10);
        
        System.out.println(p1.probabilityAND(p2));
        System.out.println(p1.probabilityOR(p2, 0));
    }
}