package hu.tmx.junit.exampleOne.service;

import hu.tmx.junit.exampleOne.service.impl.SortAlgorithmImpl;

public class BinarySearchSpring {

    SortAlgorithmImpl sortAlgorithmImpl;

    public void setSortAlgorithmImpl(SortAlgorithmImpl sortAlgorithmImpl) {
        this.sortAlgorithmImpl = sortAlgorithmImpl;
    }

    public int doBinarySearch(int[] numbers, int numberToSearchFor){
        int[] sortedNumbers = this.sortAlgorithmImpl.sort(numbers);
        return 3;
    }


}
