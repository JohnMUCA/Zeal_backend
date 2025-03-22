package com.zeal.controller;

import com.zeal.model.TipoDocumentosModel;
import com.zeal.service.TipoDocumentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tipo_documentos")
public class TipoDocumentosController {
    
    @Autowired
    private TipoDocumentosService tipoDocumentosService;

    @GetMapping("/listatipodocumentos")
    public List<TipoDocumentosModel> findAll() {
        return tipoDocumentosService.findAll();
    }

    @GetMapping("/{id}")
    public TipoDocumentosModel findById(Integer id) {
        return tipoDocumentosService.findById(id);
    }

    @PostMapping
    public TipoDocumentosModel save(@RequestBody TipoDocumentosModel tipoDocumentosModel) {
        return tipoDocumentosService.save(tipoDocumentosModel);
    }

    @DeleteMapping("/{id}")
    public void deleteById(Integer id) {
        tipoDocumentosService.deleteById(id);
    }

}
