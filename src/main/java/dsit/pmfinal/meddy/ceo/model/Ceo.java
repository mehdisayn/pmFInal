package dsit.pmfinal.meddy.ceo.model;

import dsit.pmfinal.model.User;

import java.util.List;
import java.util.Map;

public class Ceo extends User {

    private Map<String, String> departmentPerformance; // departmentName -> performanceSummary
    private List<String> approvedShiftPlans;            // List of approved shift plan IDs
    private double approvedBudget;                      // Latest approved budget amount
    private List<String> reviewedMaintenanceReports;    // IDs of reviewed maintenance reports
    private Map<String, Boolean> hiringDecisions;       // decisionId -> approved/rejected
    private List<String> reviewedLogisticsReports;      // IDs of reviewed logistics reports
    private Map<String, Double> monthlyProductionData;  // month -> total production amount
    private List<String> approvedSalaryLists;           // IDs of approved salary lists


    public Ceo(String name, String phone, String email, String password) {
        super(name, phone, email, password);

        this.setId(this.generateId());

    }

    public Ceo(String name, String phone, String email, String password, Map<String, String> departmentPerformance, List<String> approvedShiftPlans, double approvedBudget, List<String> reviewedMaintenanceReports, Map<String, Boolean> hiringDecisions, List<String> reviewedLogisticsReports, Map<String, Double> monthlyProductionData, List<String> approvedSalaryLists) {
        super(name, phone, email, password);
        this.departmentPerformance = departmentPerformance;
        this.approvedShiftPlans = approvedShiftPlans;
        this.approvedBudget = approvedBudget;
        this.reviewedMaintenanceReports = reviewedMaintenanceReports;
        this.hiringDecisions = hiringDecisions;
        this.reviewedLogisticsReports = reviewedLogisticsReports;
        this.monthlyProductionData = monthlyProductionData;
        this.approvedSalaryLists = approvedSalaryLists;
    }

    @Override
    public String generateId() {
        String id = "ceoo";

        return id;
    }

    // 1️⃣ Review performance of each department
    public void reviewDepartmentPerformance(String departmentName, String performanceSummary) {
        departmentPerformance.put(departmentName, performanceSummary);
        System.out.println("Reviewed performance for " + departmentName + ": " + performanceSummary);
    }

    // 2️⃣ Approve shift plans submitted by Factory Manager
    public void approveShiftPlan(String planId) {
        approvedShiftPlans.add(planId);
        System.out.println("Approved shift plan: " + planId);
    }

    // 3️⃣ Approve budget proposed by Accountant
    public void approveBudget(double budgetAmount) {
        if (budgetAmount > 0) {
            this.approvedBudget = budgetAmount;
            System.out.println("Approved budget: $" + budgetAmount);
        } else {
            System.out.println("Invalid budget amount.");
        }
    }

    // 4️⃣ Review maintenance reports submitted by Maintenance Officer
    public void reviewMaintenanceReport(String reportId) {
        reviewedMaintenanceReports.add(reportId);
        System.out.println("Reviewed maintenance report: " + reportId);
    }

    // 5️⃣ Review employee hiring/release decisions made by HR Manager
    public void reviewHiringDecision(String decisionId, boolean approve) {
        hiringDecisions.put(decisionId, approve);
        String status = approve ? "approved" : "rejected";
        System.out.println("Hiring decision " + decisionId + " has been " + status);
    }

    // 6️⃣ Review logistics reports submitted by Logistics Manager
    public void reviewLogisticsReport(String reportId) {
        reviewedLogisticsReports.add(reportId);
        System.out.println("Reviewed logistics report: " + reportId);
    }

    // 7️⃣ Review total production data
    public void reviewTotalProduction(String month, double productionAmount) {
        monthlyProductionData.put(month, productionAmount);
        System.out.println("Reviewed total production for " + month + ": " + productionAmount);
    }

    // 8️⃣ Approve monthly salary list submitted by Accountant
    public void approveSalaryList(String salaryListId) {
        approvedSalaryLists.add(salaryListId);
        System.out.println("Approved salary list: " + salaryListId);
    }

    public Map<String, String> getDepartmentPerformance() {
        return departmentPerformance;
    }

    public void setDepartmentPerformance(Map<String, String> departmentPerformance) {
        this.departmentPerformance = departmentPerformance;
    }

    public List<String> getApprovedShiftPlans() {
        return approvedShiftPlans;
    }

    public void setApprovedShiftPlans(List<String> approvedShiftPlans) {
        this.approvedShiftPlans = approvedShiftPlans;
    }

    public double getApprovedBudget() {
        return approvedBudget;
    }

    public void setApprovedBudget(double approvedBudget) {
        this.approvedBudget = approvedBudget;
    }

    public List<String> getReviewedMaintenanceReports() {
        return reviewedMaintenanceReports;
    }

    public void setReviewedMaintenanceReports(List<String> reviewedMaintenanceReports) {
        this.reviewedMaintenanceReports = reviewedMaintenanceReports;
    }

    public Map<String, Boolean> getHiringDecisions() {
        return hiringDecisions;
    }

    public void setHiringDecisions(Map<String, Boolean> hiringDecisions) {
        this.hiringDecisions = hiringDecisions;
    }

    public List<String> getReviewedLogisticsReports() {
        return reviewedLogisticsReports;
    }

    public void setReviewedLogisticsReports(List<String> reviewedLogisticsReports) {
        this.reviewedLogisticsReports = reviewedLogisticsReports;
    }

    public Map<String, Double> getMonthlyProductionData() {
        return monthlyProductionData;
    }

    public void setMonthlyProductionData(Map<String, Double> monthlyProductionData) {
        this.monthlyProductionData = monthlyProductionData;
    }

    public List<String> getApprovedSalaryLists() {
        return approvedSalaryLists;
    }

    public void setApprovedSalaryLists(List<String> approvedSalaryLists) {
        this.approvedSalaryLists = approvedSalaryLists;
    }

    @Override
    public String toString() {
        return "Ceo{" +
                "departmentPerformance=" + departmentPerformance +
                ", approvedShiftPlans=" + approvedShiftPlans +
                ", approvedBudget=" + approvedBudget +
                ", reviewedMaintenanceReports=" + reviewedMaintenanceReports +
                ", hiringDecisions=" + hiringDecisions +
                ", reviewedLogisticsReports=" + reviewedLogisticsReports +
                ", monthlyProductionData=" + monthlyProductionData +
                ", approvedSalaryLists=" + approvedSalaryLists +
                '}';
    }
}
