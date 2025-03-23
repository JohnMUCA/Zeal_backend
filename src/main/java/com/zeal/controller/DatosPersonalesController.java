package com.zeal.controller;

import com.zeal.model.DatosPersonalesModel;
import com.zeal.service.DatosPersonalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/datospersonales")
public class DatosPersonalesController {

    @Autowired
    private DatosPersonalesService datosPersonalesService;

    @GetMapping("/listadatospersonales")
    public List<DatosPersonalesModel> findAll() {
        return datosPersonalesService.findAll();
    }

    @GetMapping("/{id}")
    public DatosPersonalesModel findById(Integer id) {
        return datosPersonalesService.findById(id);
    }

    @PostMapping
    public DatosPersonalesModel save(@RequestBody DatosPersonalesModel datosPersonalesModel) {
        return datosPersonalesService.save(datosPersonalesModel);
    }

    @DeleteMapping("/{id}")
    public void deleteById(Integer id) {
        datosPersonalesService.deleteById(id);
    }
}
