package com.example.repository;


import com.example.model.Assign;

import com.example.model.KpModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

@Component
public class Parser {
    private static boolean isRowEmpty;
    @Autowired
    private Assign assign;


    public List<KpModel> pars(File file) {




        List<KpModel> result = new ArrayList<>();

        InputStream inputStream = null;

        XSSFWorkbook workBook = null;

        try {
            inputStream = new FileInputStream(file);

            workBook = new XSSFWorkbook(inputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }

        Sheet sheet = workBook.getSheetAt(0);

        // Добавить валидацию файла на наличие недопустимых пустых ячеек

//
//        // удаляет пустые сроки в файле(нюансы Exel) но пока работает .50/50 Проще написать валидацию файла
//        for(int i = 0; i < sheet.getLastRowNum(); i++){
//            if(sheet.getRow(i)==null){
//                isRowEmpty=true;
//                sheet.shiftRows(i + 1, sheet.getLastRowNum(), -1);
//                i--;
//                continue;
//            }
//            for(int j =0; j<sheet.getRow(i).getLastCellNum();j++){
//                if( sheet.getRow(i).getCell(j) == null || sheet.getRow(i).getCell(j).toString().trim().equals("")){
//                    isRowEmpty=true;
//                }else {
//                    isRowEmpty=false;
//                    break;
//                }
//            }
//            if(isRowEmpty==true){
//                sheet.shiftRows(i + 1, sheet.getLastRowNum(), -1);
//                i--;
//            }
//
//        }



        Iterator<Row> it = sheet.iterator();


        it.next(); // пропускаем первый ряд при условии договоренности структуры файла!
        while (it.hasNext()) {

            Row row = it.next();

            if(!(row==null)) {
                KpModel kpModel=assign.assignModel(row);

              if (!(kpModel == null)) {
                  result.add(kpModel);
              }
            }
        }
        return result;

    }



}
