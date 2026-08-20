package com.nt.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "medicine_info")
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer medicineId;

    @Column(length=30)
    private String medicineName;
    @Column(length=30)
    private String category;
    @Column(length=30)
    private String manufacturer;
    private Double price;
    private Integer stockQuantity;

    public Medicine() {
    }

    public Medicine(String medicineName, String category, String manufacturer,
                    Double price, Integer stockQuantity) {
        this.medicineName = medicineName;
        this.category = category;
        this.manufacturer = manufacturer;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public Integer getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Integer medicineId) {
        this.medicineId = medicineId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    @Override
    public String toString() {
        return "Medicine [medicineId=" + medicineId +
                ", medicineName=" + medicineName +
                ", category=" + category +
                ", manufacturer=" + manufacturer +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity + "]";
    }
}