package br.com.tch4me.locacaoms.service;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl <ModelMapper> implements Service {
private ModelMapper mapper = new ModelMapper ();

public ServiceImpl(ModelMapper mapper) {
    this.mapper = mapper;
}

@Override
public Class<? extends Annotation> annotationType() {
    // TODO Auto-generated method stub
    return null;
}

@Override
public String value() {
    // TODO Auto-generated method stub
    return null;
}

public ModelMapper getMapper() {
    return mapper;
}

public void setMapper(ModelMapper mapper) {
    this.mapper = mapper;
} }



   