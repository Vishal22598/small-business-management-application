package com.vishal.smallbusinessmanagement.dto.response;

import com.vishal.smallbusinessmanagement.enums.ShopStatus;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ShopResponse {
    private Long shopId;
    private String shopName;
    private String ownerName;
    private String email;
    private String phone;
    private String gstNumber;
    private String address;
    private String city;
    private String state;
    private String pincode;
    private ShopStatus status;
}
