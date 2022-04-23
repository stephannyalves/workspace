package br.com.tch4me.locacaoms.service;

import java.util.List;
import java.util.Optional;

import br.com.tch4me.locacaoms.dto.locacaodto;

public interface service  {
    List <locacaodto > obterlocacaodto ();
    Optional <locacaodto> obterlocacaodtoIOptional (String id);
    locacaodto locacaodto  ( locacaodto veiculo ); 
    locacaodto atualizarlocacao ( String Id, locacaodto atualizarlocacao);
    
    void locacao (String Id);
}
