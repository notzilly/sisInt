package representation;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;
 import colibristudio.annotations.JCOLIBRIAttributeType;


public class DescCaso implements CaseComponent { 


	/* Generated Class. Please Do Not Modify... */ 


	private java.lang.Integer CaseId;


	public java.lang.Integer getCaseId()
		{
			return CaseId;
		}
	public void setCaseId(java.lang.Integer CaseId0)
		{
			this.CaseId = CaseId0;
		}

	private java.lang.Integer Player1Pontos;


	public java.lang.Integer getPlayer1Pontos()
		{
			return Player1Pontos;
		}
	public void setPlayer1Pontos(java.lang.Integer Player1Pontos1)
		{
			this.Player1Pontos = Player1Pontos1;
		}

	private java.lang.Integer Player2Pontos;


	public java.lang.Integer getPlayer2Pontos()
		{
			return Player2Pontos;
		}
	public void setPlayer2Pontos(java.lang.Integer Player2Pontos2)
		{
			this.Player2Pontos = Player2Pontos2;
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

	private java.lang.Integer RodadaAtual;


	public java.lang.Integer getRodadaAtual()
		{
			return RodadaAtual;
		}
	public void setRodadaAtual(java.lang.Integer RodadaAtual6)
		{
			this.RodadaAtual = RodadaAtual6;
		}

	private java.lang.Integer RodadasGanhas;


	public java.lang.Integer getRodadasGanhas()
		{
			return RodadasGanhas;
		}
	public void setRodadasGanhas(java.lang.Integer RodadasGanhas7)
		{
			this.RodadasGanhas = RodadasGanhas7;
		}

	private java.lang.Boolean AceitouTruco;


	public java.lang.Boolean getAceitouTruco()
		{
			return AceitouTruco;
		}
	public void setAceitouTruco(java.lang.Boolean AceitouTruco8)
		{
			this.AceitouTruco = AceitouTruco8;
		}

	private java.lang.Boolean PediuRetruco;


	public java.lang.Boolean getPediuRetruco()
		{
			return PediuRetruco;
		}
	public void setPediuRetruco(java.lang.Boolean PediuRetruco9)
		{
			this.PediuRetruco = PediuRetruco9;
		}


	@Override
	public Attribute getIdAttribute()
		{
			return new Attribute("CaseId",this.getClass());
		} 

	public String toString()		{
			return "["+ Carta2 + " , " + RodadaAtual + " , " + AceitouTruco + " , " + Carta1 + " , " + Carta3 + " , " + Player1Pontos + " , " + RodadasGanhas + " , " + Player2Pontos + " , " + CaseId + " , " + PediuRetruco +"]";
		}

}
