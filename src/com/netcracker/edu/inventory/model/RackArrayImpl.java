package com.netcracker.edu.inventory.model;

public class RackArrayImpl implements Rack {
    private int size;
    private Device[] mas = new Device[size];

    public RackArray(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        if (size <= 0) {
            System.err.print("Size can't be equally/less than 0");
            return getFreeSize();
        } else
            return size;
    }

    @Override
    public int getFreeSize() {
        return size = 0;
    }

    @Override
    public Device getDevAtSlot(int index) {
        if (mas[index] == null) {
            return null;
        } else {
            return mas[index];
        }

    }

    @Override
    public boolean insertDevToSlot(Device device, int index) {
        if (device.getIn() > 0 && mas[index] == null) {
            mas[index] = device;
            return true;
        } else
            return false;

    }

    @Override
    public Device removeDevFromSlot(int index) {
        if (mas[index] == null)
            return null;
        else {
            Device d = mas[index];
            mas[index] = null;
            return d;
        }
    }

    @Override
    public Device getDevByIN(int in) {
        for (Device da : mas) {
            if (da.getIn() == in)
                return da;
        }
        return null;
    }
}
