package com;

import java.util.List;

public interface ResOperation {

    void createRes(ResTableEntity res);                            // создание записи

    ResTableEntity getResById(int id);                             // получить по параметру

    List<ResTableEntity> getAllResorts();                          // получить все

    void updateRes(int id, List<String> newParams);                // обновить

    void deleteResById(int id);                                    // удалить



}
