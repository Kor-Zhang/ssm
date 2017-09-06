package com.zk.ssm.po;

import java.math.BigDecimal;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class Items {
    private String id;

    @Length(min=1,max=40,message="{items.name.length.error}")
    private String name;

    @NotBlank(message="{items.description.notblack.error}")
    private String description; 
    
    //使用@Min或者@DecimalMin无效,需要使用@NotNull
    @NotNull(message="{items.price.notnull.error}")
    @DecimalMin(value="0",message="{items.price.min.error}")
    private BigDecimal price;

    //使用@Min或者@DecimalMin无效,需要使用@NotNull
    @NotNull(message="{items.quantity.notnull.error}")
    @Min(value=0,message="{items.quantity.min.error}")
    private Integer quantity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}