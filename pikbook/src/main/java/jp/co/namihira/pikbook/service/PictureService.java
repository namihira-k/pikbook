/*
 * Copyright 2016 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.pikbook.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import jp.co.namihira.pikbook.integration.dto.PictureDto;

/**
 * Service for Picture
 */
@Service
public class PictureService {

    public List<PictureDto> getPictures() {
        final List<PictureDto> result = new ArrayList<>();
        return result;
    }

}
