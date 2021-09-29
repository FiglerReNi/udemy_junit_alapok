package hu.tmx.junit.exampleOne.service.impl;

import hu.tmx.junit.exampleOne.service.SortAlgorithm;
import org.springframework.stereotype.Service;

@Service
public class SortAlgorithmImpl implements SortAlgorithm {
    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
