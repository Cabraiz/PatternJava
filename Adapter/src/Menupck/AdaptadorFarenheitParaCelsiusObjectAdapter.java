package Menupck;

public class AdaptadorFarenheitParaCelsiusObjectAdapter extends MedidorFarenheit{
	public double Celsius () {
		double x = (getTemperaturaFarenheit() - 32)/1.8;
		return x;
	}
}
