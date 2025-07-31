package com.zhiyu.SpringEcom.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;
    private Date releaseDate;
    private boolean productAvailable;
    private int stockQuantity;
    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageData;

    public Product(int id) {
        this.id = id;
    }
    /*
    public Integer getId(){
        return this.id;
    }

    public byte[] getImageData() {
        return this.imageData;
    }

    public void setImageName(String imageName){
        this.imageName = imageName;
    }

    public void setImageType(String imageType){
        this.imageType = imageType;
    }

    public void setImageData(byte[] imageData){
        this.imageData = imageData;
    }
    */
}
