/**
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.pikbook.web.controller.api.pic;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.namihira.pikbook.integration.dto.PictureDto;
import jp.co.namihira.pikbook.service.PictureService;
import jp.co.namihira.pikbook.web.controller.api.AbstractApiController;

/**
 * picture controller
 */
@RestController
public class PictureApiController extends AbstractApiController {

    @Autowired
    private PictureService pictureService;

    @RequestMapping(value = "/pictures", method = GET)
    public List<PictureDto> get() {
        final List<PictureDto> pictures = pictureService.getPictures();
        return pictures;
    }

    @RequestMapping(value = "/picture", method = POST)
    public PictureDto post(final PictureDto picture) {
    	return picture;
    }
    
}
