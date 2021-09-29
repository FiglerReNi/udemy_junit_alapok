package hu.tmx.junit.exampleOne.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BinarySearchSpring {

    private SortAlgorithm sortAlgorithm;

    @Autowired
    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int doBinarySearch(int[] numbers, int numberToSearchFor){
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        return 3;
    }
}
