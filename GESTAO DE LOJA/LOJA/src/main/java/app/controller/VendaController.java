package app.controller;


@RestController
@RequestMapping("/api/loja")
public class VendaController {

	@Autowired
	private VendaService vendaService;
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Venda venda)
}
