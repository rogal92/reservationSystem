package com.example.reservation.ui.forms.client.controller;

import com.example.reservation.entities.Client;
import com.example.reservation.repository.ClientRepository;
import com.example.reservation.service.ClientService;
import com.example.reservation.ui.forms.client.model.ClientTableModel;
import com.example.reservation.ui.forms.client.view.ClientFrame;
import com.example.reservation.ui.forms.client.view.ClientTableButtonPanel;
import com.example.reservation.ui.forms.client.view.ClientTablePanel;
import com.example.reservation.ui.forms.client.view.m.AddClientFrame;
import com.example.reservation.ui.forms.client.view.m.ClientFormPanel;
import com.example.reservation.ui.shared.controller.AbstractFrameController;
import com.example.reservation.util.Notifications;
import com.example.reservation.validation.ClientValidation;
import com.example.reservation.validation.ValidationError;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ClientController extends AbstractFrameController {

    @Autowired
    private ClientTableButtonPanel tableButtonPanel;

    @Autowired
    private ClientTablePanel clientTablePanel;

    @Autowired
    private ClientFrame clientFrame;

    @Autowired
    private ClientService clientService;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private AddClientFrame addClientFrame;

    @Autowired
    private ClientTableModel clientTableModel;

    @Autowired
    private ClientValidation clientValidation;

    public ClientController(ClientTableButtonPanel tableButtonPanel, ClientTablePanel clientTablePanel,
                            ClientFrame clientFrame, ClientService clientService, ClientRepository clientRepository) {
        this.tableButtonPanel = tableButtonPanel;
        this.clientTablePanel = clientTablePanel;
        this.clientFrame = clientFrame;
        this.clientService = clientService;
        this.clientRepository = clientRepository;
    }

    @Override
    public void prepareAndOpenFrame() {
        fetchEntities();
        show();
    }

    private void fetchEntities() {
        List<Client> clientList = clientService.findAll();
        clientTableModel.clear();
        clientTableModel.addEntities(clientList);
    }

    private void show() {
        clientFrame.setVisible(true);
    }

    private void showModal() {
        addClientFrame.setVisible(true);
    }

    private void saveEntity() {
        Client client = addClientFrame.getClientFormPanel().getClientFromForm();
        Optional<ValidationError> error = clientValidation.validate(client);

        if (error.isPresent()) {
            Notifications.showFormValidationAlert(error.get().getMessage());
        }
        clientRepository.save(client);
        clientTableModel.addEntity(client);
    }
}
