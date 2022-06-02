package com.example.xlsx.model;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellUtil;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Assign {


    public KpModel assignModel(Row row) {
// т.к на данный момент нет информации какие ячейки могут быть пустыми валидация по первой ячейке


        if (!(CellUtil.getCell(row, 0).getCellTypeEnum() == CellType.BLANK || CellUtil.getCell(row, 0).toString().trim().equals(""))) {
            KpModel model = KpModel
                    .builder()

                    .responsibleBranch(CellUtil.getCell(row, 0).getStringCellValue())
                    .treaty(CellUtil.getCell(row, 1).getStringCellValue())
                    .nameOfTheContract(CellUtil.getCell(row, 2).getStringCellValue())
                    .agreementStatus(CellUtil.getCell(row, 3).getStringCellValue())
                    .typesOfWorkContract(CellUtil.getCell(row, 4).getStringCellValue())
                    .gipContract(CellUtil.getCell(row, 5).getStringCellValue())
                    .cipher(CellUtil.getCell(row, 6).getStringCellValue())
                    .singleContract(CellUtil.getCell(row, 7).getStringCellValue())
                    .codeIMS(CellUtil.getCell(row, 8).getStringCellValue())
                    .customer(CellUtil.getCell(row, 9).getStringCellValue())
                    .agent(CellUtil.getCell(row, 10).getStringCellValue())
                    .designObject(CellUtil.getCell(row, 11).getStringCellValue())
                    .costContract((int) CellUtil.getCell(row, 12).getNumericCellValue())
                    .costContractNds((int) CellUtil.getCell(row, 13).getNumericCellValue())
                    .termsStart((Date) CellUtil.getCell(row, 14).getDateCellValue())
                    .termsEnd((Date) CellUtil.getCell(row, 15).getDateCellValue())
                    .stage(CellUtil.getCell(row, 16).getStringCellValue())
                    .stageNumber(CellUtil.getCell(row, 17).getStringCellValue())
                    .stageName(CellUtil.getCell(row, 18).getStringCellValue())
                    .typesJobs(CellUtil.getCell(row, 19).getStringCellValue())
                    .gip(CellUtil.getCell(row, 20).getStringCellValue())
                    .costStageCp((int) CellUtil.getCell(row, 21).getNumericCellValue())
                    .costStageCpNds((int) CellUtil.getCell(row, 22).getNumericCellValue())
                    .sumAmountAct((int) CellUtil.getCell(row, 23).getNumericCellValue())
                    .sumAmountActSs((int) CellUtil.getCell(row, 24).getNumericCellValue())
                    .sumAmountActSp((int) CellUtil.getCell(row, 25).getNumericCellValue())
                    .sumAmountActNds((int) CellUtil.getCell(row, 26).getNumericCellValue())
                    .sumAmountActNdsSs((int) CellUtil.getCell(row, 27).getNumericCellValue())
                    .sumAmountActNdsSp((int) CellUtil.getCell(row, 28).getNumericCellValue())
                    .sheduleStartDate((Date) CellUtil.getCell(row, 29).getDateCellValue())
                    .plannedStartDate((Date) CellUtil.getCell(row, 30).getDateCellValue())
                    .actualStartDate((Date) CellUtil.getCell(row, 31).getDateCellValue())
                    .dateEndCalendarPlan((Date) CellUtil.getCell(row, 32).getDateCellValue())
                    .dateEndPreviousMonth((Date) CellUtil.getCell(row, 33).getDateCellValue())
                    .plannedEndDate((Date) CellUtil.getCell(row, 34).getDateCellValue())
                    .actualEndDate((Date) CellUtil.getCell(row, 35).getDateCellValue())
                    .numbersActsGrouping(CellUtil.getCell(row, 36).getStringCellValue())
                    .plannedApplicationDate((Date) CellUtil.getCell(row, 37).getDateCellValue())
                    .dateApplication((Date) CellUtil.getCell(row, 38).getDateCellValue())
                    .dateApprovalApplication((Date) CellUtil.getCell(row, 39).getDateCellValue())
                    .referralDate((Date) CellUtil.getCell(row, 40).getDateCellValue())
                    .datesCancellationActs((Date) CellUtil.getCell(row, 41).getDateCellValue())
                    .plannedDateSigning((Date) CellUtil.getCell(row, 42).getDateCellValue())
                    .datesSigning((Date) CellUtil.getCell(row, 43).getDateCellValue())
                    .completedPreviousMonth((int) CellUtil.getCell(row, 44).getNumericCellValue())
                    //где-то косяк в файле поэтому стринг
                    .completedReportingMonth(CellUtil.getCell(row, 36).toString())

                    .reasonDelay(CellUtil.getCell(row, 46).getStringCellValue())
                    .note(CellUtil.getCell(row, 47).getStringCellValue())
                    .curtorContract(CellUtil.getCell(row, 48).getStringCellValue())
                    .commentary(CellUtil.getCell(row, 49).getStringCellValue())
                    .stageID(CellUtil.getCell(row, 50).getStringCellValue())

                    .build();


            return model;
        }
        return null;
    }

}
