package dsit.pmfinal.rrhin.accountant.Controller;

import dsit.pmfinal.PrimarySceneSwitcher;
import dsit.pmfinal.common_files.Jumper;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TextArea;

public class AccountantDashboardController
{
    @javafx.fxml.FXML
    private TextArea dashboardTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        dashboardTextArea.setStyle("-fx-control-inner-background: #E74C3C;");
    }

    @javafx.fxml.FXML
    public void handleFinancialStatementsButton(ActionEvent actionEvent) {
        Jumper.jump((Node) actionEvent.getSource(), "rrhin.accountant", "financial-statements.fxml", "Financial Statements");
    }

    @javafx.fxml.FXML
    public void handlePurchaseApprovalsButton(ActionEvent actionEvent) {
        Jumper.jump((Node) actionEvent.getSource(),"rrhin.accountant","purchase-approvals.fxml","Purchase Approvals");

    }

    @javafx.fxml.FXML
    public void handleSignOutButton(ActionEvent actionEvent) {
        PrimarySceneSwitcher.primarySwitchScene((Node) actionEvent.getSource(), "login.fxml", "Login");
    }

    @javafx.fxml.FXML
    public void handleInventoryValuationButton(ActionEvent actionEvent) {
        Jumper.jump((Node) actionEvent.getSource(), "rrhin.accountant", "inventory-valuation.fxml", "Inventory Valuation");

    }

    @javafx.fxml.FXML
    public void handleReportButton(ActionEvent actionEvent) {
        Jumper.jump((Node) actionEvent.getSource(), "rrhin.accountant", "report.fxml", "Report");


    }

    @javafx.fxml.FXML
    public void handleExpensesButton(ActionEvent actionEvent) {
        Jumper.jump((Node) actionEvent.getSource(), "rrhin.accountant", "expenses.fxml", "Expenses");

    }

    @javafx.fxml.FXML
    public void handleTaxAndAuditRecordsButton(ActionEvent actionEvent) {
        Jumper.jump((Node) actionEvent.getSource(), "rrhin.accountant", "tax-audit.fxml", "Tax and Audit Records");
    }

    @javafx.fxml.FXML
    public void handleSalaryManagementButton(ActionEvent actionEvent) {
        Jumper.jump((Node) actionEvent.getSource(), "rrhin.accountant", "salary-report.fxml", "Salary Management");

    }

    @javafx.fxml.FXML
    public void handleSalesIncomeButton(ActionEvent actionEvent) {
        Jumper.jump((Node) actionEvent.getSource(), "rrhin.accountant", "salary-income.fxml", "Salary Management");

    }
}