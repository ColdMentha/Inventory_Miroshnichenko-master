package com.netcracker.edu.inventory;

import java.sql.Date;


public class Switch extends Router implements Device {
    private int numberOfPorts;

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
    public String getManufacturer() {
        return super.getManufacturer();
    }

    @Override
    public void setManufacturer(String manufacturer) {
        super.setManufacturer(manufacturer);
    }

    @Override
    public int getDataRate() {
        return super.getDataRate();
    }

    @Override
    public void setDataRate(int dataRate) {
        super.setDataRate(dataRate);
    }

    @Override
    void Change(int newIn) {
        super.Change(newIn);
    }

    public int getNumberOfPorts() {
        return numberOfPorts;
    }

    public void setNumberOfPorts(int numberOfPorts) {
        this.numberOfPorts = numberOfPorts;
    }
}
