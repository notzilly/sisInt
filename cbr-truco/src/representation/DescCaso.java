package representation;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;
 import colibristudio.annotations.JCOLIBRIAttributeType;


public class DescCaso implements CaseComponent { 


	/* Generated Class. Please Do Not Modify... */ 


	private java.lang.Integer CasoId;


	public java.lang.Integer getCasoId()
		{
			return CasoId;
		}
	public void setCasoId(java.lang.Integer CasoId0)
		{
			this.CasoId = CasoId0;
		}

	private java.lang.Integer PontosMeus;


	public java.lang.Integer getPontosMeus()
		{
			return PontosMeus;
		}
	public void setPontosMeus(java.lang.Integer PontosMeus1)
		{
			this.PontosMeus = PontosMeus1;
		}

	private java.lang.Integer PontosAdv;


	public java.lang.Integer getPontosAdv()
		{
			return PontosAdv;
		}
	public void setPontosAdv(java.lang.Integer PontosAdv2)
		{
			this.PontosAdv = PontosAdv2;
		}

	private java.lang.Integer Carta1;


	public java.lang.Integer getCarta1()
		{
			return Carta1;
		}
	public void setCarta1(java.lang.Integer Carta13)
		{
			this.Carta1 = Carta13;
		}

	private java.lang.Integer Carta2;


	public java.lang.Integer getCarta2()
		{
			return Carta2;
		}
	public void setCarta2(java.lang.Integer Carta24)
		{
			this.Carta2 = Carta24;
		}

	private java.lang.Integer Carta3;


	public java.lang.Integer getCarta3()
		{
			return Carta3;
		}
	public void setCarta3(java.lang.Integer Carta35)
		{
			this.Carta3 = Carta35;
		}

	private java.lang.Integer RodAtual;


	public java.lang.Integer getRodAtual()
		{
			return RodAtual;
		}
	public void setRodAtual(java.lang.Integer RodAtual6)
		{
			this.RodAtual = RodAtual6;
		}

	private java.lang.Integer RodGanhas;


	public java.lang.Integer getRodGanhas()
		{
			return RodGanhas;
		}
	public void setRodGanhas(java.lang.Integer RodGanhas7)
		{
			this.RodGanhas = RodGanhas7;
		}


	@Override
	public Attribute getIdAttribute()
		{
			return new Attribute("CasoId",this.getClass());
		} 

	public String toString()		{
			return "["+ Carta2 + " , " + Carta1 + " , " + RodGanhas + " , " + Carta3 + " , " + CasoId + " , " + RodAtual + " , " + PontosMeus + " , " + PontosAdv +"]";
		}

}
