package com.dss.model;

public class Driver {

    public String name;
    public String licensePlate;
    public int hoursDriven; // Số giờ lái xe liên tục

    // Hàm khởi tạo (Constructor)
    public Driver(String name, String licensePlate, int hoursDriven) {
        this.name = name;
        this.licensePlate = licensePlate;
        this.hoursDriven = hoursDriven;
    }

    // Hàm kiểm tra an toàn
    public void checkSafety() {
        System.out.println("--- Kiểm tra tài xế: " + name + " ---");
        if (hoursDriven > 8) {
            System.out.println("⚠️ CẢNH BÁO: Anh đã lái " + hoursDriven + " giờ. CẦN NGHỈ NGƠI NGAY!");
        } else {
            System.out.println("✅ Trạng thái: Anh vẫn ổn để tiếp tục hành trình.");
        }
    }
}