package com.example.reservation.ui.Shared.model;

import java.util.List;

public abstract class DefaultComboBoxModel<T> extends javax.swing.DefaultComboBoxModel<T> {

    @Override
    public T getSelectedItem() {
        return (T) super.getSelectedItem();
    }

    public void addElements(List<T> elements) {
        elements.forEach(this::addElements);
    }

    public void removeAll() {
        removeAllElements();
    }
}
