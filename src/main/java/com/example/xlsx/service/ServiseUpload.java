package com.example.xlsx.service;


import com.example.xlsx.model.KpModel;
import com.example.xlsx.repository.Parser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
public class ServiseUpload {

    @Autowired
    private Parser parser;

    public List<KpModel> ponse(File file) {

        return parser.pars(file);
    }

}
