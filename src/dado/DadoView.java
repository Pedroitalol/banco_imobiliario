package dado;

public class DadoView {
	private DadoController dadoController;

	public DadoView() {
		this.dadoController = new DadoController();
	}
	
	public void jogaDados(){
		System.out.println(this.dadoController.jogaDados());
	}
}
