package com.dss.model;

public class Main {
    public static void main(String[] args) {
        // Tạo thử một tài xế (Ví dụ là chính bạn)
        Driver myDriver = new Driver("Tài xế Tài", "29-A1 123.45", 10);

        // Chạy hàm kiểm tra
        myDriver.checkSafety();
    }
}