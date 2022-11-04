package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DBResortControlTest {
    @Test
    void createRes(){
        ResTableEntity res = new ResTableEntity("TEST","C_TEST","S_TEST", 99L);
        DBResortControl dbResortControl = new DBResortControl();
        dbResortControl.createRes(res);
    }


    @Test
    void deleteResByName() {
    }
}