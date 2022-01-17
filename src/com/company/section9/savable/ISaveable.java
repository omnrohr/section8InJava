package com.company.section9.savable;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> saveAble);
}
