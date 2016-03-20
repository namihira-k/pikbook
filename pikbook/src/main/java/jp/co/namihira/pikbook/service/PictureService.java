/*
 * Copyright 2016 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.pikbook.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import jp.co.namihira.pikbook.integration.dto.PictureDto;

/**
 * Service for Picture
 */
@Service
public class PictureService {

    @Value("${app.url}")
    private String url;

    public List<PictureDto> getPictures() {
        final List<PictureDto> result = new ArrayList<>();

        final PictureDto pic1 = new PictureDto();
        pic1.setUrl(url + "/resources/img/image.jpg");
        result.add(pic1);

        final PictureDto pic2 = new PictureDto();
        pic2.setUrl(url + "/resources/img/image2.jpg");
        result.add(pic2);

        final PictureDto pic3 = new PictureDto();
        pic3.setUrl(url + "/resources/img/image3.jpg");
        result.add(pic3);

        return result;
    }

}
