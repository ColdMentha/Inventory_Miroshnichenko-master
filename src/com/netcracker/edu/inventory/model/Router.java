package com.netcracker.edu.inventory;

import java.sql.Date;


public class Router extends AbstractDevice implements Device {
    private int dataRate;

    @Override
    public int getIn() {
        return super.getIn();
    }

    @Override
    public void setIn(int in) {
        super.setIn(in);
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public Date getProductionDate() {
        return super.getProductionDate();
    }

    @Override
    public void setProductionDate(Date productionDate) {
        super.setProductionDate(productionDate);
    }

    @Override
    public void setManufacturer(String manufacturer) {
        super.setManufacturer(manufacturer);
    }

    @Override
    public String getManufacturer() {
        return super.getManufacturer();
    }

    @Override
    void Change(int newIn) {
        super.Change(newIn);
    }

    public int getDataRate() {
        return dataRate;
    }

    public void setDataRate(int dataRate) {
        this.dataRate = dataRate;
    }
}
