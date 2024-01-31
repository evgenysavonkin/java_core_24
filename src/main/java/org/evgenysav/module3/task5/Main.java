package org.evgenysav.module3.task5;

public class Main {
    public static void main(String[] args) {
        MonitoringSystem generalIndicatorsMonitoringModule = () -> System.out.println("Monitoring of general indicators has started!");
        MonitoringSystem errorMonitoringModule = () -> System.out.println("Monitoring of general indicators has started!");
        MonitoringSystem securityModule = () -> System.out.println("Security monitoring has started!");
        generalIndicatorsMonitoringModule.startMonitoring();
        errorMonitoringModule.startMonitoring();
        securityModule.startMonitoring();
    }
}
