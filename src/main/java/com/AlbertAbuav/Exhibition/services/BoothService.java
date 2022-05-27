package com.AlbertAbuav.Exhibition.services;

import com.AlbertAbuav.Exhibition.beans.Booth;
import com.AlbertAbuav.Exhibition.exceptions.ExhibitionSystemException;

import java.util.List;

public interface BoothService {

    void addBooth(Booth booth) throws ExhibitionSystemException;
    void updateBooth(Booth booth) throws ExhibitionSystemException;
    void deleteBooth(int boothId) throws ExhibitionSystemException;
    List<Booth> getAllBooths();
    Booth getSingleBooth(int boothId) throws ExhibitionSystemException;

}
