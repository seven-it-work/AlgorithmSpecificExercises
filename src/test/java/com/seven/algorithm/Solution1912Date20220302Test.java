package com.seven.algorithm;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution1912Date20220302Test {
    @Test
    void case01() {
        // 3个 商店 0 1 2
        int n = 3;
        int[][] entries = new int[][]{
                {0, 1, 5},
                {0, 2, 6},
                {0, 3, 7},
                {1, 1, 4},
                {1, 2, 7},
                {2, 1, 5},
        };
        Solution1912Date20220302.MovieRentingSystem movieRentingSystem = new Solution1912Date20220302.MovieRentingSystem(n, entries);

        assertEquals(Arrays.asList(1, 0, 2), movieRentingSystem.search(1));
        movieRentingSystem.rent(0, 1);
        movieRentingSystem.rent(1, 2);
        assertEquals(Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1, 2)), movieRentingSystem.report());
        movieRentingSystem.drop(1, 2);
        assertEquals(Arrays.asList(0, 1), movieRentingSystem.search(2));


    }

}