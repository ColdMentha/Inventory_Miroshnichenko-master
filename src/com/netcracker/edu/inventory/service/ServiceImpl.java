package com.netcracker.edu.inventory.service;

import java.util.Arrays;
import java.util.Comparator;

public class ServiceImpl implements Service {
    @Override
    public void sortByIN(Device[] devices) {
        Comparator<Device> deviceComparator = (e1, e2) ->
                Comparator.<Integer>nullsFirst(Comparator.naturalOrder()).compare(e1.getIn(), e2.getIn());

        Comparator<Device> generalComparator = (e1, e2) -> {
            if (e1 == null || e2 == null)
                return Comparator.nullsLast(deviceComparator).compare(e1, e2);
            else
                return deviceComparator.compare(e1, e2);

        };

        Arrays.sort(devices, generalComparator);

    }

    @Override
    public void filtrateByType(Device[] devices, String type) {
        for (int i = 0; i < devices.length; i++) {
            if (!devices[i].getType().equals(type)) {
                devices[i] = null;
            }
        }
    }


}
