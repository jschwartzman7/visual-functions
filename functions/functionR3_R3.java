public class functionR3_R3 implements abstractFunction{

    public functionR3_R3(){
        
    }

    public double[] f(double[] inputVector){
        return new double[]{x(inputVector), y(inputVector), z(inputVector)};
    }

    public double x(double[] inputVector){
        return inputVector[0] + inputVector[1];
        }

    public double y(double[] inputVector){
        return 2*inputVector[2];
    }

    public double z(double[] inputVector){
        return Math.pow(inputVector[1], 2);
    }


    public double[] zero(){
        return new double[]{0, 0, 0};
    }
}
