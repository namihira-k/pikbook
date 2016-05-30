/**
 * Copyright 2016 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.pikbook.web.controller.view.upload;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.namihira.pikbook.web.controller.view.AbstractViewController;

/**
 * upload controller
 */
@Controller
public class UploadViewController extends AbstractViewController {

    @RequestMapping(value = "/upload", method = GET)
    public String get(final Model model) {
        return "upload/upload";
    }

}
