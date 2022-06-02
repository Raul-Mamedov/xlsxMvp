package com.example.xlsx.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;



import java.util.Date;

@Builder

@Getter
@Setter
public class KpModel {


    @JsonProperty("Ответственный филиал")
    private String responsibleBranch;
    @JsonProperty("Договор")
    private String treaty;
    @JsonProperty("Наименование договора")
    private String nameOfTheContract;
    @JsonProperty("Статус договора")
    private String agreementStatus;
    @JsonProperty("Виды работ по договору")
    private String typesOfWorkContract;
    @JsonProperty("ГИП по договору")
    private String gipContract;
    @JsonProperty("Шифр")
    private String cipher;
    @JsonProperty("Принадлежность к единому договору")
    private String singleContract;
    @JsonProperty("Код ИУС")
    private String codeIMS;
    @JsonProperty("Заказчик")
    private String customer;
    @JsonProperty("Агент")
    private String agent;
    @JsonProperty("Объект проектирования")
    private String designObject;
    @JsonProperty("Стоимость договора по КП")
    private int costContract;
    @JsonProperty("Стоимость договора по КП с НДС")
    private int costContractNds;
    @JsonProperty("Сроки по договору Начало")
    private Date termsStart;
    @JsonProperty("Сроки по договору Окончание")
    private Date termsEnd;
    @JsonProperty("Этап")
    private String stage;
    @JsonProperty("Номер этапа")
    private String stageNumber;
    @JsonProperty("Наименование этапа")
    private String stageName;
    @JsonProperty("Виды работ")
    private String typesJobs;
    @JsonProperty("ГИП")
    private String gip;
    @JsonProperty("Стоимость этапа по КП")
    private int costStageCp;
    @JsonProperty("Стоимость этапа по КП с НДС")
    private int costStageCpNds;
    @JsonProperty("Сумма этапа, включенная в акт")
    private int sumAmountAct;
    @JsonProperty("Сумма этапа, включенная в акт, в т.ч. с/с")
    private int sumAmountActSs;
    @JsonProperty("Сумма этапа, включенная в акт, в т.ч. с/п")
    private int sumAmountActSp;
    @JsonProperty("Сумма с НДС, включенная в акт")
    private int sumAmountActNds;
    @JsonProperty("Сумма с НДС, включенная в акт, в т.ч. с/с")
    private int sumAmountActNdsSs;
    @JsonProperty("Сумма с НДС, включенная в акт, в т.ч. с/п")
    private int sumAmountActNdsSp;
    @JsonProperty("Дата начала работ по календарному плану")
    private Date sheduleStartDate;
    @JsonProperty("Плановая дата начала")
    private Date plannedStartDate;
    @JsonProperty("Фактическая дата начала")
    private Date actualStartDate;
    @JsonProperty("Дата окончания работ по календарному плану")
    private Date dateEndCalendarPlan;
    @JsonProperty("Плановая дата окончания на предыдущий месяц")
    private Date dateEndPreviousMonth;
    @JsonProperty("Плановая дата окончания")
    private Date plannedEndDate;
    @JsonProperty("Фактическая дата окончания")
    private Date actualEndDate;
    @JsonProperty("Номера актов (для группировки)")
    private String numbersActsGrouping;
    @JsonProperty("Плановая дата направления заявки на выставление акта для группировки")
    private Date plannedApplicationDate;
    @JsonProperty("Дата заявки")
    private Date dateApplication;
    @JsonProperty("Дата согласования заявки ПДО")
    private Date dateApprovalApplication;
    @JsonProperty("Дата направления")
    private Date referralDate;
    @JsonProperty("Даты аннулирования актов (для группировки)")
    private Date datesCancellationActs;
    @JsonProperty("Плановая дата подписания акта (для группировки)")
    private Date plannedDateSigning;
    @JsonProperty("Даты подписания актов (для группировки)")
    private Date datesSigning;
    @JsonProperty("% выполнения На предыдущий месяц")
    private int completedPreviousMonth;
    @JsonProperty("% выполнения На отчетный месяц")
    private String completedReportingMonth;
    @JsonProperty("Причина срыва сроков")
    private String reasonDelay;
    @JsonProperty("Примечание")
    private String note;
    @JsonProperty("Куратор договора в Администрации")
    private String curtorContract;
    @JsonProperty("Комментарий к договору")
    private String commentary;
    @JsonProperty("Идентификатор этапа")
    private String stageID;

