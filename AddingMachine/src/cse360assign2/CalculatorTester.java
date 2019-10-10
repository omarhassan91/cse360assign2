package cse360assign2;

public class CalculatorTester {
   public static void main(String[] args) {
       // create Calculator class object
       AddingMachine myCalculator=new AddingMachine();
       myCalculator.add(4); // call add() method
       myCalculator.subtract(2); // call subtract() method
       myCalculator.add(5);
       System.out.println(myCalculator.toString());
       System.out.println("Total= "+myCalculator.getTotal());
   }
}