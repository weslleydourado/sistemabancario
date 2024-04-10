package utilitarios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Utils {
	
	static NumberFormat formataValores = new DecimalFormat("R$ #,##0");
	
	public static String doubleToString(Double valor) {
		return formataValores.format(valor);
		
	}

}
