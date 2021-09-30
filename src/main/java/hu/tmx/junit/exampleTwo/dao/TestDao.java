package hu.tmx.junit.exampleTwo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class TestDao {

    public int[] getData(){
        return  new int[] {5, 89, 100};
    }
}
