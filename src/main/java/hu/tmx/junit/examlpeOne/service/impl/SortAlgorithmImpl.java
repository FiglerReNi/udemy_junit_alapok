package hu.tmx.junit.examlpeOne.service.impl;

import hu.tmx.junit.examlpeOne.service.SortAlgorithm;
import org.springframework.stereotype.Service;

@Service
public class SortAlgorithmImpl implements SortAlgorithm {
    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
