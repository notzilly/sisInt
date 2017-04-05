package representation;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;
 import colibristudio.annotations.JCOLIBRIAttributeType;


public class SolCaso implements CaseComponent { 


	/* Generated Class. Please Do Not Modify... */ 


	private java.lang.Integer SolId;


	public java.lang.Integer getSolId()
		{
			return SolId;
		}
	public void setSolId(java.lang.Integer SolId8)
		{
			this.SolId = SolId8;
		}

	private java.lang.Boolean AceitouTruco;


	public java.lang.Boolean getAceitouTruco()
		{
			return AceitouTruco;
		}
	public void setAceitouTruco(java.lang.Boolean AceitouTruco9)
		{
			this.AceitouTruco = AceitouTruco9;
		}

	private java.lang.Boolean PediuRetruco;


	public java.lang.Boolean getPediuRetruco()
		{
			return PediuRetruco;
		}
	public void setPediuRetruco(java.lang.Boolean PediuRetruco10)
		{
			this.PediuRetruco = PediuRetruco10;
		}


	@Override
	public Attribute getIdAttribute()
		{
			return new Attribute("SolId",this.getClass());
		} 

	public String toString()		{
			return "["+ AceitouTruco + " , " + SolId + " , " + PediuRetruco +"]";
		}

}
