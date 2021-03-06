package com.example.reservation.ui.shared.model;

import com.google.common.collect.Lists;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public abstract class DefaultTableModel<T> extends AbstractTableModel {

    protected List<T> entities = Lists.newArrayList();

    public abstract String[] getColumnLabels();

    @Override
    public int getRowCount() {
        return entities.size();
    }

    @Override
    public int getColumnCount() {
        return getColumnLabels().length;
    }

    @Override
    public String getColumnName(int column) {
        return getColumnLabels()[column];
    }

    public void addEntity(T entity) {
        entities.add(entity);
        fireTableDataChanged();
    }

    public T getEntityByRow(int selectedRow) {
        return entities.get(selectedRow);
    }

    public void removeRow(int row) {
        entities.remove(row);
        fireTableDataChanged();
    }
    public void addEntities(List<T> entities) {
        this.entities.addAll(entities);
        fireTableDataChanged();
    }

    public void clear() {
        entities.clear();
    }
}
