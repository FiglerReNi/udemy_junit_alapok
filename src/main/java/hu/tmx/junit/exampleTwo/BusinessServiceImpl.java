package hu.tmx.junit.exampleTwo;

public class BusinessServiceImpl{

    private DataService dataService;

    public BusinessServiceImpl(DataService dataService) {
        this.dataService = dataService;
    }

    public int findTheGreatestFromAllData(){
        int[] data = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;

        for (int value: data) {
            if(value > greatest){
                greatest = value;
            }
        }
        return greatest;
    }

}
