package dad.codesignal;

public class EdgeOfTheOcean {
    public int adjacentElementsProduct(int[] inputArray) {
        int product = 0;
        int highest = product;
        boolean started = false;

        for(int i = 0; i < inputArray.length - 1; i++) {
        
            product = inputArray[i] * inputArray[i + 1];
            
            if(started == true) {
                if(product > highest) {
                    highest = product;
                }
            } else {
                started = true;
                highest = product;
            }
        }
        return product;
    }
}
