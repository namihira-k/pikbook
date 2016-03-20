/**
 * Copyright 2016 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.pikbook.web.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * API関連のコントローラの抽象クラス
 */
@RestController
@RequestMapping(value = "/api")
public abstract class AbstractApiController {

}
