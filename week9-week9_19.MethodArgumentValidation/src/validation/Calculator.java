package validation;

public class Calculator {

    public int multiplication(int fromInteger) {
        
        if (fromInteger < 0){
            throw new IllegalArgumentException("fromInteger must be positive");
        }
        
        int multiplication = 1;
        for (int i = 1; i <= fromInteger; i++) {
            multiplication *= i;
        }

        return multiplication;
    }

    public int binomialCoefficient(int setSize, int subsetSize) {
        
        if (setSize < 0 || subsetSize < 0){
            throw new IllegalArgumentException("Both sets must be nonnegative.");
        }
        if (subsetSize >= setSize){
            throw new IllegalArgumentException("Subset must be be less than or equal to set size");
        }
       
        int numerator = multiplication(setSize);
        int denominator = multiplication(subsetSize) * multiplication(setSize - subsetSize);

        return numerator / denominator;
    }
}


/*
if (fromInteger < 0){
            throw new IllegalArgumentException("fromInteger must be positive or zero");
        }
        
        


 if (setSize < 0 || subsetSize < 0 || subsetSize >= setSize){
            throw new IllegalArgumentException("setSize and subsetSize must be greater than zero");
        }

        
*/