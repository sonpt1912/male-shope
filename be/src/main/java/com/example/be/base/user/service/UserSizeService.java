package com.example.be.base.user.service;

import com.example.be.base.user.model.response.UserSizeResponse;
import com.example.be.base.user.repository.UserSizeResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSizeService {

    @Autowired
    private UserSizeResponseRepository response;

    public List<UserSizeResponse> getAllSize() {
        return response.getAllSize();
    }

    public List<UserSizeResponse> getSizeByProduct(long idProduct) {
        return response.getSizeByIdProduct(idProduct);
    }

}
