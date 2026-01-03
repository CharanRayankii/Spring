package com.Rc.example1.FactoryClasses;

import com.Rc.example1.beans.BoshTyres;
import com.Rc.example1.beans.MachelinTyres;
import com.Rc.example1.beans.Tyres;

public class TyreFactory {
	public Tyres getTyres(String tyreType)
	{
		if(tyreType.equalsIgnoreCase("Bosh"))
		{
			return new BoshTyres();
		}else {
			return new MachelinTyres();
		}
	}

}
