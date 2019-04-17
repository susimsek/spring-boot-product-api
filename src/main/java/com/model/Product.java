package com.model;


import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @ApiModelProperty(notes = "The database generated product ID")
    private Integer id;

    @Version
    @Column(name = "version")
    @ApiModelProperty(notes = "The auto-generated version of the product")
    private Integer version;

    @Column(name = "product_id")
    @ApiModelProperty(notes = "The application-specific product ID")
    private String productId;

    @Column(name = "description")
    @ApiModelProperty(notes = "The product description")
    private String description;

    @Column(name = "price")
    @ApiModelProperty(notes = "The price of the product", required = true)
    private BigDecimal price;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", version=" + version +
                ", productId='" + productId + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
