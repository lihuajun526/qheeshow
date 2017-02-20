package com.qheeshow.eway.backstage.controller;

import com.qheeshow.eway.backstage.base.BaseController;
import com.qheeshow.eway.backstage.base.Result;
import com.qheeshow.eway.service.model.Document;
import com.qheeshow.eway.service.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * Created by lihuajun on 16-6-14.
 */
@Controller
@RequestMapping("/document")
public class DocumentController extends BaseController {

    @Autowired
    private DocumentService documentService;

    @RequestMapping("/save")
    @ResponseBody
    public String save(Document document) {

        Result result = new Result();

        documentService.save(document);

        return result.toString();
    }

    @RequestMapping("/list/{status}")
    @ResponseBody
    public String list(@PathVariable Integer status) {

        Result<List<Document>> result = new Result();

        List<Document> list = documentService.listByStatus(status);

        result.setData(list);

        return result.toString();
    }

    @RequestMapping("/get/{id}")
    @ResponseBody
    public String get(@PathVariable Integer id) {

        Result<Document> result = new Result();

        Document document = documentService.get(id);

        result.setData(document);

        return result.toString();
    }

}
