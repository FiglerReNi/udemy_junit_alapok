package hu.tmx.junit.exampleTwo.service;

import hu.tmx.junit.exampleTwo.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    TestDao testDao;

    @Autowired
    public void setTestDao(TestDao testDao) {
        this.testDao = testDao;
    }

    public TestDao getTestDao() {
        return testDao;
    }

    public int findGreatest(){
        int greatest = Integer.MIN_VALUE;
        int [] datas = testDao.getData();
        for (int value: datas) {
            if(value > greatest){
                greatest = value;
            }
        }
        return greatest;
    }
}
