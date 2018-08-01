package com.example.reservation.ui.forms.payment.controller;

import com.example.reservation.entities.Payment;
import com.example.reservation.entities.PaymentMethod;
import com.example.reservation.service.PaymentMethodService;
import com.example.reservation.service.PaymentService;
import com.example.reservation.ui.forms.payment.model.PaymentMethodComboBoxModel;
import com.example.reservation.ui.forms.payment.model.PaymentTableModel;
import com.example.reservation.ui.forms.payment.view.PaymentFrame;
import com.example.reservation.ui.forms.payment.view.PaymentTableButtonPanel;
import com.example.reservation.ui.forms.payment.view.PaymentTablePanel;
import com.example.reservation.ui.forms.payment.view.m.AddPaymentFrame;
import com.example.reservation.ui.forms.payment.view.m.PaymentFormButtonPanel;
import com.example.reservation.ui.forms.payment.view.m.PaymentFormPanel;
import com.example.reservation.ui.forms.paymentMethod.model.PaymentMethodTableModel;
import com.example.reservation.ui.forms.paymentMethod.view.PaymentMFrame;
import com.example.reservation.ui.shared.controller.AbstractFrameController;
import com.example.reservation.util.Messages;
import com.example.reservation.util.Notifications;
import com.example.reservation.validation.PaymentValidator;
import com.example.reservation.validation.ValidationError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.swing.*;
import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Controller
public class PaymentController extends AbstractFrameController {

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private PaymentTableModel paymentTableModel;

    @Autowired
    private PaymentMethodService paymentMethodService;

    @Autowired
    private PaymentMethodComboBoxModel paymentMethodComboBoxModel;

    @Autowired
    private PaymentMFrame paymentMFrame;

    @Autowired
    private AddPaymentFrame addPaymentFrame;

    @Autowired
    private PaymentValidator paymentValidator;

    @Autowired
    private PaymentTableModel paymentTableModel;

    @Autowired
    private PaymentFrame paymentFrame;

    public PaymentController(PaymentService paymentService, PaymentTableModel paymentTableModel,
                             PaymentMethodService paymentMethodService, PaymentMethodComboBoxModel paymentMethodComboBoxModel,
                             PaymentMFrame paymentMFrame, AddPaymentFrame addPaymentFrame, PaymentValidator paymentValidator,
                             PaymentTableModel paymentTableModel1, PaymentFrame paymentFrame) {
        this.paymentService = paymentService;
        this.paymentTableModel = paymentTableModel;
        this.paymentMethodService = paymentMethodService;
        this.paymentMethodComboBoxModel = paymentMethodComboBoxModel;
        this.paymentMFrame = paymentMFrame;
        this.addPaymentFrame = addPaymentFrame;
        this.paymentValidator = paymentValidator;
        this.paymentTableModel = paymentTableModel1;
        this.paymentFrame = paymentFrame;
    }

    @PostConstruct
    private void prepareListeners() {
        PaymentTableButtonPanel tableButtonPanel = paymentFrame.getTableBtnPanel();
        PaymentFormButtonPanel formButtonPanel = addPaymentFrame.getFormButtonPanel();

        registerAction(tableButtonPanel.getAddButton(),e -> showAdd());
        registerAction(tableButtonPanel.getRemoveButton(), e -> removeEntity());
        registerAction(formButtonPanel.getAddButton(), e -> saveEntity());
        registerAction(formButtonPanel.getCancelButton(), e -> closeModalWindow());
    }

    @Override
    public void prepareAndOpenFrame() {
        loadEntities();
        loadPaymentMethods();
        showTableFrame();
    }

    private void loadEntities() {
        List<Payment> payments = paymentService.findAll();
        paymentTableModel.clear();
        paymentTableModel.addEntities(payments);
    }

    private void loadPaymentMethods() {
        List<PaymentMethod> paymentMethods = paymentMethodService.findAll();
        paymentMethodComboBoxModel.removeAll();
        paymentMethodComboBoxModel.addElements(paymentMethods);
    }

    private void showTableFrame() {
        paymentMFrame.setVisible(true);
    }

    private void showAdd() {
        addPaymentFrame.setVisible(true);
    }

    private void closeModalWindow() {
        addPaymentFrame.getFormPanel().clearForm();
        addPaymentFrame.dispose();
    }

    private void saveEntity() {
        PaymentFormPanel paymentFormPanel = addPaymentFrame.getFormPanel();
        Payment payment = paymentFormPanel.getEntityFromForm();
        Optional<ValidationError> errors = paymentValidator.validate(payment);
        if (errors.isPresent()) {
            ValidationError validationError = errors.get();
            Notifications.showFormValidationAlert(validationError.getMessage());
        } else {
            paymentService.save(payment);
            paymentTableModel.addEntity(payment);
            closeModalWindow();
        }
    }

    private void removeEntity() {
        JTable table = paymentFrame.getTablePanel().getTable();
        int selectedRow = table.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,
                    Messages.NON_ROW_SELECTED,
                    Messages.ALERT,
                    JOptionPane.ERROR_MESSAGE);
        } else {
            Payment payment = paymentTableModel.getEntityByRow(selectedRow);
            paymentService.remove(payment);
            paymentTableModel.removeRow(selectedRow);
        }
    }
}
