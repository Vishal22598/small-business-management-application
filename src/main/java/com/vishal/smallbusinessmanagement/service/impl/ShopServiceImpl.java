package com.vishal.smallbusinessmanagement.service.impl;

import com.vishal.smallbusinessmanagement.dto.request.ShopRequest;
import com.vishal.smallbusinessmanagement.dto.response.ShopResponse;
import com.vishal.smallbusinessmanagement.entity.Shop;
import com.vishal.smallbusinessmanagement.mapper.ShopMapper;
import com.vishal.smallbusinessmanagement.repository.ShopRepository;
import com.vishal.smallbusinessmanagement.service.ShopService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ShopServiceImpl implements ShopService {
    final private ShopRepository shopRepository;

    @Override
    public ShopResponse createShop(ShopRequest request) {

        if(shopRepository.existsByEmail(request.getEmail())){
            throw new RuntimeException("Shop with email " + request.getEmail() + " already exists");
        }

        if(shopRepository.existsByPhone(request.getPhone())){
            throw new RuntimeException("Shop with phone " + request.getPhone() + " already exists");
        }

        Shop savedShop = shopRepository.save(ShopMapper.toEntity(request));
        return ShopMapper.toResponse(savedShop);
    }

    @Override
    public ShopResponse getShopById(Long shopId) {

        Shop shop = shopRepository.findById(shopId).orElseThrow(() -> new RuntimeException("Shop with id " + shopId + " not found"));
        return ShopMapper.toResponse(shop);
    }

    @Override
    public List<ShopResponse> getAllShops() {
        return List.of();
    }

    @Override
    public ShopResponse updateShop(Long shopId, ShopRequest request) {
        return null;
    }

    @Override
    public void deleteShop(Long shopId) {

    }
}
