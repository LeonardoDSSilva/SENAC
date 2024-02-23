package tanqueRobo;

public class TanqueRobo implements Posicao, Cor, Canhao {

	private int x, y;
	private String nome;
	private CoresRGB corTanque, corCanhao;

	public TanqueRobo(){

	}

	

	public TanqueRobo(int x, int y, String nome, CoresRGB corTanque, CoresRGB corCanhao) {
		this.x = x;
		this.y = y;
		this.nome = nome;
		this.corTanque = corTanque;
		this.corCanhao = corCanhao;
	}



	@Override
	public void movLeste() {
		x++;
		
	}

	@Override
	public void movNorte() {
		y++;
		
	}

	@Override
	public void movOeste() {
		x--;
		
	}

	@Override
	public void movSul() {
		y--;
	}

	@Override
	public int retPosicaoX() {
		return x;
	}

	@Override
	public int retPosicaoY() {
		return y;
	}

	@Override
	public void atribCorCanhao(CoresRGB corCanhao) {
		this.corCanhao = corCanhao;
		
	}

	@Override
	public void atribCorTanque(CoresRGB corTanque) {
		this.corTanque = corTanque;		
	}

	@Override
	public CoresRGB retCorCanhao() {
		return corCanhao;
	}

	@Override
	public CoresRGB retCorTanque() {
		return corTanque;
	}

	@Override
	public void atirar() {
		for(int i = 0; i <= 5; i++){
			System.out.println("Atirando...");
		}
	}
	
	@Override
	public void atirar(long cadencia) {
		
		for(int i = 0; i <= 5; i++){
			System.out.println("Atirando...");
			esperar(cadencia * 1000);
		}
	}

	private void esperar(long cadencia) {
		try {
			if (cadencia > 5000) {
				throw new IllegalArgumentException("Cadencia muito alta");
			}
			Thread.sleep(cadencia);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public String toString() {
		return "TanqueRobo [x=" + x + ", y=" + y + ", nome=" + nome + ", corTanque=" + corTanque + ", corCanhao="
				+ corCanhao + "]";
	}
	
}
