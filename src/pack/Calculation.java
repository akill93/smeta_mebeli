package pack;

public class Calculation {
static double Amort, Stoim_stanka, Srok_sl, Kol_prod, Stoim_mater, Stoim_kompl, Stoim_vspom_mater, Toplivo, Zaprl,
	Pr_rash, Kol_detal, Mat_zatr, Stoim_mater_1, Stoim_kompl_1, Stoim_vspom_mater_1, Toplivo_1, Otch, Pens, Medic, 
	Soc_strah, Zaprl_1, Amort_1, Pr_rash_1, Itogo;
	static String Name;
	/* Переменные типа double - с плавающей точкой. служат для представления чисел, имеющих дробную часть */
	/*static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
	отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
	и переменным можно обращаться через имя класса.*/

	public static void Smeta_gettext() {/*Класс Smeta_gettext, который доступен для любого файла из пакета pack */
		/*  Модификатор доступа public означает, что метод виден и доступен любому классу.
	    static означает, что не нужно создавать экземпляр(копию) объекта в памяти, чтобы использовать этот метод.
	    void означает, что метод не возвращает данных в программу, которая его вызвала.
	    Метод с пустыми скобками, это означает, что метод не имеет аргументов(параметров)
	    */
		if (Index.Ras_amort_int==0){ //если флажок Рассчитать был выключен
			Amort = Double.parseDouble(Index.Amort_text.getText());/* В переменную записываются данные введеные 
			пользователем в текстовое поле которое расположено в файле Index. Преобразование данных в тип Double. */
		} else {
			Stoim_stanka = Double.parseDouble(Index.Stoim_stanka_text.getText());
			Srok_sl = Double.parseDouble(Index.Srok_sl_text.getText());
		}
		Kol_prod = Double.parseDouble(Index.Kol_prod_text.getText());
		Stoim_mater = Double.parseDouble(Index.Stoim_mater_text.getText());	
		Stoim_kompl = Double.parseDouble(Index.Stoim_kompl_text.getText());	
		Stoim_vspom_mater = Double.parseDouble(Index.Stoim_vspom_mater_text.getText());	
		Toplivo = Double.parseDouble(Index.Toplivo_text.getText());	
		Zaprl = Double.parseDouble(Index.Zaprl_text.getText());	
		Pr_rash = Double.parseDouble(Index.Pr_rash_text.getText());	
		Kol_detal = Double.parseDouble(Index.Kol_detal_text.getText());	
		/* В переменную  записываются данные введеные пользователем в текстовое поле которое расположено в файле Index.
		Преобразование данных в тип Double. */
		
		if (Index.Name_int==0) {Name="столы";} //Name_int-переменная которая отвечает за выпадающий список.
		else if (Index.Name_int==1) {Name="стулья";} 
		else if (Index.Name_int==2) {Name="шкафы";}
		else if (Index.Name_int==2) {Name="кровати";} 
		else {Name="тумбы";} 
		
	}
	
	
	
	
}
