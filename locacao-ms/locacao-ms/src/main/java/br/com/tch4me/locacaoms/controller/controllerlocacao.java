package br.com.tch4me.locacaoms.controller;

public class controllerlocacao {
 }
    @RestController 
    @RequestMapping ("(api/locacao")
    public class controllerlocacao {
        private ModelMapper mapper = new ModelMapper ();

        @Autowired
        private ServiceImpl service;

        @GetMapping
        public ResponseEntity<List<locacaodto>> Obterlocacao(){
            List <Obterlocacao> locacaoms= service.obterlocacao();

            List<LocacaoResponseDTO> movies = locacao.stream()
            .map(f -> mapper.map(f, LocacaoResponseDTO.class))
            .collect(Collectors.toList());

            return new ResponseEntity<>(movies, HttpStatus.OK);
    }
         @GetMapping("/{id}")
         public ResponseEntity<LocacaoResponseDTO> obterLocacaoPorId(@PathVariable String id) {
        Optional<locacaoDTO> locacao = service.obterLocacaoPorId(id);
        
        if (filme.isPresent()) {
            return new ResponseEntity<>(mapper.map(filme.get(), LocacaoResponseDTO.class)
            ,HttpStatus.FOUND);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }@GetMapping(value = "/status")
    public String status(@Value ("${local.server.port}")String status) {
        return "Está rodando na porta: " + status;
    }

   
    
        
    
        
    }