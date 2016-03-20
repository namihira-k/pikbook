/**
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.pikbook.web.controller.view.home;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.namihira.pikbook.web.controller.view.AbstractViewController;

/**
 * home controller
 */
@Controller
public class HomeViewController extends AbstractViewController {

    @RequestMapping(value = "/home", method = GET)
    public String get(final Model model) {
        model.addAttribute("name", "namihira");
        return "home/body";
    }

}
