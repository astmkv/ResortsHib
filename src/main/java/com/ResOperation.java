package com;

import java.util.List;

public interface ResOperation {

    void createRes(ResTableEntity res);                                     // создание записи

    ResTableEntity getResByName(String param);                             // получить по параметру

    List<ResTableEntity> getAllResorts();                                   // получить все

    void updateRes(ResTableEntity res);                                     // обновить

    boolean deleteResById(int id);                      // удалить


}
