package br.com.tch4me.clientems.service;

import java.util.List;
import java.util.Optional;

public interface service  {
    List <clientedto > obterclientedto ();
    Optional <clientedto> obterlocacaodtoIOptional (String id);
    Clientedto locacaodto  ( clientedto nome ); 
    Clientedto atualizarlocacao ( String Id, clientedto atualizarcliente);
    
    void locacao (String Id);
}

