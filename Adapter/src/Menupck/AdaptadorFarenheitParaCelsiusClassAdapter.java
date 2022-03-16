package Menupck;

public class AdaptadorFarenheitParaCelsiusClassAdapter {
	public double Celsius() {
		MedidorFarenheit mf = new MedidorFarenheit();
		double x = (mf.getTemperaturaFarenheit() - 32)/1.8;
		return x;	
	}
}
