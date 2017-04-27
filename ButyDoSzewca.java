package szewc;

import javax.swing.JOptionPane;

public class ButyDoSzewca {

	public static void main(String[] args) {
		try {
			int oddane = Integer.parseInt(JOptionPane.showInputDialog("Którego dnia oddajesz buty? [1-7]"));
			
			int czasNaprawy = Integer.parseInt(JOptionPane.showInputDialog("Ile dni trwa naprawa?"));
			
			int odbior = (oddane + czasNaprawy -1) % 7 + 1;
			
			JOptionPane.showMessageDialog(null, "Odbiór dnia numer: " + odbior);
			JOptionPane.showMessageDialog(null, "Ten dzień to " + nazwaDnia(odbior));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Niepoprawny format liczby ", "Błąd!", JOptionPane.ERROR_MESSAGE);
		}	
		
	}

	private static String nazwaDnia(int dzien) {
		switch(dzien){
		case 1 : return "Poniedziałek";
		case 2 : return "Wtorek";
		case 3 : return "Środa";
		case 4 : return "Czwartek";
		case 5 : return "Piątek";
		case 6 : return "Sobota";
		case 7 : return "Niedziela";
		default: throw new IllegalArgumentException("Dzień tygodnia " + dzien + " spoza zakresu");
		}
	}

}