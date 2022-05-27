package com.AlbertAbuav.Exhibition.services;

import com.AlbertAbuav.Exhibition.beans.Booth;
import com.AlbertAbuav.Exhibition.exceptions.ErrorMessage;
import com.AlbertAbuav.Exhibition.exceptions.ExhibitionSystemException;
import com.AlbertAbuav.Exhibition.repositories.BoothRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoothServiceImplement implements BoothService{

    private final BoothRepository boothRepository;

    @Override
    public void addBooth(Booth booth) throws ExhibitionSystemException {
        if(boothRepository.existsById(booth.getId())) {
            throw new ExhibitionSystemException(ErrorMessage.ID_ALREADY_EXIST);
        }
        boothRepository.save(booth);
    }

    @Override
    public void updateBooth(Booth booth) throws ExhibitionSystemException {
        if(!boothRepository.existsById(booth.getId())){
            throw new ExhibitionSystemException(ErrorMessage.ID_NOT_FOUND);
        }
        boothRepository.saveAndFlush(booth);
    }

    @Override
    public void deleteBooth(int boothId) throws ExhibitionSystemException {
        if(!boothRepository.existsById(boothId)){
            throw new ExhibitionSystemException(ErrorMessage.ID_NOT_FOUND);
        }
        boothRepository.deleteById(boothId);
    }

    @Override
    public List<Booth> getAllBooths() {
        return boothRepository.findAll();
    }

    @Override
    public Booth getSingleBooth(int boothId) throws ExhibitionSystemException {
        return boothRepository.findById(boothId).orElseThrow(()->new ExhibitionSystemException(ErrorMessage.ID_NOT_FOUND));
    }
}