    @Override
    public String toString() {
        return
                "Ответственный филиал='" + responsibleBranch + '\'' +"\n"+
                ", Договор='" + treaty + '\'' + "\n"+
                ", Наименование договора='" + nameOfTheContract + '\'' +"\n"+
                ", Статус договора='" + agreementStatus + '\'' +"\n"+
                ", Виды работ по договору='" + typesOfWorkContract + '\'' +"\n"+
                ", ГИП по договору='" + gipContract + '\'' +"\n"+
                ", Шифр='" + cipher + '\'' +"\n"+
                ", Принадлежность к единому договору='" + singleContract + '\'' + "\n"+
                ", Код ИУС=" + codeIMS +"\n"+
                ", Заказчик='" + customer + '\'' +"\n"+
                ", Агент='" + agent + '\'' +"\n"+
                ", Объект проектирования='" + designObject + '\'' +"\n"+
                ", Стоимость договора по КП=" + costContract +"\n"+
                ", Стоимость договора по КП с НДС='" + costContractNds + '\'' +"\n"+
                ", Сроки по договору Начало=" + termsStart +"\n"+
                ", Сроки по договору Окончание=" + termsEnd +"\n"+
                ", Этап='" + stage + '\'' +"\n"+
                ", Номер этапа='" + stageNumber + '\'' +"\n"+
                ", Наименование этапа='" + stageName + '\'' +"\n"+
                ", Виды работ='" + typesJobs + '\'' +"\n"+
                ", ГИП='" + gip + '\'' +"\n"+
                ", Стоимость этапа по КП=" + costStageCp +"\n"+
                ", Стоимость этапа по КП с НДС=" + costStageCpNds +"\n"+
                ", Сумма этапа, включенная в акт=" + sumAmountAct +"\n"+
                ", Сумма этапа, включенная в акт, в т.ч. с/с=" + sumAmountActSs +"\n"+
                ", Сумма этапа, включенная в акт, в т.ч. с/п=" + sumAmountActSp +"\n"+
                ", Сумма с НДС, включенная в акт=" + sumAmountActNds +"\n"+
                ", Сумма с НДС, включенная в акт, в т.ч. с/с=" + sumAmountActNdsSs +"\n"+
                ", Сумма с НДС, включенная в акт, в т.ч. с/п=" + sumAmountActNdsSp +"\n"+
                ", Дата начала работ по календарному плану=" + sheduleStartDate +"\n"+
                ", Плановая дата начала=" + plannedStartDate +"\n"+
                ", Фактическая дата начала=" + actualStartDate +"\n"+
                ", Дата окончания работ по календарному плану=" + dateEndCalendarPlan +"\n"+
                ", Плановая дата окончания на предыдущий месяц=" + dateEndPreviousMonth +"\n"+
                ", Плановая дата окончания=" + plannedEndDate +"\n"+
                ", Фактическая дата окончания=" + actualEndDate +"\n"+
                ", Номера актов (для группировки)='" + numbersActsGrouping + '\'' +"\n"+
                ", Плановая дата направления заявки на выставление акта для группировки=" + plannedApplicationDate +"\n"+
                ", Дата заявки=" + dateApplication +"\n"+
                ", Дата согласования заявки ПДО=" + dateApprovalApplication +"\n"+
                ", Дата направления=" + referralDate +"\n"+
                ", Даты аннулирования актов (для группировки)=" + datesCancellationActs +"\n"+
                ", Плановая дата подписания акта (для группировки)=" + plannedDateSigning +"\n"+
                ", Даты подписания актов (для группировки)=" + datesSigning +"\n"+
                ", % выполнения На предыдущий месяц=" + completedPreviousMonth +"\n"+
                ", % выполнения На отчетный месяц=" + completedReportingMonth +"\n"+
                ", Причина срыва сроков='" + reasonDelay + '\'' +"\n"+
                ", Примечание='" + note + '\'' +"\n"+
                ", Куратор договора в Администрации='" + curtorContract + '\'' +"\n"+
                ", Комментарий к договору='" + commentary + '\'' +"\n"+
                ", Идентификатор этапа='" + stageID + '\'' +
                "\n"+
                '}';
    }
}
